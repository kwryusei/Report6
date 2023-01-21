package jp.ac.uryukyu.ie.e225701;
public class v_or_d {
    //playerのカードを合計する
    public static int playerSum(){
        int playerSum = Deck.playerHand.stream().mapToInt( i -> i ).sum();
        return playerSum;
    }

    //dealerのカードを合計する
    public static int dealerSum(){
        int dealerSum = Deck.dealerHand.stream().mapToInt( i -> i).sum();
        return dealerSum;
    }
}