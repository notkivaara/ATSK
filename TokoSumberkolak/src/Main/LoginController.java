/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author ACER
 */
public class LoginController implements Initializable {

    @FXML
    private ImageView logo_image;
    @FXML
    private TextField txt_username;
    @FXML
    private PasswordField txt_password;
    @FXML
    private Button btnLogin;
    @FXML
    private Hyperlink link_lupaPassword;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnLogin_Clicked(ActionEvent event) {
    }
    
}
