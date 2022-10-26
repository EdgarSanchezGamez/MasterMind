/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.Map;

/**
 *
 * @author i7 6700k
 */
public interface MasterMindViewContract {
    
    /*Bloqueja la pantalla, mostra el missatge corresponent al número d’intents 
    amb el qual el jugador a guanyat i fa sonar la música de joc guanyat.*/
    public void winGame(String a);
    
    /*Bloqueja la pantalla, mostra el missatge corresponent com a joc perdut i fa sonar la música de joc perdut.*/
    public void overGame(String a);
    
    /* Rep el mapa del presentador amb el resultat dels encerts realitzats a la jugada. 
    Actualitza el joc a la pantalla.*/
    public void play(Map<Integer ,Matches > mapa);
    
    
    
}
