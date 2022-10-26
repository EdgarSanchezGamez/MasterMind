/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.Map;
import mastermind.ColorCombination;

/**
 *
 * @author i7 6700k
 */
public interface MastermindGameModelContract {
    
    // S’encarregaria de iniciar o reiniciar el joc, 
    // creant la combinació secreta de colors a endevinar, 
    // reiniciant el número d’intents i el que sigui necessari.
    public void start();
    
    // Registra el listener necessari per controlar els estats del joc. 
    public void addListener(GameListenerContract listener);
    
    /* Arriba una combinació dels colors de la jugada i s’encarrega de retornar el mapa amb el número de posicions 
    on el color i la ubicació són correctes i el número on només el color és correcte (però no la ubicació).
    També s’encarregaria d’avissar als listeners de si hi ha un canvi d’estat del joc 
    (per exemple si s’ha guanyat o ha finalitzat el joc per nombre d’intents)
    */
    public  Map<Integer,Matches> validatePlay(ColorCombination colors);
    
    
}
