/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author neuceda
 */
public class H20Context {
    private H2O h2o;

    public H20Context() {
        this.h2o = new Liquid();
    }

    public void setState(H2O h2o) {
        this.h2o = h2o;
    }
    
    public void h20State(){
        h2o.thePhase(this);
    }
    
}
