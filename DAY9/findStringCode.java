import java.io.*;
import  java.util.*;
class UserMainCode{
  public int findStringCode(String input1){
    String s="";
		input1 = input1.toUpperCase();
		String[] a = input1.split("\\s");
		for(String w:a){
			s += Integer.toString(sum(w));
		}
	   return Integer.parseInt(String.valueOf(s));
	}
	public static int sum(String str){
		int t=0;
		int n = (str.length())/2;
		for(int i =0,j=str.length()-1; i < n && j < str.length();i++, j--){
			t += Math.abs((str.charAt(i)-64) - (str.charAt(j)-64));
		}
		if(str.length() % 2 !=0)
			t += str.charAt(n)-64;
		return t;
	}
}
