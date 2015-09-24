//this program determines if the 5 cards from a poker is a pair, two pairs, 3 of a kind, or just a high hand
public class PokerHandCheck{
public static void main(String[]args){
    
    System.out.println("Your random cards were: ");
    //1ST CARD
    
    int CardNumbersAssigned1= (int)( 52*Math.random()+1 );
    int CardShapeAssignment1 = CardNumbersAssigned1%4;
    int CardNumberAssignment1 = CardNumbersAssigned1%13;
    //card shape??
    String CardShape1;
    if(CardShapeAssignment1==0){
        CardShape1="club";
    }else if(CardShapeAssignment1==1){
        CardShape1="clover";
    }else if (CardShapeAssignment1==2){
        CardShape1="diamond";
    }else
       CardShape1="spade";
    //card number/royal
    String CardNumber1;
    switch(CardNumberAssignment1){
        case 0: CardNumber1 = "Jack"; break;
        case 1: CardNumber1 = "Queen"; break;
        case 2: CardNumber1 = "2"; break;
        case 3: CardNumber1 = "3"; break;
        case 4: CardNumber1 = "4"; break;
        case 5: CardNumber1 = "5"; break;
        case 6: CardNumber1 = "6"; break;
        case 7: CardNumber1 = "7"; break;
        case 8: CardNumber1 = "8"; break;
        case 9: CardNumber1 = "9"; break;
        case 10: CardNumber1 = "10"; break;
        case 11: CardNumber1 = "king"; break;
        case 12: CardNumber1 = "ace"; break;
        default: CardNumber1 = "$#@!%"; break;
    }
    System.out.println("the " + CardNumber1 + " of " + CardShape1);

    //2ND CARD

    int CardNumbersAssigned2= (int)( 52*Math.random()+1 );
    int CardShapeAssignment2 = CardNumbersAssigned2%4;
    int CardNumberAssignment2 = CardNumbersAssigned2%13;
    //card shape??
    String CardShape2;
    if(CardShapeAssignment2==0){
        CardShape2="club";
    }else if(CardShapeAssignment2==1){
        CardShape2="clover";
    }else if (CardShapeAssignment2==2){
        CardShape2="diamond";
    }else
       CardShape2="spade";
    //card number/royal
    String CardNumber2;
    switch(CardNumberAssignment2){
        case 0: CardNumber2 = "Jack"; break;
        case 1: CardNumber2 = "Queen"; break;
        case 2: CardNumber2 = "2"; break;
        case 3: CardNumber2 = "3"; break;
        case 4: CardNumber2 = "4"; break;
        case 5: CardNumber2 = "5"; break;
        case 6: CardNumber2 = "6"; break;
        case 7: CardNumber2 = "7"; break;
        case 8: CardNumber2 = "8"; break;
        case 9: CardNumber2 = "9"; break;
        case 10: CardNumber2 = "10"; break;
        case 11: CardNumber2 = "king"; break;
        case 12: CardNumber2 = "ace"; break;
        default: CardNumber2 = "$#@!%"; break;
    }
    System.out.println("the " + CardNumber2 + " of " + CardShape2);

    //3RD CARD

    int CardNumbersAssigned3= (int)( 52*Math.random()+1 );
    int CardShapeAssignment3 = CardNumbersAssigned3%4;
    int CardNumberAssignment3 = CardNumbersAssigned3%13;
    //card shape??
    String CardShape3;
    if(CardShapeAssignment3==0){
        CardShape3="club";
    }else if(CardShapeAssignment3==1){
        CardShape3="clover";
    }else if (CardShapeAssignment3==2){
        CardShape3="diamond";
    }else
       CardShape3="spade";
    //card number and royal
    String CardNumber3;
    switch(CardNumberAssignment3){
        case 0: CardNumber3 = "Jack"; break;
        case 1: CardNumber3 = "Queen"; break;
        case 2: CardNumber3 = "2"; break;
        case 3: CardNumber3 = "3"; break;
        case 4: CardNumber3 = "4"; break;
        case 5: CardNumber3 = "5"; break;
        case 6: CardNumber3 = "6"; break;
        case 7: CardNumber3 = "7"; break;
        case 8: CardNumber3 = "8"; break;
        case 9: CardNumber3 = "9"; break;
        case 10: CardNumber3 = "10"; break;
        case 11: CardNumber3 = "king"; break;
        case 12: CardNumber3 = "ace"; break;
        default: CardNumber3 = "$#@!%"; break;
    }
    System.out.println("the " + CardNumber3 + " of " + CardShape3);

    //4TH CARD
   
    int CardNumbersAssigned4= (int)( 52*Math.random()+1 );
    int CardShapeAssignment4 = CardNumbersAssigned4%4;
    int CardNumberAssignment4 = CardNumbersAssigned4%13;
    //card shape??
    String CardShape4;
    if(CardShapeAssignment4==0){
        CardShape4="club";
    }else if(CardShapeAssignment4==1){
        CardShape4="clover";
    }else if (CardShapeAssignment4==2){
        CardShape4="diamond";
    }else
       CardShape4="spade";
    //card number/royal
    String CardNumber4;
    switch(CardNumberAssignment4){
        case 0: CardNumber4 = "Jack"; break;
        case 1: CardNumber4 = "Queen"; break;
        case 2: CardNumber4 = "2"; break;
        case 3: CardNumber4 = "3"; break;
        case 4: CardNumber4 = "4"; break;
        case 5: CardNumber4 = "5"; break;
        case 6: CardNumber4 = "6"; break;
        case 7: CardNumber4 = "7"; break;
        case 8: CardNumber4 = "8"; break;
        case 9: CardNumber4 = "9"; break;
        case 10: CardNumber4 = "10"; break;
        case 11: CardNumber4 = "king"; break;
        case 12: CardNumber4 = "ace"; break;
        default: CardNumber4 = "$#@!%"; break;
    }
    System.out.println("the " + CardNumber4 + " of " + CardShape4);   
    
   //5TH CARD
   
   int CardNumbersAssigned5= (int)( 52*Math.random()+1 );
    int CardShapeAssignment5 = CardNumbersAssigned5%4;
    int CardNumberAssignment5 = CardNumbersAssigned5%13;
    //card shape??
    String CardShape5;
    if(CardShapeAssignment5==0){
        CardShape5="club";
    }else if(CardShapeAssignment5==1){
        CardShape5="clover";
    }else if (CardShapeAssignment5==2){
        CardShape5="diamond";
    }else
       CardShape5="spade";
    //card number/royal
    String CardNumber5;
    switch(CardNumberAssignment5){
        case 0: CardNumber5 = "Jack"; break;
        case 1: CardNumber5 = "Queen"; break;
        case 2: CardNumber5 = "2"; break;
        case 3: CardNumber5 = "3"; break;
        case 4: CardNumber5 = "4"; break;
        case 5: CardNumber5 = "5"; break;
        case 6: CardNumber5 = "6"; break;
        case 7: CardNumber5 = "7"; break;
        case 8: CardNumber5 = "8"; break;
        case 9: CardNumber5 = "9"; break;
        case 10: CardNumber5 = "10"; break;
        case 11: CardNumber5 = "king"; break;
        case 12: CardNumber5 = "ace"; break;
        default: CardNumber5 = "$#@!%"; break;
    }
    System.out.println("the " + CardNumber5 + " of " + CardShape5);
    
    /*Step 2:putting the 5 cards together
    in this step every single possible combinations of the cards have been included.*/

    if(CardNumber1.equals(CardNumber2)){
         if(CardNumber1.equals(CardNumber3)||CardNumber1.equals(CardNumber4)||CardNumber1.equals(CardNumber5))
             {
              System.out.println("You have a three of a kind!");
                }
                else {
                    if(CardNumber3.equals(CardNumber4)||CardNumber3.equals(CardNumber5)||CardNumber4.equals(CardNumber5))
                        {System.out.println("You have two pairs!");}
                    else{
                    System.out.println("You have a pair!");
                }
            }
        }
        else{
        if(CardNumber1.equals(CardNumber3)){
            if(CardNumber1.equals(CardNumber4)||CardNumber1.equals(CardNumber5)||CardNumber1.equals(CardNumber2)){
                System.out.println("You have a three of a kind!");
            }
                else {
                    if(CardNumber2.equals(CardNumber4)||CardNumber2.equals(CardNumber5)||CardNumber4.equals(CardNumber5))
                        {System.out.println("You have two pairs!");}
                    else{
                    System.out.println("You have a pair!");
                }
            }
        }
        else{
        if(CardNumber1.equals(CardNumber4)){
            if(CardNumber2.equals(CardNumber3)||CardNumber2.equals(CardNumber5)||CardNumber4.equals(CardNumber5)){
                System.out.println("You have a three of a kind!");
            }
                else {
                    if(CardNumber2.equals(CardNumber3)||CardNumber2.equals(CardNumber5)||CardNumber3.equals(CardNumber5))
                        {System.out.println("You have two pairs!");}
                    else{
                    System.out.println("You have a pair!");
                }
            }
        }
        else{
        if(CardNumber1.equals(CardNumber5)){
            if(CardNumber1.equals(CardNumber2)||CardNumber1.equals(CardNumber3)||CardNumber1.equals(CardNumber4)){
                System.out.println("You have a three of a kind!");
            }
                else {
                    if(CardNumber2.equals(CardNumber3)||CardNumber2.equals(CardNumber4)||CardNumber3.equals(CardNumber4))
                        {System.out.println("You have two pairs!");}
                    else{
                    System.out.println("You have a pair!");
                }
            }
        }
    else{
        if(CardNumber2.equals(CardNumber3)){
            if(CardNumber2.equals(CardNumber4)||CardNumber2.equals(CardNumber5)){
                System.out.println("You have a three of a kind!");
            }
                else {
                    if(CardNumber1.equals(CardNumber4)||CardNumber1.equals(CardNumber5)||CardNumber4.equals(CardNumber5))
                        {System.out.println("You have two pairs!");}
                    else{
                    System.out.println("You have a pair!");
                }
            }
        }
        else{
        if(CardNumber2.equals(CardNumber4)){
            if(CardNumber2.equals(CardNumber3)||CardNumber2.equals(CardNumber5)||CardNumber2.equals(CardNumber1)){
                System.out.println("You have a three of a kind!");
            }
                else {
                    if(CardNumber1.equals(CardNumber3)||CardNumber1.equals(CardNumber5)||CardNumber3.equals(CardNumber5))
                        {System.out.println("You have two pairs!");}
                    else{
                    System.out.println("You have a pair!");
                }
            }
        }
         if(CardNumber2.equals(CardNumber5)){
            if(CardNumber2.equals(CardNumber3)||CardNumber2.equals(CardNumber4)||CardNumber2.equals(CardNumber1)){
                System.out.println("You have a three of a kind!");
            }
                else {
                    if(CardNumber1.equals(CardNumber3)||CardNumber1.equals(CardNumber4)||CardNumber3.equals(CardNumber4))
                        {System.out.println("You have two pairs!");}
                    else{
                    System.out.println("You have a pair!");
                }
            }
        }
    else{if(CardNumber3.equals(CardNumber4)){
            if(CardNumber2.equals(CardNumber5)){
                System.out.println("You have a three of a kind!");}
                else {
                    if(CardNumber1.equals(CardNumber5)||CardNumber2.equals(CardNumber5)||CardNumber1.equals(CardNumber3))
                        {System.out.println("You have two pairs!");}
                    else{
                    System.out.println("You have a pair!");
                }
            }
        }  
         if(CardNumber3.equals(CardNumber5)){
            if(CardNumber3.equals(CardNumber1)||CardNumber3.equals(CardNumber2)||CardNumber3.equals(CardNumber4)){
                System.out.println("You have a three of a kind!");
            }
                else {
                    if(CardNumber1.equals(CardNumber2)||CardNumber1.equals(CardNumber4)||CardNumber2.equals(CardNumber4))
                        {System.out.println("You have two pairs!");}
                    else{
                    System.out.println("You have a pair!");
                }
            }
        }
    else{if(CardNumber4.equals(CardNumber5))
            System.out.println("You have a pair!");
    else{
            System.out.println("You have a high card hand!");
        }
           
  
}
}
}
}
}
}
}
}
}