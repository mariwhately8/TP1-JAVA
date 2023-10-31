package br.com.infnet.util;

import java.util.Random;

public class DadoUtil {
    private int rollDice(int bound){
        Random random = new Random();
        return random.nextInt(bound) + 1;
    }

    public int rollD10() {
       return rollDice(10);
    }
    public int rollD4() {
        return rollDice(4);
    }
    public int rollD6() {
        return rollDice(6);
    }

    public int rollD8() {
        return rollDice(8);
    }

    public int rollD2() {
        return rollDice(2);
    }
}
