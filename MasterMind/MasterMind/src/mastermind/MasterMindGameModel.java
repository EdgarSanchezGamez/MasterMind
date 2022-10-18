/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind;

import interfaces.MastermindGameModelContract;
import interfaces.Matches;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author i7 6700k
 */
public class MasterMindGameModel implements MastermindGameModelContract{

    private GameListener listener= new GameListener();
    @Override
    public void start() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addListener(GameListener listener) {
        this.listener= listener;
    }

    @Override
    public Map<Integer,Matches> validatePlay(ColorCombination colors) {
        Map<Integer,Matches> resultat = new HashMap<Integer,Matches>();
        
        
        return resultat;
    }
    
    
}
