import java.io.*;
import  java.util.*;
class UserMainCode{
  public int MostFrequentDigit(int input1,int input2,int input3,int input4){
  String s = String.valueOf(input1) + String.valueOf(input2) + String.valueOf(input3) + String.valueOf(input4);
		int[] a = new int[10] ;
		for (int i = 0; i < s.length(); i++)
		{
			a[Integer.parseInt(String.valueOf(s.charAt(i)))]++;
		}
		int max = 0;
		for (int i = 0; i < 10; i++) 
		{
			max = a[i] >= a[max] ? i : max;
		}
		return max;
	}
}
