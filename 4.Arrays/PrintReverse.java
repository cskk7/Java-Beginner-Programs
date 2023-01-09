/*
  To print elements in the array in reverse.
 */

import java.util.Scanner;

public class PrintReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n]; // taking input of the size
        for(int i = 0; i < n; i++){ // taking input os the elements
            arr[i] = sc.nextInt();
        }
        for(int i = n - 1; i >= 0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}
