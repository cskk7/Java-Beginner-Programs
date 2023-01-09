/*
  To find TRANSPOSE of the MATRIX

  1 2 3
  4 5 6
  7 8 9

   | |
   | |
  \  /
   \/
 1 4 7
 2 5 8 
 3 6 9

 */
import java.util.Scanner;

public class TransposeMatrix {
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
        int[][] ans = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                ans[i][j] = mat[j][i];
            }
        }
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
