package Controllers;

import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.util.Duration;

public class FXMLTelaPrincipalController implements Initializable {

    @FXML
    private Pane painelRodapeDataHora;
    @FXML
    private Label lblData;
    @FXML
    private Label lblHora;
    @FXML
    private Label lblVersaoSistema;
    @FXML
    private Label lblEmpresa;

    @FXML
    private ResourceBundle resources;
    @FXML
    private AnchorPane archorpane;
    @FXML
    private Button btnData;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //     btnData.setOnMouseClicked((MouseEvent e) -> {
        //AtualizaDataHora();
        //       lblData.setText("teste");
        //     });
        AtualizaDataHora();
    }

    public void AtualizaDataHora() {
        // criamos a fonte usando o método de fábrica.
        Font font = Font.font("Arial", FontWeight.EXTRA_BOLD, 18);
        lblHora.setFont(font);
        // vamos colocar um pequeno efeito no label pra deixar ele bonitin
        lblHora.setEffect(new DropShadow(10, Color.CADETBLUE));
        // agora ligamos um loop infinito que roda a cada segundo e atualiza nosso label chamando atualizaHoras.
        KeyFrame frame = new KeyFrame(Duration.millis(1000), e -> atualizaHoras());
        Timeline timeline = new Timeline(frame);
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    private void atualizaHoras() {
        Date data = (Date) Calendar.getInstance().getTime();
        DateFormat d = DateFormat.getDateInstance();
        DateFormat h = DateFormat.getTimeInstance();
        lblData.setText(d.format(data));
        lblHora.setText(h.format(data));
    }
}
