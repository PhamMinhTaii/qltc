
package DAO;
import entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UserDAO {       
    
    private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    private   Session   session ;
    private  Transaction trans;

    public UserDAO() {
        session = sessionFactory.openSession();
        trans = session.beginTransaction();
    }
    
    
    public User find(String iD){
        try {                       
          
             return (User)session.get(User.class, iD);         
        } catch (Exception e) {
            return null;
        }finally{
            session.close();
        }              
    }    
    
    
    public  int Login(String userName, String passWord){
       return 1; 
    }
    
    
    public  boolean insertUser(){
        
        User user = new User("US1","Tình", "pass", true, true);      
        
        try{            
            session.save(user);
            trans.commit();
            return true;
            
        } catch (Exception e) {
            throw e;
        }finally{            
            session.close();
        }
    }
    
    
    
    
}
