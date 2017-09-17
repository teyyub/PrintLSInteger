package printlsinteger;

import java.security.PrivateKey;
import java.util.Scanner;

/**
 *
 * @author teyyub Sep 14, 2017
 */
//don't use array
//maybe it needs a little improvement
public class PrintLSInteger {

   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
        int currentNumber, howMany, i = 0, max= Integer.MIN_VALUE, min = Integer.MAX_VALUE;//=Integer.MIN_VALUE; 
    
        System.out.println("how many numbers!");
        howMany = scan.nextInt();
        while (i < howMany) {
            currentNumber = scan.nextInt();

            if (currentNumber < min) {
                min = currentNumber;
            }
            if (currentNumber > max) {
                max = currentNumber;
            }
            i++;
        }
        System.out.println("min=" + min + " max= " + max);
//        memInfo();
    }

}
