/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author neuceda
 */
public interface FlightPost {

    public void registerObserver(PostObserver user);

    public void removeObserver(PostObserver user);

    public void notifyAllObservers();

}
