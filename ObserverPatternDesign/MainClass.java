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
public class MainClass {
    public static void main(String[] args) {
        FlightPublisher publisher = new FlightPublisher();
        publisher.registerObserver(new FlightFollower("Nohelia"));
        publisher.registerObserver(new FlightFollower("Roman"));
        publisher.registerObserver(new FlightFollower("Crystel"));
        
        publisher.addFlight(new Flight("IAH: Huston, Texas", "TEG: Tegucigalpa, Honduras", new Date(), 125.00));
    }
}
