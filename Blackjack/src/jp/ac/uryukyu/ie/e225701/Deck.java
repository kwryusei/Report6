package jp.ac.uryukyu.ie.e225701;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.Collections;
public class Deck{
    private static List <Integer> deck = new ArrayList<Integer>(Arrays.asList(1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,7,8,8,8,8,9,9,9,9,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10));
    static ArrayList<Integer> suffleDeck = new ArrayList<Integer>();
    static ArrayList<Integer> playerHand = new ArrayList<>();
    static ArrayList<Integer> dealerHand = new ArrayList<>();


    public Deck(){
        
        Collections.shuffle(deck);
        //suffleDeck.add(Collections.shuffle(deck));
        
        playerHand.add(deck.get(0));
        dealerHand.add(deck.get(1));
        playerHand.add(deck.get(2));
        dealerHand.add(deck.get(3));
        /*デバック用
        //System.out.println(deck);
        //System.out.println(playerHand);
        //System.out.println(dealerHand);
        */
    }

    public static ArrayList<Integer> getPlayerHand() {
        return playerHand;
    }

    public static List<Integer> getDeck(){
        return deck;
    }
}
   
    
  