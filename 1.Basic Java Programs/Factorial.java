/*
 Write a code to find the factorial os a number
*/

import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int fact = 1;
        for(int i = 1; i <= number; i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
