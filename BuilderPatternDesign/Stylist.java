/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author neuceda
 */
public class Stylist {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public BeautySalon getBuilderOrder() {
        return builder.getBs();
    }
    
    public void constructBeautySalonOrder(String nailPolish, PolishType polishType){
        builder.createOrderBeautySalon();
        builder.buildNailPolish(nailPolish);
        builder.buildPolishType(polishType);
    }
    
    
}
