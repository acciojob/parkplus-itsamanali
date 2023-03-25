package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Spot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int pricePerHour;

    private Boolean occupied;

    @ManyToOne
    @JoinColumn
    private ParkingLot parkingLot;

    @OneToMany(mappedBy = "spot", cascade = CascadeType.ALL)
    private List<Reservation> reservationEntityList = new ArrayList<>();


    SpotType spotType;

    public Spot() {
    }

    public Spot(SpotType spotType, int pricePerHour, boolean occupied, ParkingLot parkingLot, List<Reservation> reservationList) {
        this.spotType = spotType;
        this.pricePerHour = pricePerHour;
        this.occupied = occupied;
        this.parkingLot = parkingLot;
        this.reservationEntityList = reservationList;
    }
    public Spot(SpotType spotType, int pricePerHour, boolean occupied) {
        this.spotType = spotType;
        this.pricePerHour = pricePerHour;
        this.occupied = occupied;
    }

    public int getId() {
        return id;
    }

    public int getPricePerHour() {
        return pricePerHour;
    }

    public Boolean getOccupied() {
        return occupied;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPricePerHour(int pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public void setOccupied(Boolean occupied) {
        this.occupied = occupied;
    }
    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public List<Reservation> getReservationList() {
        return reservationEntityList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationEntityList = reservationList;
    }

    public void setSpotType(SpotType spotType) {
        this.spotType = spotType;
    }

    public SpotType getSpotType() {
        return spotType;
    }
}