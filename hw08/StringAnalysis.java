import java.util.Scanner;
public class StringAnalysis{
    public static void main(String[]args){
        int a = 1; //this is for while loop counter.
        int alphabetCounter = 0;
        int numberCounter = 0;
        
        //create scanner
        Scanner input = new Scanner(System.in);
        //instructions
        System.out.println("This program analyses a word, number, ");
        System.out.println("or combinaion of those and tell you how");
        System.out.println("many letters and numbers are in the given phrase.");
        System.out.println("Type in your phrase to be analysed.");
        //ask for input
        String phrase = input.next();
        int phraseLength = phrase.length();//length of the input phrase
        //check each every letter/number in a loop
        while(a<=phraseLength){
            if(phrase.charAt(a)>='a' && phrase.charAt(a)<='z'){
                alphabetCounter += alphabetCounter;
            }
            else{
                numberCounter += numberCounter;
            }       
            a++;
        }
        System.out.println("There are " + alphabetCounter + " letters and " + numberCounter + " numbers in the phrase.");
    }//end of main
    public static void check(int a, String phrase){
        
    }//end of method
    public static void check(String phrase){
        
    }//end of method
}//end of class