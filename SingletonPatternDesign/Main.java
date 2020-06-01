/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author neuceda
 */
public class Main {
    public static void main(String[] args) {
        User user = new User("Incognito user");
        UrlVisited newUrl = new UrlVisited("www.google.com");
        UrlVisited newUrl2 = new UrlVisited("www.pepito.com");
        Navigation navigation = new Navigation(user);
        navigation.addUrl(newUrl);
        navigation.addUrl(newUrl2);
        System.out.println(navigation.getHistorical());
    }
    
}
