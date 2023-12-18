package tombola;
import java.util.Scanner;

//@author leona
public class main{
    public static void main(String[]args){
        //DECLARATIONS
        int randomNumber,cout=0,c=0;
        int[]table;
        //INPUT
        Scanner keyb=new Scanner(System.in);
        main callMethods=new main();
        //OPERATIONS
        //Console clearing (disabled due to a visual bug)
        //callMethods.clearScreen();
        table=new int[90];
        while(c<90){
            //Randomize a number between 1 and 90
            randomNumber=(int)(Math.random()*90)+1;
            //randomVerifier method verifies if the random number has already been randomized before
            if(callMethods.randomVerifier(table,randomNumber)){
                table[randomNumber-1]=randomNumber;
                //Console clearing (disabled due to a visual bug)
                //callMethods.clearScreen();
                System.out.println("========================================================================================================================");
                System.out.println("Il numero estratto e': "+randomNumber);
                //Print the table
                for(int i=0;i<90;i++){
                    if(cout==10){
                        System.out.println("");
                        cout=0;
                    }
                    if(table[i]==0){
                        System.out.print("-- ");
                    }else if(table[i]>9){
                        System.out.print(table[i]+" ");
                    }else{
                        System.out.println("  ");
                    }
                    cout++;
                }
                System.out.println("");
                System.out.println("========================================================================================================================");
                System.out.print("Premi invio per continuare ad estrarre: ");
                keyb.nextLine();
                c++;
            }
        }
        //OUTPUT
        //Game end
        System.out.println("Gioco terminato.");
    }
    static boolean randomVerifier(int[]table,int randomNumber){
        boolean randomOk=true;
        for(int i=0;i<90;i++){
            if(table[i]==randomNumber){
                randomOk=false;
            }
        }
        return randomOk;
    }
    static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
    }
}