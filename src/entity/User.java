package entity;
public class User  implements java.io.Serializable {

     private String id;
     private String userName;
     private String password;
     private boolean role;
     private boolean active;
     
    public User() {
    }

    public User(String id, String userName, String password, boolean role, boolean active) {
       this.id = id;
       this.userName = userName;
       this.password = password;
       this.role = role;
       this.active = active;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean isRole() {
        return this.role;
    }
    
    public void setRole(boolean role) {
        this.role = role;
    }
    public boolean isActive() {
        return this.active;
    }
    
    public void setActive(boolean active) {
        this.active = active;
    }




}


