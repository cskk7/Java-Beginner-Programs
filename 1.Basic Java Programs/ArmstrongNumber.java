/*
  To find whether the input is Armstrong number or not
 */
import java.util.*;
import java.io.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = number;
        int sum = 0;
        String num = Integer.toString(number); // converting int to string
        int size = num.length();              // finding and storing the number of digits 
        while(number>0){
            int x = number % 10;
            sum = sum + (int)Math.pow(x,size);
            number /= 10;
        }
        if(sum==temp){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not a Armstrong Number");
        }
    }
}
