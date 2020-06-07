import java.io.*;
import  java.util.*;
class UserMainCode{
  public int isPrime(int input1){
  if(input1 >= 2 && input1 <=5000){
			int f=1;
			for(int i=2;i<=input1/2;i++){
				if(input1%i==0){
					f=0;
				}
			}
			if(f==1)
				return 2;
			else
				return 1;
		}
		return 0;
	}
}
