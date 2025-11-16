
package simple_interest;

import java.util.Scanner;

public class Simple_interest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Enter the total finance: ");
            double f = input.nextDouble();
            System.out.println("Enter the time (in years): ");
            double t = input.nextDouble();
            System.out.println("Enter the rate: ");
            double r = input.nextDouble();
            double interest = (t*r*f)/100.0;
            System.out.println("simple interest =" + interest);
            System.out.println("");
        }
        
        
    }
    
}
