/*
 A B C D E
A B C D E
A B C D E
A B C D E
A B C D E
 */

import java.util.*;

public class Alphabet2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch;
        for(int i = 1; i < n; i++){
            ch = 'A';
            for(int j = 0; j < n; j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}