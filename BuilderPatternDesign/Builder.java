/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author neuceda
 */
public abstract class Builder {
    protected BeautySalon bsOrder;

    public BeautySalon getBs() {
        return bsOrder;
    }
    
    public void createOrderBeautySalon(){
        bsOrder = new BeautySalon();
        System.out.println("There's a new order");
    }
    
    public abstract void buildNailPolish(String nailPolish);
    public abstract void buildPolishType(PolishType polishType);
}
