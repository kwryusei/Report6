package jp.ac.uryukyu.ie.e225701;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.Collections;
public class Deck{
    static List <Integer> deck = new ArrayList<Integer>(Arrays.asList(1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,7,8,8,8,8,9,9,9,9,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10));

    
    public Deck(){
        Collections.shuffle(deck);
        System.out.println(deck);
}
}
   
    
  