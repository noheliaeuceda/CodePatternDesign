/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


/**
 *
 * @author neuceda
 */
public class Main {
    public static void main(String[] args) {
        UserFactory factory = new UserFactory();
        User u = factory.buildUser("Nohelia", UserType.VIEWER);
        System.out.println(u.getUsername() + " " + u.getUserType());
    }
    
}
