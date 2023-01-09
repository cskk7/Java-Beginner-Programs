/*
 To print 2D array elements of size - row * col
 */
import java.util.Scanner;

public class Print2DArray {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int row = sc.nextInt();
       int col = sc.nextInt();
       int[][] mat = new int[row][col];
       for(int i = 0; i < row; i++){
        for(int j = 0; j < col; j++){
            mat[i][j] = sc.nextInt();
        }
       } 
       for(int i = 0; i < row; i++){
        for(int j = 0; j < col; j++){
            System.out.print(mat[i][j]+" ");
        }
        System.out.println();
       }
    }
    
}
