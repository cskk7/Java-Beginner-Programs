/*
 Write a code to check whether the number is PALINDROME or NOT
*/

import java.util.*;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number  = sc.nextInt();

        int temp = number;
        int rev = 0;
        while(number > 0 ){
            int x = number%10;
            rev = rev*10 + x;
            number /= 10;
        }
        System.out.println(rev == temp ? "It is a palindrome" : "It is NOT a palindrome");
        
    }
}
