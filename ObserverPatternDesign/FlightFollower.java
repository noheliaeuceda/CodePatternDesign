/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author neuceda
 */
public class FlightFollower implements PostObserver {

    protected String name;

    public FlightFollower(String name) {
        this.name = name;
    }

    @Override
    public void update(FlightPost flight) {
        System.out.println(this.name + " got your new flight post " + flight);
    }

}
