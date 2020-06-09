import java.io.*;
import  java.util.*;
class UserMainCode{
public int RemoveDigit(int input1){
    int[] a = new int[10];
		int rev=0,k=-1;
		int n = input1;
		while(n!=0){
			int r=n%10;
			a[r]++;
			rev=(rev*10) + r;
			n /= 10;
		}
		if(input1==rev)
			return -1;
		for(int i=0;i<10;i++){
			if(a[i]%2==1)
				k=i;
		}
		return k;
	}
}
