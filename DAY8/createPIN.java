import java.io.*;
import  java.util.*;
class UserMainCode{
  public int createPIN(int input1,int input2,int input3){
  if(input1>=100 && input1<=999 && input2>=100 && input2<=999 && input3>=100 && input3<=999){
			int o = min(input1 % 10, input2 % 10,input3 % 10);
			int t = min((input1 / 10)%10, (input2 / 10)%10,(input3 / 10)%10);
			int h = min(input1 / 100, input2 / 100,input3 / 100);
			int th1 =max(input1);int th2 =max(input2);int th3 =max(input3); 
			int th=  th3 > (th1>th2 ? th1:th2) ? th3:((th1>th2) ? th1:th2);
			return (th*1000 + h *100+ t*10 + o);
		}
		return 0;
	}
	public static int min(int i,int j,int k){
		int min1 = i<j ? i : j;
		int min2 = min1<k ? min1 : k;
		return min2;
	}
	public static int max(int i){
		int m=0;
		while(i!=0){
			int r = i % 10;
			if(r>m)
				m=r;
			i /= 10;
		}
		return m;
	}
}
