/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author neuceda
 */
public class UrlVisited {
    protected String newUrl;

    public UrlVisited(String newUrl) {
        this.newUrl = newUrl;
    }

    public void setNewUrl(String newUrl) {
        this.newUrl = newUrl;
    }

    public String getNewUrl() {
        return newUrl;
    }

    @Override
    public String toString() {
        return "urlVisited{" + "newUrl=" + newUrl + '}';
    }
    
    
    
}
