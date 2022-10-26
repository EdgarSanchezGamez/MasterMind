/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Administrador
 */
public class MasterMind extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        
        MasterMindGameModel model = new MasterMindGameModel();
        MastermindPresenter presentador = new MastermindPresenter();
        FXMLDocumentController vista = new FXMLDocumentController();
        
        
        presentador.setModel(model);
        presentador.setVista(vista);
        vista.setPresenter(presentador);
        
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("MasterMind");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}