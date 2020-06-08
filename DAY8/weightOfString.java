import java.io.*;
import  java.util.*;
class UserMainCode{
  public int weightOfString(String input1,int input2){
  input1 = input1.toUpperCase();
		int v=0;
		int c=0;
		for(int i=0;i<input1.length();i++){
			if(input1.charAt(i)=='A' ||input1.charAt(i)=='E' ||input1.charAt(i)=='I' 
			||input1.charAt(i)=='O' ||input1.charAt(i)=='U'){
				v += (input1.charAt(i) - 64);
			}
			else if(input1.charAt(i)>=32 && input1.charAt(i)<=64){
				c += 0;
			}
			else{
				c += (input1.charAt(i) - 64);
			}
		}
		if(input2==0)
			return c;
		return v+c;
	}
}
