/*
 Write a code to REVERSE the DIGITS in an integer
*/

import java.util.*;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int rev = 0;
        while(number > 0){
            int x = number % 10;
            rev = rev*10 + x;
            number /= 10;
        }
        System.out.println(rev);
    }
}
