package sum.of.natural.number;

import java.util.Scanner;

public class SumOfNaturalNumber {

    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      while(true){
          System.out.println("Enter the value for N: ");
          int N=input.nextInt();
          int sum=N*(N+1)/2;
          System.out.println("Answer = " + sum);
          System.out.println("");
      }
      

    }
    
}