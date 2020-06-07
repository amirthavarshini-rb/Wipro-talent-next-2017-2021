import java.io.*;
import  java.util.*;
class UserMainCode{
  public int nFactorial(int input1){
  if(input1>=1 && input1<=12){
		int f=1;
		for(int i=1;i<=input1;i++)
			f=f*i;
		return f;
		}
		return 0;
	}
}
