
package swap.two.number;

import java.util.Scanner;

public class SwapTwoNumber {

    public static void main(String[] args) {
      new Scanner (System.in);
      Scanner input=new Scanner(System.in);
      while(true){
          System.out.println("Enter a value for x; ");
          double x =input.nextDouble();
          System.out.println("Enter a value for y; ");
          double y =input.nextDouble();
          double z;
          z=x;
          x=y;
          y=z;
          System.out.println("x= " + (int)x);
          System.out.println("y= " + (int)y );
          System.out.println("");
          
          
      }
              
      
    }
    
}
