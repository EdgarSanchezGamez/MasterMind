/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind;

import interfaces.Color;
import interfaces.GameListenerContract;
import interfaces.MastermindGameModelContract;
import interfaces.Matches;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author i7 6700k
 */
public class MasterMindGameModel implements MastermindGameModelContract {

    private ColorCombination cc;
    private GameListenerContract listener;
    private List<Color> colorList, colorListMezclar;
    private final int intentosMax = 10;
    private int intentos;

    public void barajar() {

        colorList = new ArrayList<>();
        colorListMezclar = new ArrayList<>();

        colorListMezclar.add(Color.VERMELL);
        colorListMezclar.add(Color.BLAU);
        colorListMezclar.add(Color.VERD);
        colorListMezclar.add(Color.GROC);

        for (int i = 0; i <= 3; i++) {
            int a = (int) (Math.random() * 4 + 0);
            colorList.add(colorListMezclar.get(a));
            System.out.println(colorList.get(i));
        }

    }

    @Override
    public void start() {
        System.out.println("empieza");
        barajar();
        cc = new ColorCombination(colorList);
        intentos = 0;

    }

    @Override
    public void addListener(GameListenerContract listener) {
        this.listener = listener;
    }

    @Override
    public Map<Integer, Matches> validatePlay(ColorCombination colors) {
        intentos++;
        int contador=0;
        Map<Integer, Matches> mapa = new HashMap<Integer, Matches>();

        ColorCombination hiddenCc = new ColorCombination(colorList);

        mapa = colors.compare(hiddenCc);
       
        for (Map.Entry<Integer, Matches> entry : mapa.entrySet()) {
            Integer key = entry.getKey();
            Matches value = entry.getValue();
            if(value.equals(Matches.Ok)){
                contador++;
            }
        }
        
        if (intentos <= 5 && contador==4) {
            listener.win("Molt b??, ??s l@ millor");
        } else if (intentos <= intentosMax && intentos>5 && contador==4) {
            listener.win("B??, encara pots millora m??s");
        } else if (intentos == intentosMax) {
            listener.over("Game Over");
        }

        return mapa;
    }

}
