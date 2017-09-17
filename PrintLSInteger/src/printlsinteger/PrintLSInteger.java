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
        int number, i = 0, max=0,min=0;
        min = scan.nextInt();
        max = min;
        while (i < 4) {
            number = scan.nextInt();             
            if(number<min){
                 min = number;
            } 
             if(number>max){
               max = number;
            }
            i++;
        }
        System.out.println("min="+min+" max= "+max); 
}

}
