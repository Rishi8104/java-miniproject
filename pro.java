import java.net.Socket;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class pro {

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int Mynumber= (int)(Math.random()*100);
        int usernumber=0;

    
        do{
            System.out.println("Guess a number Between(1-100)::");
            usernumber= sc.nextInt();

            if(usernumber==Mynumber)
            {
                System.out.println("Yepp THIS  IS CORRECCT NUMBER::");
                break;
            }
        
            else if(usernumber>Mynumber)
            {
                System.out.println("THIS IS TO LARGE NUMBER BUDDY:");
            }
            else
            {
                System.out.println("THIS IS TOO SMALL NUMBER BUDDY");
            }
        }while(usernumber>=0);

        System.out.println("My Number is::");
        System.out.println(Mynumber);
    }
}
