package Controllers;

import Main.Login;
import Main.Principal;
import java.io.IOException;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXML; import javafx.fxml.FXMLLoader;import javafx.scene.Parent;
import javafx.scene.Scene;import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import jfxtras.styles.jmetro8.JMetro;




public class FXMLoginController {

    @FXML
    private AnchorPane apLogin;

    @FXML
    private Button btnEntrar;

    @FXML
    private TextField txtLogin;

    @FXML
    private PasswordField txtSenha;

    @FXML
    private Label lbLogin;

    @FXML
    private Label lbSenha;

    @FXML
    private Button btnSair;

    @FXML
    void btnEntrarClick(ActionEvent event) throws IOException, Exception {
        // validação de login 
        if (txtLogin.getText().equals("igor")) {
            Principal p = new Principal();
             
            p.start(new Stage()); 
            fechar();
        }     
    }
    
    @FXML
    void btnSairClick(ActionEvent event) throws IOException {
        // fecha tudo
        System.exit(0);
    }
    
    void fechar(){
        Login.getStage().close();
    }

}
