/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;

/**
 *
 * @author i7 6700k
 */
public interface MasterMindPresenterContract {
    
    //Inicia o reinicia el joc.
    public void startGame();  
    
    /*Rep la combinació de colors de la Vista, 
    crea un objecte ColorCombination i ho passa al model perquè avalui la jugada. 
    S’encarrega després d’informar a la vista el resultat*/
    public void validate(List<Color> l);
    
    /**Avisa a la vista de que el joc a finalitzat i el jugador ha guanyat. 
     * Rep del model el missatge en funció de la quantitat d’intents.*/
    public void win(String a);
    /*Avisa a la vista de que el joc a finalitzat i el jugador ha. perdut. 
    Rep del model el missatge corresponent.*/
    public void over(String a);
    
    
    
}
