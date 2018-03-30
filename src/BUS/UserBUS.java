package BUS;

import DAO.UserDAO;
import entity.User;

public class UserBUS {
    
   private UserDAO userDao;
     
    public UserBUS(){
        userDao = new UserDAO();
    }
    
    public  int Login(String userName, String PassWord){
        
        try {
            
             User user = userDao.Login(userName);
             
             if (user.getPassword().equals(PassWord)) {
                 
                 if ( user.isActive()== true)
                     return 1;
                 else                     
                        return -1;
             }
             else
                 return -2;
                 
        } catch (Exception e) {
            return 0;
        }
    }
    
  
    
    
    
    
}
