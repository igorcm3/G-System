package Controllers;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class FXMLoginController {

    @FXML
    private Button button;

    @FXML
    private Label lbLogin;

    @FXML
    private Label lbSenha;

    @FXML
    void handleButtonAction(ActionEvent event) throws IOException {
        Stage s1 = new Stage();
        // Parent root1 = FXMLLoader.load(getClass().getResource("FXMLLogin.fxml"));  tem que usar os parametros abaixo apra funfar
        Parent root1 = FXMLLoader.load(getClass().getClassLoader().getResource("FXMLTelaPrincipal.fxml")); 
        Scene scene = new Scene(root1);
        
        s1.setScene(scene);
        scene.setRoot(root1);
        s1.show(); 
}
}
