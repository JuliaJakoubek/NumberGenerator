package at.technikum.numbergenerator;

import java.util.Random;

public class NumberGenerator {
    public int random(){
        Random rand = new Random();
        int upperbound = 100;
        return rand.nextInt(upperbound);
    }
}
