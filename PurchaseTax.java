
package purchase.tax;

import java.util.Scanner;

public class PurchaseTax {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Enter the purchase amount in dollors: ");
            double purchase = input.nextDouble();
            double tax = purchase *0.06;
            System.out.println("tax = "+(int)(tax * 100)/100.0);
            System.out.println("");
        }
    
    }
    
}
