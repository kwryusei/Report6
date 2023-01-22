package jp.ac.uryukyu.ie.e225701;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
class BlackjackTest {
    @Test void BlackjackTest(){
        List <Integer> deck = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23));
        int playerCount = 1;
        int deckcount = 4;
        int dealerCount = 1;
        boolean dBool = true;

        System.out.println("ゲーム開始");
        System.out.println("あなたのカードは" + Deck.getPlayerHand() + "合計は" + v_or_d.playerSum() + "です。" );
        System.out.println("dealerのカードは" + "[" +Deck.getDeck().get(1) + ", ?]" + "です。");            while(true){
            System.out.println("追加でカードを引きますか？yes:y no:n");
            //Scanner scanner = new Scanner(System.in); 
            //String str = scanner.next();  
            
            String strTest = "n";
            //playerの確認
            if("n".equals(strTest)){
                break;
            }else if("y".equals(strTest)){                        
                Deck.playerHand.add(Deck.getDeck().get(deckcount));                    
                deckcount = deckcount + 1;
                playerCount = playerCount + 1;
                if(v_or_d.playerSum() > 21){
                    System.out.println("あなたは" + Deck.playerHand.get(playerCount) + "を引き、合計が" + v_or_d.playerSum() + "になりました。");
                    System.out.println("バーストしました。あなたの負けです。");
                    dBool = false;
                    break;
                }
                System.out.println("あなたのカードは" + Deck.getPlayerHand() + "合計は" + v_or_d.playerSum() + "です。" ); 
            }else {
                //System.out.println("あなたの入力は" + str + " です。y か n を入力してください。");
            }
        }

        //dealerの確認
        while(dBool == true){  
            System.out.println("ディーラーカードは" + Deck.dealerHand);  
            if(v_or_d.dealerSum() >= 17){
                System.out.println("ディーラーカードは" + Deck.dealerHand + "でした。 合計は" + v_or_d.dealerSum() + "です。");
                break;
            }else{    
                Deck.dealerHand.add(Deck.getDeck().get(deckcount));
                deckcount = deckcount + 1;
                dealerCount = dealerCount + 1;
                System.out.println(Deck.dealerHand.get(dealerCount) + "を引きました。");
                System.out.println("ディーラーカードは" + Deck.dealerHand + "になり,合計が" + v_or_d.dealerSum() + "になりました。");
                if (v_or_d.dealerSum() > 21){
                    System.out.println("ディーラーがバーストしました。あなたの勝利です。");
                    dBool = false;
                }
            }
        } 
        assertEquals("ディーラーカードは[2, 4, 5, 6]でした。 合計は17です。" ,"ディーラーカードは" + Deck.dealerHand + "でした。 合計は" + v_or_d.dealerSum() + "です。");           
    
        //勝敗の確認
        /* 
        if (v_or_d.playerSum() > v_or_d.dealerSum() && dBool == true){
            System.out.println("あなたの勝利です。");
        }else if(v_or_d.playerSum() < v_or_d.dealerSum() && dBool == true){
            System.out.println("ディーラーの勝利です。");
        }else if (v_or_d.playerSum() == v_or_d.dealerSum()){
            System.out.println("引き分けです。");
        }*/
    }
}


