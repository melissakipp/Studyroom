package com.examples.exercises.section_7.computer;

public class PC {
    private Case theCase; // Composition
    private Monitor monitor; // Composition
    private Motherboard motherboard; // Composition

    // Create a constructor that will accept three objects

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        // Fancy graphics
        monitor.drawPixelAt(1200,50,"yellow");
    }

}
