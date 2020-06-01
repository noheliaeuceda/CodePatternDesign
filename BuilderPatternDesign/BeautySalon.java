/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author neuceda
 */
public class BeautySalon {
    
    private String nailPolish;
    private PolishType polishType;

    public BeautySalon() {
    }

    @Override
    public String toString() {
        return "BeautySalon{" + "nailPolish=" + nailPolish + ", polishType=" + polishType + '}';
    }
    
    

    public String getNailPolish() {
        return nailPolish;
    }

    public void setNailPolish(String nailPolish) {
        this.nailPolish = nailPolish;
    }

    public PolishType getPolishType() {
        return polishType;
    }

    public void setPolishType(PolishType polishType) {
        this.polishType = polishType;
    }
    
    
    
}
