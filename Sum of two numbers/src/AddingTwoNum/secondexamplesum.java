package AddingTwoNum;
import java.util.Scanner;
import Multwonumbers.*;
public class secondexamplesum {

    public static void main(String[] args) {
    	multiplication A = new multiplication();
    	
    	A.toString();
    	 System.out.println("Enter First A: "+A);
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();
        
         System.out.println("Enter Second Number: ");
        
         System.out.println("Enter Second Number: ");
        
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();
        
        sc.close();
        sum = num1 + num2;
        System.out.println("Sum of these numbers: "+sum);
    }
}
