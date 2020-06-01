/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author neuceda
 */
public class Solid implements H2O{
    @Override
    public void thePhase(H20Context context) {
        System.out.println("H2O is solid");
        context.setState(new Plasma());
    }
}
