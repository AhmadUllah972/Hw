
package school.result;

import java.util.Scanner;

public class SchoolResult {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Score for Math: ");
            byte a = input.nextByte();
            System.out.println("Score for Chemistry: ");
            byte b = input.nextByte();
            System.out.println("Score for physics: ");
            byte c = input.nextByte();
            System.out.println("Score for biology: ");
            byte d = input.nextByte();
            double average = (a+b+c+d)/4;
            if(average >=60){
                if(average >= 70){
                    if(average >=80){
                        if(average >=90){
                           
                        } else
                            System.out.println("group A");
                        
                    }else
                        System.out.println("group B");
                    
                }else
                    System.out.println("group C");
                
                            
            }else
                System.out.println("group D");
            
        }
        

    }7
    
}
