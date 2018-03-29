package Login;
import DAO.UserDAO;
import entity.User;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FXMLLoginController implements Initializable {
    
    @FXML
    private TextField txtUser;
    @FXML
    private TextField txtPassWord;
        
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {       
         
    }    

    @FXML
    private void loginAction(ActionEvent event) throws IOException {
        
        
        
//         Parent root = FXMLLoader.load(getClass().getResource("/main/FXMLMain.fxml"));        
//        Scene scene = new Scene(root);
//        Stage stage=new Stage();
//        stage.setScene(scene);       
//        stage.show();
     //   UserDAO user = new UserDAO();
      //   User a = user.find("US1");
        // txtUser.setText(a.getUserName());      

    }

    @FXML
    private void exitAction(ActionEvent event) {
        
        Alert alert = new Alert(Alert.AlertType.WARNING, "Are you sure ?");
       
       alert.setTitle("Exit");
        alert.setHeaderText(null); // không thiết lập thông tin header    
        ButtonType btnOK = ButtonType.OK; // tạo btn OK
         ButtonType btnCancel = new ButtonType("Cancel", ButtonData.CANCEL_CLOSE); // tạo button cancel
         alert.getButtonTypes().setAll(btnOK, btnCancel);
           Optional<ButtonType> result = alert.showAndWait();
         if(result.get() == btnOK)
              Platform.exit();
    }
    
}
