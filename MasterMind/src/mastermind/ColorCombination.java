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

        for(int i=0;i<hidden.lista.size();i++){
            
            if(hidden.lista.get(i).equals(this.lista.get(i)) ){
               mapa.put(i, Matches.Ok);
            }else if(hidden.lista.contains(lista.get(i))){
               mapa.put(i, Matches.wrongPosition);
            }/*else if(!hidden.lista.contains(lista.get(i))){
                
            }*/
        }
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
