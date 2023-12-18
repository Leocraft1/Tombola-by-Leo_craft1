package tombola;
import java.util.Scanner;

//@author leona
public class TOMBOLA{
    public static void main(String[]args){
        //DECLARATIONS
        int randomNumber,cout=0,c=0;
        int[]table;
        //INPUT
        Scanner keyb=new Scanner(System.in);
        TOMBOLA callMethods=new TOMBOLA();
        //OPERATIONS
        //Console clearing
        System.out.print("\033[H\033[2J");
        table=new int[90];
        while(c<90){
            randomNumber=(int)(Math.random()*90)+1;
            if(callMethods.randomVerifier(table,randomNumber)){
                table[randomNumber-1]=randomNumber;
                System.out.println("Il numero estratto e': "+randomNumber);
                for(int i=0;i<90;i++){
                    if(cout==10){
                        System.out.println("");
                        cout=0;
                    }
                    if(table[i]>9){
                        System.out.print(table[i]+" ");
                    }else{
                        System.out.print(table[i]+"  ");
                    }
                    cout++;
                }
                System.out.println("");
                System.out.println("Premi invio per continuare ad estrarre: ");
                keyb.nextLine();
                c++;
            }
        }
        //OUTPUT
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
}