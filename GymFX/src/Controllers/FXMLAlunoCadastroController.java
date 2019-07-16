package Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.control.ProgressIndicator;

public class FXMLAlunoCadastroController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ProgressIndicator piAlunoCad;

    @FXML
    private Button btnSalvar;

    @FXML
    private Button btnCancelar;

    @FXML
    private DialogPane dialogResumo;

    @FXML
    void initialize() {
        assert piAlunoCad != null : "fx:id=\"piAlunoCad\" was not injected: check your FXML file 'FXMLAlunoCadastro.fxml'.";
        assert btnSalvar != null : "fx:id=\"btnSalvar\" was not injected: check your FXML file 'FXMLAlunoCadastro.fxml'.";
        assert btnCancelar != null : "fx:id=\"btnCancelar\" was not injected: check your FXML file 'FXMLAlunoCadastro.fxml'.";
        assert dialogResumo != null : "fx:id=\"dialogResumo\" was not injected: check your FXML file 'FXMLAlunoCadastro.fxml'.";

    }
}
