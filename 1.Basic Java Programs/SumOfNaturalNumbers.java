/*
 Write a code to find the SUM of First Natural Numbers
*/

import java.util.*;

class SumOfNaturalNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for(int i=1 ;i <= number; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}