import java.io.*;
import  java.util.*;
class UserMainCode{
  public int getCode(String input1){
    int n=0;
		for(int i =0 ;i<input1.length();i++){
			if(input1.charAt(i)==' ')
				continue;
			n++;
		}
		while(n>10){
			n = func(n);
		}
		return n;
	}
	public static int func(int s){
		int sum=0;
		while(s!=0){
			int r = s % 10;
			sum += r;
			s /= 10;
		}
		return sum;
	}
}
