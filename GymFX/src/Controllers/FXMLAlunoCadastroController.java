package Controllers;

import Main.AlunoCadastro;
import Models.Aluno;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class FXMLAlunoCadastroController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtCpf;

    @FXML
    private TextField txtCel;

    @FXML
    private TextField txtCodigoPersonal;

    @FXML
    private TextField infoEndereco;

    @FXML
    private ComboBox<?> comboMensalidade;

    @FXML
    private Button btnSalvar;

    @FXML
    private Button btnCancelar;

    @FXML
    private Label lblTitulo;

    @FXML
    private Label lblNome;

    @FXML
    private Label lblCpf;

    @FXML
    private Label lblSexo;

    @FXML
    private Label lblCel;

    @FXML
    private Label lblPersonal;

    @FXML
    private Label lblEndereco;

    @FXML
    private Label lblMensalidade;

    @FXML
    private Button btnEndereco;

    @FXML
    private Button btnNovaMensalidade;

    @FXML
    private RadioButton rbMasc;

    @FXML
    private RadioButton rbFem;

    @FXML
    private Label lblMedidas;

    @FXML
    private TextField txtInfoPersonal;

    @FXML
    private Button btnMedidas;

    @FXML
    void initialize() {

        btnSalvar.setOnMouseClicked((MouseEvent e) -> {
            Aluno aluno = new Aluno();
            AlunoDao alunoDao = new AlunoDao();
        });

    }
}
