package jp.ac.uryukyu.ie.e225701;

public class v_or_d {
    
    public static int playerSum(){
        int playerSum = Deck.playerHand.stream().mapToInt( i -> i ).sum();
        //System.out.println(playerSum);
        return playerSum;
    }

    public static int dealerSum(){
        int dealerSum = Deck.dealerHand.stream().mapToInt( i -> i).sum();
        //System.out.println(dealerSum);
        return dealerSum;
    }


    

    

    

    
}
