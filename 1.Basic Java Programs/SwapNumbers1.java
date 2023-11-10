/*
 Write a code to swap two numbers using temporary variable
 */

import java.util.*;

public class SwapNumbers1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        System.out.println("Numbers before swapping: "+number1+","+number2);

        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("Numbers after swapping: "+number1+","+number2);

        
    }
}
