import java.io.*;
import  java.util.*;
class UserMainCode{
  public int countEvenOdd(int input1,int input2,int input3,int input4,int input5,String input6){
  int ec=count(input1)+count(input2)+count(input3)+count(input4)+count(input5);
    	int oc=5-ec;
		System.out.print(ec +" "+oc);
		if(input6.equals("odd"))
			return oc;
		else
			return ec;
	}
	public int count(int i){
		if(i%2==0)
			return 1;
		else
			return 0;
	}
}
