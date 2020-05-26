import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static void main(String args[] ) throws Exception {
        int count=0;
        String binary = "";
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        while(num > 0)
        {
            int a = num % 2;
            if(a==0)
                count++;
            binary = a + binary;
            num = num / 2;
        }
        System.out.print(binary);
        System.out.println(count);   
    }
}