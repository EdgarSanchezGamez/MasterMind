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
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Administrador
 */
public class FXMLDocumentController implements Initializable, interfaces.MasterMindViewContract {
    
    private Stage stage;
    private int fila=0;
    int contador = 1;
    private List<Color> jugada = new ArrayList<>();
    private static MastermindPresenter presenter;
    private boolean deshabilitar=false;
    
    public FXMLDocumentController(Stage stage) throws IOException {
        this.stage = stage;
        this.initUI();
    }
    
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
    private GridPane gridPaneE;

    private Map<Integer, Matches> mapa;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        configurarBotons();
        
    }
    
    public void initUI() throws IOException{
        FXMLLoader loader = new FXMLLoader();		
		loader.setController(this);		
		loader.setLocation(getClass().getResource("FXMLDocument.fxml"));
                Parent root = loader.load();	
		
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("MasterMind");
        stage.show();
        
        deshabilitarBotones();
    }
    
    public void setPresenter(MastermindPresenter presentador){
        this.presenter = presentador;
    }
    
    @FXML
    public void iniciarPartida(ActionEvent event) throws IOException{
       //Para reiniciar el juego hay que cerrarlo, no lo hemos conseguido limpiar los cuadros.
        initUI();
        fila=0;
        contador=1;
        deshabilitar=true;
        deshabilitarBotones();
        this.presenter.startGame();
        
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
        alert.setContentText("El joc consisteix a trobar la combinaci?? de fitxes de colors oculta."
                + " Comen??ant per la part superior, cada filera de forats determina un torn de la partida. "
                + "En cada torn hem d'arrastrar fitxes de colors en tots els huecos i tocar o fer clic als"
                + " punts de la part dreta per descobrir els encerts.\n"
                + "Si hem col??locat una fitxa del color correcta en la posici?? adequada, no apareixer?? un punt negre. "
                + "Si hem determinat el color de la fitxa per?? la posici?? no ??s correcta, apareixer?? un punt blanc. "
                + "I si per el contrari no existeix cap fitxa d'aquest color en el joc el punt no canvia de color."
                + " Els colors dels punts ens indiquen la quantitat de peces b?? o mal col??locades per?? no ens indiquen a la fitxa que es refereix. "
                + "??s simplement un contador global de les fitxes ben col??locades, les fitxes mal situades i les fitxes que no apareixen en la combinaci??.\n"
                + "Segueix les pistes de cada jugada per planear la combinaci?? de colors del seg??ent turno. Si acertem la combinaci??, "
                + "els quatre punts apareixeran de color negre i es mostrar?? la combinaci?? oculta a la part inferior.");
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
        reproductor.setStopTime(Duration.seconds(10));

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
        reproductor.setStopTime(Duration.seconds(10));

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Derrota...");
        alert.setContentText(a);
        alert.showAndWait();
    }
    
    @Override
    public void play(Map<Integer, Matches> mapa) {
        int contadorE = fila*4;
        this.mapa = mapa;
        System.out.println(mapa);
        for (Map.Entry<Integer, Matches> entry : this.mapa.entrySet()) {
            Integer key = entry.getKey();
            Matches value = entry.getValue();
            
            System.out.println(this.mapa);
            System.out.println(value);
            
            if (value.equals(Matches.Ok)) {
                ((Label) gridPaneE.getChildren().get(contadorE)).setBackground(new Background(new BackgroundFill(javafx.scene.paint.Color.rgb(0, 0, 0, 1), new CornerRadii(5.0), new Insets(-5.0))));    
            } else if(value.equals(Matches.wrongPosition)){
                ((Label) gridPaneE.getChildren().get(contadorE)).setBackground(new Background(new BackgroundFill(javafx.scene.paint.Color.rgb(255, 255, 255, 1), new CornerRadii(5.0), new Insets(-5.0)))); 
            }
                contadorE++;
            }
            fila++;
    }
    
    @FXML
    private void afegirColor(ActionEvent event) {
        switch (((Button) event.getSource()).getId()) {
            case "BLAU":
                ((Label) gridPane.getChildren().get(contador-1)).setStyle("-fx-background-color: blue");
                jugada.add(Color.BLAU);
                break;
            case "GROC":
                ((Label) gridPane.getChildren().get(contador-1)).setStyle("-fx-background-color: yellow");
                jugada.add(Color.GROC);
                break;
            case "VERMELL":
                ((Label) gridPane.getChildren().get(contador-1)).setStyle("-fx-background-color: red");
                jugada.add(Color.VERMELL);
                break;
            case "VERD":
                ((Label) gridPane.getChildren().get(contador-1)).setStyle("-fx-background-color: green");
                jugada.add(Color.VERD);
                break;
        }
            
        if((contador%4)==0){
            presenter.validate(jugada);
            jugada.clear();
        }
            contador++;
    }

    private void configurarBotons() {
        botonAzul.setId(interfaces.Color.BLAU.toString());
        botonAmarillo.setId(interfaces.Color.GROC.toString());
        botonRojo.setId(interfaces.Color.VERMELL.toString());
        bototnVerde.setId(interfaces.Color.VERD.toString());
    }
    
    public void deshabilitarBotones(){
        if(!deshabilitar){
            botonAzul.setDisable(true);
            botonAmarillo.setDisable(true);
            botonRojo.setDisable(true);
            bototnVerde.setDisable(true);
            
        }else if(deshabilitar=true){
            botonAzul.setDisable(false);
            botonAmarillo.setDisable(false);
            botonRojo.setDisable(false);
            bototnVerde.setDisable(false);
        }
    }
    

}
