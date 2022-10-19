/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind;

import com.sun.java.accessibility.util.EventID;
import interfaces.Color;
import interfaces.Matches;
import static java.awt.SystemColor.text;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 *
 * @author Administrador
 */
public class FXMLDocumentController implements Initializable, interfaces.MasterMindViewContract {

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
    private GridPane gridPane;
    @FXML
    private AnchorPane anchorPane;

    Map<Matches, Integer> mapa;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        configurarBotons();
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
    int contador =0;
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

            } else {

            }

        }

    }

    @FXML
    private void afegirColor(ActionEvent event) {
        ((Button)event.getSource()).getId();
     ((Label)gridPane.getChildren().get(contador)).setStyle("-fx-background-color: blue");
     contador++;
    }

    private void configurarBotons() {
        botonAzul.setId(interfaces.Color.BLAU.toString());
        botonAmarillo.setId(interfaces.Color.GROC.toString());
        botonRojo.setId(interfaces.Color.VERMELL.toString());
        bototnVerde.setId(interfaces.Color.VERD.toString());
    }

}
