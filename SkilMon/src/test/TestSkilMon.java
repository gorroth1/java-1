
package test;

import skilstak.skilmon.SkilMon;

public class TestSkilMon {
    public static void main(String[] args) {
        SkilMon s = new SkilMon("Llama.json");
        System.out.println("Speed:           " + s.speed);
        System.out.println("Attack:          " + s.attack);
        System.out.println("Special Attack:  " + s.spAttack);
        System.out.println("Special Defense: " + s.spDefense);
        System.out.println("Happiness:       " + s.happiness);
    }

}
