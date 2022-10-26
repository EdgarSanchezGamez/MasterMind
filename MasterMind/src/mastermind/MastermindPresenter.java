/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind;

import interfaces.Color;
import interfaces.MasterMindPresenterContract;
import interfaces.Matches;
import java.util.List;
import java.util.Map;

/**
 *
 * @author i7 6700k
 */
public class MastermindPresenter implements MasterMindPresenterContract{
    
    private FXMLDocumentController vista;
    private MasterMindGameModel modelo;
    
    public void setModel(MasterMindGameModel model){
        this.modelo = model; 
        this.modelo.addListener(this);
    }
    
    public void setVista(FXMLDocumentController view){
        this.vista = view;
    }
    
    @Override
    public void startGame() {
        this.modelo.start();
    }

    @Override
    public void validate(List<Color> l) {
        
        Map<Integer,Matches>mapa;
        mapa = modelo.validatePlay(new ColorCombination(l));
        vista.play(mapa);
    }

    @Override
    public void win(String a) {
       vista.winGame(a);
    }

    @Override
    public void over(String a) {
       vista.overGame(a);
    }
    
    
}
