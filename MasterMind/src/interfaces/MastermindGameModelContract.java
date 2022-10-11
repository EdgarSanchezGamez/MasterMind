/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.Map;
import mastermind.ColorCombination;
import mastermind.GameListener;

/**
 *
 * @author i7 6700k
 */
public interface MastermindGameModelContract {
    
    public void start();
    
    public void addListener(GameListener listener);
    
    public  Map<Matches , Integer> validatePlay(ColorCombination colors);
    
    
}
