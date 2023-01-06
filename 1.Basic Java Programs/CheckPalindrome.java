/*
 Write a code to check whether the number is PALINDROME or NOT
*/

import java.util.*;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int rev = 0;
        int temp = number;
        while(number > 0){
            int x = number % 10;
            rev = rev*10 + x;
            number /= 10;
        }
        if(rev==temp){
            System.out.println("Palindrome Number");
        }else{
            System.out.println("Not a Palindrome Number");
        }
    }
}
