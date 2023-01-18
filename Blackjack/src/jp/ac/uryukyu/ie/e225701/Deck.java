package jp.ac.uryukyu.ie.e225701;
import java.util.Random;

public class Deck{
public Deck() { 
        Random random = new Random();
        int randomValue = random.nextInt(13) + 1;
        System.out.println(randomValue);
    }
}

