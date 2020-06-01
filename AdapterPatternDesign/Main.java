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
        MicrosoftWord document = new MWDocument();
        document.read("file.docx");
        
        document = new DocumentAdapter(new FODocument());
        document.read("file.opt");
        
    }
    
}
