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
    //Llista de color de la jugada.
    private List<Color> lista;
    // Constructor on es guarda la llista de colors de la jugada
    public ColorCombination(List<Color> l){
        this.lista = l;
    
    }

    @Override
    public Map<Integer,Matches> compare(ColorCombination hidden) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Color> setColors(List<Color> l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
    
}
