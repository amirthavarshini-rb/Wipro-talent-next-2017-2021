import java.io.*;
import  java.util.*;
class UserMainCode{
public int Nseies(int input1, int input2, int input3, int input4){
    int n1 = input2 - input1; 
		int n2 = input3 - input2;
		int t1=0;int t2=0;int t3=0;
		t1 = input1;
		for(int i=0;i<input4/2;i++){
			t2 = t1 + n1;
			t3 = t2 + n2;
			if(input4%2==0){
				if(i==input4/2-1)
				return t2;
			}
			else{
				if(i==input4/2-1)
				return t3;
			}
			t1=t3;
		}
		return 0;
	}
}
