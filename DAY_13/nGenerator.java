import java.io.*;
import  java.util.*;
class UserMainCode{
public int nGenerator(String input1){
    String s = "";
		int i,j;
		int[] a= new int[input1.length()];
		for(i=0;i<a.length;i++)
			a[i]=Integer.parseInt(String.valueOf(input1.charAt(i)));
		for(i=0;i<a.length;i++){
			int sum=a[i];
			if(a[i]%2==1){
				for(j=i+1;j<a.length;j++){
					if(sum%2==1){
						sum += a[j];
					}
					else{break;}
				}
				i=j-1;
				s +=Integer.toString(sum);
			}
			else{
				for(j=i+1;j<a.length;j++){
					if(sum%2==0){
						sum += a[j];
					}
					else{break;}
				}
				i=j-1;
				s +=Integer.toString(sum);
			}
		}
		return Integer.parseInt(s);
	}
}
