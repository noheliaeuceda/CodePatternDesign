/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author neuceda
 */
public class FODocument implements FreeOffice{
    @Override
    public void read(String filename) {
        System.out.println("Reading .opt File: " + filename);
    }
}
