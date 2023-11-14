/*
Write a program to find the index of the largest element in an array
 */


import java.util.*;

public class IndexOfLargest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int index = -1;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < n; i++){
            if(arr[i] > max){
                index = i;
                max = arr[i];
            }
        }
        System.out.print(index);
    }
}