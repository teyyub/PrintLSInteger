package printlsinteger;

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
        int currentNumber,howMany, i = 0, max ,min=Integer.MIN_VALUE; 
        max = min;
        System.out.println("how many numbers!");
        howMany = scan.nextInt();
        while (i < howMany) {
            currentNumber = scan.nextInt();             
            if(currentNumber<min){
                 min = currentNumber;
            } 
             if(currentNumber>max){
               max = currentNumber;
            }
            i++;
        }
        System.out.println("min="+min+" max= "+max); 
//        memInfo();
}

}
