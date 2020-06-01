/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author neuceda
 */
public class Navigation {
    protected User user;
    protected UrlVisited urlVisited;

    public Navigation(User user) {
        this.user = user;
    }
    
    public void addUrl(UrlVisited url){
        IncognitoTabHistory.getInstance().addUrl(url);
    }
    
    public String getHistorical(){
        return IncognitoTabHistory.getInstance().showHistory();
    }
    
}
