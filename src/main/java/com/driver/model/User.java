package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id ;

    private String name;

    private String phoneNumber;

    private String password;

    @OneToMany(mappedBy = "user" ,cascade = CascadeType.ALL)
    private List<Reservation> reservationEntityList = new ArrayList<>();
    public User(String name, String phoneNumber, String password) {

        this.name = name;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public List<Reservation> getReservationList() {
        return reservationEntityList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationEntityList = reservationList;
    }
}