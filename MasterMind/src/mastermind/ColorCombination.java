/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind;

import interfaces.Color;
import interfaces.ColorCombinationContract;
import interfaces.Matches;
import java.util.List;
import java.util.Map;

/**
 *
 * @author i7 6700k
 */
public class ColorCombination implements ColorCombinationContract{
    
    private List<Color> lista;
    
    public ColorCombination(List<Color> l){
        this.lista = l;
    
    }

    @Override
    public Map<Matches, Integer> compare(ColorCombination hidden) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Color> setColors(List<Color> l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
    
}
