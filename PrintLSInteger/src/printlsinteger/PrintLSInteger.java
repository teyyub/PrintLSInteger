package printlsinteger;

import java.util.Scanner;

/**
 *
 * @author teyyub Sep 14, 2017
 */
public class PrintLSInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number, i = 0, max,min=0;
        while (i < 5) {
            number = scan.nextInt();
            if(number<min){
                min = number;
            } 
            i++;
        }
        System.out.println("min="+min); 
    }

}
