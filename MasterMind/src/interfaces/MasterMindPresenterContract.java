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
    
    public void startGame();  
    
    public void validate(List<Color> l);
    
    public void win(String a);
    
    public void over(String a);
    
    
    
}
