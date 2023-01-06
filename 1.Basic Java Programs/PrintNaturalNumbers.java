/*
 Write a code to print NATURAL NUMBERS
*/

import java.util.*;
import java.io.*;

public class PrintNaturalNumbers {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    for(int i = 1; i <= number; i++){
        System.out.print(i+" ");
    }
    }
}
