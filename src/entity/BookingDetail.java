package entity;
// Generated Mar 31, 2018 4:31:12 PM by Hibernate Tools 4.3.1



/**
 * BookingDetail generated by hbm2java
 */
public class BookingDetail  implements java.io.Serializable {


     private String bookingId;
     private Booking booking;
     private Concept concept;
     private Menu menu;
     private Room room;
     private Service service;
     private Byte quantity;
     private String price;
     private String discount;

    public BookingDetail() {
    }

	
    public BookingDetail(Booking booking, Room room) {
        this.booking = booking;
        this.room = room;
    }
    public BookingDetail(Booking booking, Concept concept, Menu menu, Room room, Service service, Byte quantity, String price, String discount) {
       this.booking = booking;
       this.concept = concept;
       this.menu = menu;
       this.room = room;
       this.service = service;
       this.quantity = quantity;
       this.price = price;
       this.discount = discount;
    }
   
    public String getBookingId() {
        return this.bookingId;
    }
    
    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }
    public Booking getBooking() {
        return this.booking;
    }
    
    public void setBooking(Booking booking) {
        this.booking = booking;
    }
    public Concept getConcept() {
        return this.concept;
    }
    
    public void setConcept(Concept concept) {
        this.concept = concept;
    }
    public Menu getMenu() {
        return this.menu;
    }
    
    public void setMenu(Menu menu) {
        this.menu = menu;
    }
    public Room getRoom() {
        return this.room;
    }
    
    public void setRoom(Room room) {
        this.room = room;
    }
    public Service getService() {
        return this.service;
    }
    
    public void setService(Service service) {
        this.service = service;
    }
    public Byte getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(Byte quantity) {
        this.quantity = quantity;
    }
    public String getPrice() {
        return this.price;
    }
    
    public void setPrice(String price) {
        this.price = price;
    }
    public String getDiscount() {
        return this.discount;
    }
    
    public void setDiscount(String discount) {
        this.discount = discount;
    }




}


