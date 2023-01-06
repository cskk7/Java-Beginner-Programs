/*
 Write a code to COUNT the DIGITS in a number
*/

import java.util.*;
import java.io.*;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        while(number > 0){
            count++;
            number /= 10;
        }
        System.out.println(count);
    }
}
