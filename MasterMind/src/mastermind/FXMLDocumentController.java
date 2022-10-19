/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind;

import com.sun.java.accessibility.util.EventID;
import interfaces.Matches;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;


/**
 *
 * @author Administrador
 */
public class FXMLDocumentController implements Initializable , interfaces.MasterMindViewContract {

    @FXML
    private Label label00;
    @FXML
    private Label label01;
    @FXML
    private Label label02;
    @FXML
    private Label label10;
    @FXML
    private Label label21;
    @FXML
    private Label label31;
    @FXML
    private Label label30;
    @FXML
    private Label label20;
    @FXML
    private Label label40;
    @FXML
    private Label label50;
    @FXML
    private Label label60;
    @FXML
    private Label label61;
    @FXML
    private Label label41;
    @FXML
    private Label label51;
    @FXML
    private Label label11;
    @FXML
    private Label label12;
    @FXML
    private Label label22;
    @FXML
    private Label label32;
    @FXML
    private Label label70;
    @FXML
    private Label label80;
    @FXML
    private Label label90;
    @FXML
    private Label label71;
    @FXML
    private Label label81;
    @FXML
    private Label label91;
    @FXML
    private Label label42;
    @FXML
    private Label label52;
    @FXML
    private Label label62;
    @FXML
    private Label label72;
    @FXML
    private Label label82;
    @FXML
    private Label label92;
    @FXML
    private Label label03;
    @FXML
    private Label label13;
    @FXML
    private Label label23;
    @FXML
    private Label label33;
    @FXML
    private Label label43;
    @FXML
    private Label label53;
    @FXML
    private Label label63;
    @FXML
    private Label label73;
    @FXML
    private Label label83;
    @FXML
    private Label label93;
    @FXML
    private Label label00E;
    @FXML
    private Label label01E;
    @FXML
    private Label label02E;
    @FXML
    private Label label10E;
    @FXML
    private Label label21E;
    @FXML
    private Label label31E;
    @FXML
    private Label label30E;
    @FXML
    private Label label20E;
    @FXML
    private Label label40E;
    @FXML
    private Label label50E;
    @FXML
    private Label label60E;
    @FXML
    private Label label61E;
    @FXML
    private Label label41E;
    @FXML
    private Label label51E;
    @FXML
    private Label label11E;
    @FXML
    private Label label12E;
    @FXML
    private Label label22E;
    @FXML
    private Label label32E;
    @FXML
    private Label label70E;
    @FXML
    private Label label80E;
    @FXML
    private Label label90E;
    @FXML
    private Label label71E;
    @FXML
    private Label label81E;
    @FXML
    private Label label91E;
    @FXML
    private Label label42E;
    @FXML
    private Label label52E;
    @FXML
    private Label label62E;
    @FXML
    private Label label72E;
    @FXML
    private Label label82E;
    @FXML
    private Label label92E;
    @FXML
    private Label label03E;
    @FXML
    private Label label13E;
    @FXML
    private Label label23E;
    @FXML
    private Label label33E;
    @FXML
    private Label label43E;
    @FXML
    private Label label53E;
    @FXML
    private Label label63E;
    @FXML
    private Label label73E;
    @FXML
    private Label label83E;
    @FXML
    private Label label93E;
    @FXML
    private Button botonRojo;
    @FXML
    private Button botonAzul;
    @FXML
    private Button bototnVerde;
    @FXML
    private Button botonAmarillo;
    @FXML
    private MenuBar menuBar;
    @FXML
    private Menu menuFile;
    @FXML
    private MenuItem menuItemExit;
    @FXML
    private Menu menuPartida;
    @FXML
    private MenuItem menuItemIniciar;
    @FXML
    private Menu menuHelp;
    @FXML
    private MenuItem menuItemInfo;
    @FXML
    private MenuItem menuItemAbout;
    @FXML
    private AnchorPane anchorPane;
    
    Map<Matches,Integer>mapa;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    public void closeGame() {
        System.exit(0);
    }

    @FXML
    private void mostrarAbout(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("About");
        alert.setContentText("Version 1.0.0\n"
                + "Autores: Eric , Edgar y Pau");
        alert.showAndWait();
    }

    @FXML
    private void mostrarInformacion(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Informacion");
        alert.setContentText("El joc consisteix a trobar la combinació de fitxes de colors oculta."
                + " Començant per la part superior, cada filera de forats determina un torn de la partida. "
                + "En cada torn hem d'arrastrar fitxes de colors en tots els huecos i tocar o fer clic als"
                + " punts de la part dreta per descobrir els encerts.\n"
                + "Si hem col·locat una fitxa del color correcta en la posició adequada, no apareixerà un punt negre. "
                + "Si hem determinat el color de la fitxa però la posició no és correcta, apareixerà un punt blanc. "
                + "I si per el contrari no existeix cap fitxa d'aquest color en el joc el punt no canvia de color."
                + " Els colors dels punts ens indiquen la quantitat de peces bé o mal col·locades però no ens indiquen a la fitxa que es refereix. "
                + "És simplement un contador global de les fitxes ben col·locades, les fitxes mal situades i les fitxes que no apareixen en la combinació.\n"
                + "Segueix les pistes de cada jugada per planear la combinació de colors del següent turno. Si acertem la combinació, "
                + "els quatre punts apareixeran de color negre i es mostrarà la combinació oculta a la part inferior.");
        alert.showAndWait();
    }

    @Override
    public void winGame(String a) {
        com.sun.javafx.application.PlatformImpl.startup(() -> {
        });
        final String nombreArchivo = "sonidoVictoria.mp3";
        File archivo = new File(nombreArchivo);

        Media audio = new Media(archivo.toURI().toString());

        MediaPlayer reproductor = new MediaPlayer(audio);

        reproductor.play();

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Victoria!");
        alert.setContentText(a);
        alert.showAndWait();
    }

    @Override
    public void overGame(String a) {
         com.sun.javafx.application.PlatformImpl.startup(() -> {
        });
        final String nombreArchivo = "sonidoDerrota.mp3";
        File archivo = new File(nombreArchivo);

        Media audio = new Media(archivo.toURI().toString());

        MediaPlayer reproductor = new MediaPlayer(audio);

        reproductor.play();

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Derrota...");
        alert.setContentText(a);
        alert.showAndWait();
    }

    @Override
    public void play(Map<Matches, Integer> mapa) {
       this.mapa = mapa;
       
        for (Map.Entry<Matches, Integer> entry : mapa.entrySet()) {
            Matches key = entry.getKey();
            Integer value = entry.getValue();
            
            if (key.equals("Ok")) {
                
            }else{
                
            }
                
            
        }
        
        
    }

}
