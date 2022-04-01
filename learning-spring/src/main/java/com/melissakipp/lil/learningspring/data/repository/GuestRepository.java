package com.melissakipp.lil.learningspring.data.repository;
import com.melissakipp.lil.learningspring.data.entity.Guest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {
}
