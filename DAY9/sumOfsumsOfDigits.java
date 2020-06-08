import java.io.*;
import  java.util.*;
class UserMainCode{
public int sumOfsumsOfDigits(int input1){
      if(input1>9){
			int t=0;
			int m = input1;
			int c=0;
			while(m!=0){
				c++;
				m /= 10;
			}
			int d = (int)Math.pow(10,c-1);
			t += sum(input1);
			while(input1!=0){
				int k = input1/d;
				input1 = input1 - (k*d);
				t += sum(input1);
				d /= 10;
			}
			return t;
		}
		return 0;
	}
	public static int sum(int n){
		int s=0;
		while(n!=0){
			int r = n%10;
			s +=r;
			n /= 10;
		}
		return s;
	}
}
