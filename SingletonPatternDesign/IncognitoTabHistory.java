/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author neuceda
 */
public class IncognitoTabHistory {
    private static IncognitoTabHistory uniqueInstance;
    private UrlVisited url;
    
    private IncognitoTabHistory(){
        this.url = new UrlVisited(new String());
    }
    
    public static synchronized IncognitoTabHistory getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new IncognitoTabHistory();
        }
        return uniqueInstance;
    }
    
    public void addUrl(UrlVisited url){
        Date dateForUrl  = new Date();
        DateFormat dateFormat =  new SimpleDateFormat("dd/MM/yyyy");
        String urlConcat = url + "-" + dateFormat.format(dateForUrl) +"\n";
        urlConcat = urlConcat.concat(this.url.getNewUrl());
        this.url.setNewUrl(urlConcat);
    }
    
    public String showHistory(){
        return this.url.getNewUrl();
    }

    
}
