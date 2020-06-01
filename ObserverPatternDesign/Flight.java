/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Date;

/**
 *
 * @author neuceda
 */
public class Flight {
    protected String origin;
    protected String destination;
    protected Date flightDate;
    protected double price;

    public Flight(String origin, String destination, Date flightDate, double price) {
        this.origin = origin;
        this.destination = destination;
        this.flightDate = flightDate;
        this.price = price;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(Date flightDate) {
        this.flightDate = flightDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flight" + "origin=" + origin + ", destination=" + destination + ", flightDate=" + flightDate + ", price=" + price;
    }
    
    
    
    
}
