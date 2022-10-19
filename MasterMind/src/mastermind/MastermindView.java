/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind;

import interfaces.MasterMindViewContract;
import interfaces.Matches;
import java.util.Map;



/**
 *
 * @author i7 6700k
 */
public class MastermindView implements MasterMindViewContract {
   final private MasterMindGameModel model = new MasterMindGameModel();
   final private MastermindPresenter presenter = new MastermindPresenter();

    @Override
    public void winGame(String a) {     
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void overGame(String a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void play(Map<Matches, Integer> mapa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
