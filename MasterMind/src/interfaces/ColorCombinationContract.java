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
    
    //Permet resetejar els colors de la jugada i guardar un de nou.
    public List<Color> setColors(List<Color> l);
     
    /*Compara els colors guardats a l’objecte amb la combinació de colors secreta del joc. 
    Retorna un mapa amb el número de posicions on el color i la ubicació són correctes 
    i el número on només el color és correcte, però no la ubicació.*/
    public Map<Integer,Matches> compare(ColorCombination hidden);
}
