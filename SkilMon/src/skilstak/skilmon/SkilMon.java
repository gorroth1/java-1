package skilstak.skilmon;

import java.util.ArrayList;

public final class SkilMon {
    public int attack, defense, exp, 
    happiness, hp, spAttack, spDefense, Speed, total, 
    evolvesAt;
    
    public String species;
   
    public double catchRate, growhRate, height, width, mfRatio;
    
    public ArrayList<String> abilities, moves, types;
    
    public SkilMon() {}
    
    public SkilMon(String jsonf) {
        System.out.println("Yeah I am in the constructor: " + jsonf):
    }
}

