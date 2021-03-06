package entity;
// Generated Mar 31, 2018 4:31:12 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User  implements java.io.Serializable {


     private String id;
     private String userName;
     private String password;
     private String firstName;
     private String lastName;
     private boolean role;
     private boolean active;
     private String address;
     private String email;
     private Boolean gender;
     private Set bookings = new HashSet(0);

    public User() {
    }

	
    public User(String id, String userName, String password, boolean role, boolean active) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.role = role;
        this.active = active;
    }
    public User(String id, String userName, String password, String firstName, String lastName, boolean role, boolean active, String address, String email, Boolean gender, Set bookings) {
       this.id = id;
       this.userName = userName;
       this.password = password;
       this.firstName = firstName;
       this.lastName = lastName;
       this.role = role;
       this.active = active;
       this.address = address;
       this.email = email;
       this.gender = gender;
       this.bookings = bookings;
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
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
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
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Boolean getGender() {
        return this.gender;
    }
    
    public void setGender(Boolean gender) {
        this.gender = gender;
    }
    public Set getBookings() {
        return this.bookings;
    }
    
    public void setBookings(Set bookings) {
        this.bookings = bookings;
    }




}


