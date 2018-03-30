//
//import DAO.UserDAO;
//import entity.User;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Optional;
//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
///**
// *
// * @author USER
// */
//public class NewClass {
//    
//    public static void main(String[] args) {
//        System.out.println("NewClass.main()");
//        
//        UserDAO userDao = new UserDAO();
//        
//        //Optional<User>
//        User user = userDao.Login("Tình");
//        System.out.println(user.getUserName() + " " + user.getPassword());
//       //List<User> result = userDao.Login();
//       
////      for(User g : result )
////      {
////           System.out.println("====");
////            System.out.println(g.getPassword()+ " " + g.getUserName());
////      }
////       Iterator iterator = result.iterator();
////        while (iterator.hasNext()) {
////            User a = (User)iterator.next();
////            System.out.println("====");
////            System.out.println(a.getPassword()+ " " + a.getUserName());
////        }
//       // System.out.println(user.getPassword());
//    }
//    
//}
