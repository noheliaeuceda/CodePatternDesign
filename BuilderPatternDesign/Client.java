/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author neuceda
 */
public class Client {
    public static void main(String[] args) {
        Stylist stylist = new Stylist();
        Builder manicureBuilder = new ManicureBuilder();
        stylist.setBuilder(manicureBuilder);
        stylist.constructBeautySalonOrder("Red", PolishType.GEL);
        
        BeautySalon order = stylist.getBuilderOrder();
        System.out.println(order);
    }
}
