import java.util.*;

public class IndexOfSmallest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        int index = -1;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < n; i++){
            if(arr[i] < min){
                min = arr[i];
                index = i;
            }
        }
        System.out.print(index);
    }
}