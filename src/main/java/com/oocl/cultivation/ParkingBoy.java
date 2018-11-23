package com.oocl.cultivation;

public class ParkingBoy {

    private final ParkingLot parkingLot;
    private String lastErrorMessage;

    public ParkingBoy(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public ParkingTicket park(Car car) {
        ParkingTicket ticket = new ParkingTicket();
        this.parkingLot.parkCar(car, ticket);

        return ticket;
    }

    public Car fetch(ParkingTicket ticket) {

        Car car = this.parkingLot.fetch(ticket);
        if (car.equals(null))
            this.lastErrorMessage = "Unrecognized parking ticket.";
        else
            this.lastErrorMessage = null;
        return car;
    }

    public String getLastErrorMessage() {
        return lastErrorMessage;
    }
}
