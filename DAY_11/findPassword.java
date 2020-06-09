import java.io.*;
import  java.util.*;
class UserMainCode{
public int findPassword(int input1, int input2,int input3, int input4,int input5){
    int n1 = input1 +input2 +input3 +input4 +input5;
		int n2 =sum(input1)+sum(input2)+sum(input3)+sum(input4)+sum(input5);
		int n3 = n1-n2;
		return n2-n3;
	}
	public static int sum(int n){
		int m=n;
		int[] a = new int[10];
		int k=0;
		while(n!=0){
			int r = n%10;
			a[r]++;
			if(a[r]>0)
				k=a[r];
			n /= 10;
		}
		for(int j=0;j<10;j++){
			if(a[j]==0 ||a[j]==k)
				continue;
			else{
				return 0;
			}
		}
		return m;
	}
}
