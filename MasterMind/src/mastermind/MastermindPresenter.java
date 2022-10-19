/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind;

import interfaces.Color;
import interfaces.MasterMindPresenterContract;
import java.util.List;

/**
 *
 * @author i7 6700k
 */
public class MastermindPresenter extends GameListener implements MasterMindPresenterContract{
    
    private FXMLDocumentController vista;
    private MasterMindGameModel modelo;
    private ColorCombination cc;
    
    
    
    @Override
    public void startGame() {
        modelo.start();
    }

    @Override
    public void validate(List<Color> l) {
        cc.setColors(l);
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
