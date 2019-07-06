
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class FXMLTelaPrincipalController {

    @FXML
    private Pane painelRodapeDataHora;

    @FXML
    private Label lblData;

    @FXML
    private Label lblHora;

    @FXML
    private ResourceBundle resources;
    @FXML
    private AnchorPane archorpane;
    @FXML
    private Button btnData;

    @FXML
    void initialize() {
        btnData.setOnMouseClicked((MouseEvent e) -> {
            //AtualizaDataHora();
            lblData.setText("teste");
        });

    }

    public void AtualizaDataHora() {
        Thread th = new Thread(() -> {
            while (true) { //roda indefinidamente
                Date data = (Date) Calendar.getInstance().getTime();
                DateFormat d = DateFormat.getDateInstance();
                DateFormat h = DateFormat.getTimeInstance();
                painelRodapeDataHora.getChildren().addAll(lblData, lblHora);
                lblData.setText(d.format(data));
                lblHora.setText(h.format(data));
                try {
                    Thread.sleep(1000); //espera 1 segundo para fazer a nova evolução
                } catch (InterruptedException ex) {
                }
            }
        } //cria uma thread
        );
        th.start();
    }
}
