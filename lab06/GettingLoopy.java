/*this program does bunch of loops
Timothy Oak
October 2, 2015
lab #6*/
public class GettingLoopy{
    public static void main (String[]args){
//step number 1: generate bunch of 7s after 1~6

System.out.println("Step 1: ");
int x = 0;
while(x<7){
x++;
System.out.print(x);
}
x=0;
while(x<6){
    x++;
    System.out.print(7);
}
    System.out.println(7);

//step number 2: print all prime numbers from 10-100
int PrimeOrNah = 10;
int factors = 2;
while(PrimeOrNah<101)
{
    while(PrimeOrNah>=factors){
    /*this inner loop runs only when the number being tested
    for prime is >= to factor being applied for test)*/
        if(PrimeOrNah%factors==0){
        break;
        }
        else{
        factors++;
            if(PrimeOrNah==factors)
            System.out.print(PrimeOrNah + " ");
        }
    }
    PrimeOrNah++;
    factors=2;
}

//step 3: bunch of smiles
        int HowManySmiles=(int)(Math.random()*196)+5;
        int HowManyLines=HowManySmiles/20; //determine number of full lines
        for(int a=0; a<HowManyLines; a++){  //print the smiles 20 times per line
            System.out.println(":3 ");
            for (int b=0;b<19;b++){
            System.out.print(":3 ");
        }
    }
        int finalLine=HowManySmiles%20; //last line with less than 20 smiles, if there is one
        int a=1;
        if(finalLine!=00){
        System.out.println(":3 ");
        }
        while(a<finalLine)
        {System.out.print(":3 " );
        a++;
        }
}
}
