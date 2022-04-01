package com.frankmoley.lil.learning_spring.webservice;

import java.util.Date;
import java.util.List;

import com.frankmoley.lil.learning_spring.business.ReservationService;
import com.frankmoley.lil.learning_spring.business.RoomReservation;
import com.frankmoley.lil.learning_spring.data.Guest;
import com.frankmoley.lil.learning_spring.data.Room;
import com.frankmoley.lil.learning_spring.util.DateUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class WebserviceController {
    private final DateUtils dateUtils;
    private final ReservationService reservationService;

    public WebserviceController(DateUtils dateUtils, ReservationService reservationService) {
        this.dateUtils = dateUtils;
        this.reservationService = reservationService;

    }

    @RequestMapping(path="/reservations", method = RequestMethod.GET)
    public List<RoomReservation> getReservations(@RequestParam(value="date", required = false)String dateString){
        Date date = this.dateUtils.createDateFromDateString(dateString);
        return this.reservationService.getRoomReservationsForDate(date);
    }

    @GetMapping("/guests")
    public List<Guest> getGuest() {
        return this.reservationService.getHotelGuests();
    }

    @PostMapping("/guests")
    @ResponseStatus(HttpStatus.CREATED)
    public void addGuest(@RequestBody Guest guest) {
        this.reservationService.addGuest(guest);
    }

    @GetMapping("/rooms")
    public List<Room> getRooms() {
        return this.reservationService.getRooms();
    }
}

