import java.io.*;
import  java.util.*;
class UserMainCode{
  public int nthFibonacci(int input1){
  int t1=0,t2=1,t;
		if(input1==1)
			return t1;
		if(input1==2)
			return t2;
		for(int i=3;i<=input1;i++){
			t=t1+t2;
			if(input1==i){
				return t;
			}
			t1=t2;
			t2=t;
		}
		return 0;
	}
}


