package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class FXMLTelaPrincipalController {

    @FXML
    private AnchorPane root;

    @FXML
    private CheckBox cb2;

    @FXML
    private CheckBox cb1;

    @FXML
    private DialogPane dialog;

    @FXML
    private RadioButton radio1;

    @FXML
    private RadioButton radio2;

    @FXML
    private Label label2;

    @FXML
    private Label label1;

    @FXML
    private TableView<?> Tablee;

    @FXML
    private TableColumn<?, String> colunaNome;

    @FXML
    private TableColumn<?, String> colunaSobrenome;

    @FXML
    private Label labelTab;

    @FXML
    private DatePicker datePicker;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtSobrenome;

    @FXML
    private Button btnEnviar;

    @FXML
    void btnEnviarClick(ActionEvent event) {
        if (cb1.isSelected()) {
           // Tablee.setItems(FXCollections.observableArrayList(new Pessoa(txtNome.getText(), txtSobrenome.getText())));
        }
    
    }


    @FXML
    void cb1(ActionEvent event) {

    }

    @FXML
    void cb2(ActionEvent event) {

    }

}