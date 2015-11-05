import java.util.Scanner;
public class Shuffling{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //suits club, heart, spade or diamond
        String[] suitNames={"C","H","S","D"};    
        String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
        String[] cards = new String[52];
        String[] hand = new String[5];
            for (int i=0; i<52; i++){
                cards[i]=rankNames[i%13]+suitNames[i/13];
                System.out.print(cards[i]+" ");
            }
        printArray(cards);
        shuffle(cards);
        printArray(cards);
        hand = randomizeHand(cards);
        printArray(hand);
    }
    
    /*The method shuffle(list) shuffles the elements of the list by continuously
     randomize an index number of list (that is not zero) and swaps the element
     at that index with the first element (at index 0).
     Swap however many times you like, but choose > 50 times since you
     want the deck of 52 cards well shuffled.
     */
    public static String shuffle(String x){
        int a = 0;
        do{
            int DrawACard = (int)(Math.random()*52);
            hand[a] = card[DrawACard];
            }while(a<5&&hand[a-1]!=hand[a]);
            return hand;
   }
   //pick out 5 Strings of array list and return them as an array of 5 Strings.
    public static String randomizeHand(String x){
        for(a = 0; a < cards.length; a++){
            int shuffleNotation = (int)(Math.random()*deck.length);
            String cardNotation = cards[a];
            cards[a] = cardNotation;
            return cards;
        }
    }
    //The method printArray(list) takes an array of Strings and prints out each
    //element, separated by a space “ “
    public static String printArray(String x){
        for(int i=0; i<x.length; i++){
            System.out.print(cards[i] + " ");
        }
    } 
}