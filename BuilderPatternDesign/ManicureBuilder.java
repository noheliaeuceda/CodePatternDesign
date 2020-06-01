/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author neuceda
 */
public class ManicureBuilder extends Builder {

    public ManicureBuilder() {
    }

    @Override
    public void buildNailPolish(String nailPolish) {
        super.bsOrder.setNailPolish(nailPolish);
    }
    
    @Override
    public void buildPolishType(PolishType polishType) {
        super.bsOrder.setPolishType(polishType);
    }
}
