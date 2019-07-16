package Controllers;

import Main.Login;
import Main.Principal;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class FXMLoginController implements Initializable {
    // mapeamento de componentes.
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
    private ImageView imgv;
    @FXML
    private Label lbAcademia;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        txtLogin.setFocusTraversable(true);
        btnEntrar.setOnMouseClicked((MouseEvent e) -> {
            logar();
        });
        btnEntrar.setOnKeyPressed((KeyEvent e) -> {
            if (e.getCode() == KeyCode.ENTER) {
                logar();
            }
        });

        txtLogin.setOnKeyPressed((KeyEvent e) -> {
            if (e.getCode() == KeyCode.ENTER) {
                logar();
            }
        });
        txtSenha.setOnKeyPressed((KeyEvent e) -> {
            if (e.getCode() == KeyCode.ENTER) {
                logar();
            }
        });

        btnSair.setOnMouseClicked((MouseEvent e) -> {
            fecharTela();
        });

        btnSair.setOnKeyPressed((KeyEvent e) -> {
            if (e.getCode() == KeyCode.ENTER) {
                fecharTela();
            }
        });
    }

    public void fecharTela() {
        Login.getStage().close();
    }

    public void logar() {
        // implementar validação de usuarios 
        if (txtLogin.getText().equals("igor")) {
            Principal principal = new Principal();
            fecharTela();
            try {
                principal.start(new Stage());
            } catch (Exception ex) {
                Logger.getLogger(FXMLoginController.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setHeaderText("Login inválido");
            alert.setTitle("Erro");
            alert.setContentText("Login ou senha inválidos, confira e tente novamente!");
            alert.show();
        }

    }

}
