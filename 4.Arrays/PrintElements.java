/*
  To print the elements in the array
 */

import java.util.Scanner;

public class PrintElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // taking the size of array as integer
        int[] arr = new int[n]; // declaring the array with size 'n'
        // Taking input of array elements using for loop
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt(); // each element gets stored in each index from '0' to 'n - 1'
        }
        // Printing the array elements using for loop iteration
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}
