/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind;

import interfaces.Color;
import interfaces.ColorCombinationContract;
import interfaces.Matches;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author i7 6700k
 */
public class ColorCombination implements ColorCombinationContract{
    //Llista de color de la jugada.
    private List<Color> lista = new ArrayList();
    
    // Constructor on es guarda la llista de colors de la jugada
    public ColorCombination(List<Color> l){
        this.lista = l;
    
    }

    @Override
    public Map<Integer,Matches> compare(ColorCombination hidden) {
        
        Map<Integer,Matches> mapa = new HashMap<Integer,Matches>();
        int posCorrect=0, posIncorrect=0;
        
        for(int i=0;i<hidden.lista.size();i++){
            
            if(lista.get(i).equals(hidden.lista.get(i)) ){
                posCorrect++;
            }else if(lista.contains(hidden.lista.get(i))){
                posIncorrect++;
            }
        
        }
        
        mapa.put(posCorrect, Matches.Ok);
        mapa.put(posIncorrect, Matches.wrongPosition);
        
        return mapa;
    }

    @Override
    public List<Color> setColors(List<Color> l) {
        
        lista.add(l.get(0));
        lista.add(l.get(1));
        lista.add(l.get(2));
        lista.add(l.get(3));
        
        return lista;
    }
         
    
    
}
