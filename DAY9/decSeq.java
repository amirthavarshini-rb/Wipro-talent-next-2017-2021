import java.io.*;
import  java.util.*;
class UserMainCode{
public class Resul{
  public final int output1;
  public final int output2;
  public Result(int out1,int out2){
    output1=out1;
    output2=out2;
  }
}
public Result decSequence(int[] input1, int input2){
    int count=0;
		int max=0;
		int maxi=0;
		int f=0;
		for(int i=0;i<input2-1;i++){
			if(input1[i]>input1[i+1]){
				if(f==0){
					f=1;
					count++;
				}
				max++;
				maxi=max > maxi ? max:maxi;
			}
			else{
				if(f==1){
					f=0;
					max=0;
				}
			}
		}
		if(count>0)
			maxi++;
		Result r = new Result(count,maxi);
		return r;
    }
}
