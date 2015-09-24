public class CardGenerator{
    public static void main (String[]args){
        int card = (int)((Math.random()*(52+1))+1);
        int CardShape = card/4;
        int CardNumber = card%13;
        String aCardShape;
        //club? heart? spade? diamond?
        
        switch(CardShape){
            case 0: aCardShape="Club"; break;
            case 1: aCardShape="Hearts"; break;
            case 2: aCardShape="Spades"; break;
            case 3: aCardShape="Diamond"; break;
            default: aCardShape="$#@!%"; break;
        }
        //2 thru 10? jack? queen? king? ace?
        String CardNumberNot;
        if(CardNumber<=10&&CardNumber!=1){
        System.out.println("You picked the " + CardNumber + " of " + aCardShape + ".");
        }
        else
            switch(CardNumber){
                case 0: CardNumberNot="jack"; break;
                case 1: CardNumberNot="queen"; break;
                case 11: CardNumberNot="king"; break;
                case 12: CardNumberNot="ace"; break;
                default: CardNumberNot="$#@!%"; break;
            }
        System.out.println("You picked the " + CardNumberNot + " of " + CardShape + ".");
        
    }
}
        
        
//        switch(card){
//            case 





//    int x = 1;
//    switch(x){
//        
//        case 0: break;
//            case 1: break;
//                case 2: break;
