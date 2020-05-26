import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution{
    public static void main(String args[] ) throws Exception {
        int i,j;
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int col = s.nextInt();
        boolean[][] arr = new boolean[row][col];
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                arr[i][j]=s.nextBoolean();
            }
        }
        for(i=0;i<row;i++){
            for(j=0;j<col;j++) {
                if(arr[i][j]){
                    System.out.print("t ");
                }
                else{
                    System.out.print("f ");
                }
            }
            System.out.println();
    }
}
}