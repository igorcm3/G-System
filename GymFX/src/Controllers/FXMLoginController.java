package Controllers;

import java.io.IOException;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXML; import javafx.fxml.FXMLLoader;import javafx.scene.Parent;
 import
 javafx.scene.Scene;import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import static javafx.scene.input.DataFormat.URL;
 import
 javafx.stage.Stage;
import javax.tools.DocumentationTool;
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
    void btnEntrarClick(ActionEvent event) throws IOException {
        // validação de login 
        if (txtLogin.getText().equals("igor")) {
            AbrirMenuPrincipal();
            hideLogin();
        }     
    }
    
    @FXML
    void btnSairClick(ActionEvent event) throws IOException {
        // fecha tudo
        System.exit(0);
    }
    
    
    void AbrirMenuPrincipal() throws IOException{
        Stage s1 = new Stage();
        URL url = getClass().getResource("FXMLTelaPrincipal.fxml");
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);
        new JMetro(JMetro.Style.LIGHT).applyTheme(root);
        s1.setScene(scene);
        s1.show(); 
    }
    void hideLogin(){
    // função para esconder a tela de login
        Scene login = apLogin.getScene();
        Stage s = new Stage();
        s.setScene(login);
        s.close();
        s.hide();
    }

}
