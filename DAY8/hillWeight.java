import java.io.*;
import  java.util.*;
class UserMainCode{
  public int totalHillWeight(int input1,int input2,int input3){
  int total=0;
		for(int i=1;i<=input1;i++){
			for(int j=1;j<=i;j++){
				total += input2;
			}
			input2 +=input3;
		}
		return total;
	}
}
