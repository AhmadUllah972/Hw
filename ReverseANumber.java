
package reverse.a.number;

import java.util.Scanner;

public class ReverseANumber {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        while(true){
            System.out.println("Enter a three digit number: ");
            int x = input.nextInt();
            int a = (x%10)*100;
            int b = ((x/10)%10)*100;
            int c = x/100;
            int reverse = a+b+c;
            System.out.println("reverse");
            System.out.println("");
        }
        

    }
    
}
