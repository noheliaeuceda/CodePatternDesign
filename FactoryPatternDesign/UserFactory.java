/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author neuceda
 */
public class UserFactory {
    
    
    public User buildUser(String username, UserType userType){
        if(userType == UserType.ADMIN){
            return new AdminUser(username,UserType.ADMIN);
        }else if(userType == UserType.VIEWER){
            return new ViewerUser(username,UserType.VIEWER);
        }else{
            return new EditorUser(username,UserType.EDITOR);
        }
    }
    
}
