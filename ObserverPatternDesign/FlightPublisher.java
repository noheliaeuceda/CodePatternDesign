/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author neuceda
 */
public class FlightPublisher implements FlightPost {

    protected ArrayList<PostObserver> usersList;
    protected ArrayList<Flight> flights;

    public FlightPublisher() {
        this.usersList = new ArrayList<PostObserver>();
        this.flights = new ArrayList<Flight>();
    }

    @Override
    public void registerObserver(PostObserver user) {
        usersList.add(user);
    }

    @Override
    public void removeObserver(PostObserver user) {
        usersList.remove(user);
    }

    @Override
    public void notifyAllObservers() {
        for (PostObserver u : usersList) {
            u.update(this);
        }
    }

    public void addFlight(Flight flight) {
        this.flights.add(flight);
        notifyAllObservers();
    }

    public ArrayList<Flight> getflights() {
        return flights;
    }

    public String toString() {
        return flights.toString();
    }

}
