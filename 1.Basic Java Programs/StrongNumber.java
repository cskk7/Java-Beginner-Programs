/*
 Write a code to check whether the input is STRONG NUMBER or NOT
*/

import java.util.*;
import java.io.*;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        int temp = number;
        while(number > 0){
            int x = number % 10;
            sum = sum + fact(x);
            number /= 10;
        }
        if(sum==temp){
            System.out.println("Strong Number");
        }else{
            System.out.println("Not a Strong Number");
        }
    }
    public static int fact(int number){
        int fact = 1;
        for(int i = 1; i <= number; i++){
            fact = fact*i;
        }
        return fact;
    }
}
