/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author neuceda
 */
public class DocumentAdapter implements MicrosoftWord {

    private FreeOffice document;

    public DocumentAdapter(FreeOffice document) {
        this.document = document;
    }

    @Override
    public void read(String filename) {
        System.out.print("Adapting File --> ");
        document.read(filename);
    }

}
