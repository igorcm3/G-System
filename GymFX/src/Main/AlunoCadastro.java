/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import jfxtras.styles.jmetro8.JMetro;

/**
 *
 * @author coron
 */
public class AlunoCadastro extends Application {
    private static Stage stage;
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/Views/FXMLAlunoCadastro.fxml"));
        new JMetro(JMetro.Style.LIGHT).applyTheme(root);
        Scene scene = new Scene(root);
        stage.setScene(scene); // colcoa FXML em uma cena
        stage.setTitle("G-SYSTEM ACADEMIA BODY MASTER");
        stage.show(); // abre a janela
        setStage(stage);  // guarda o stage no atributo da classe
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
        public static Stage getStage() {
        return stage;
    }

    private void setStage(Stage stage) {
        Principal.stage = stage;
    }
    
}
