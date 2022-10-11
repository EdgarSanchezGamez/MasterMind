/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import java.util.Map;
import mastermind.ColorCombination;

/**
 *
 * @author i7 6700k
 */
public interface ColorCombinationContract {
    
    public List<Color> setColors(List<Color> l);
     
    public Map<Matches,Integer> compare(ColorCombination hidden);
}
