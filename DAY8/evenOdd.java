import java.io.*;
import  java.util.*;
class UserMainCode{
  public int EvenOdd(int input1, String input2){
  if(input1>=1 && input1<=25000){
		int sume = 0,sumo=0;
		while(input1 != 0){
			int r = input1 % 10;
			if(r % 2==0)
				sume += r;
			else
				sumo += r;
			input1 /= 10;
		}
		if(input2.equals("even"))
			return sume;
		else
			return sumo;
	}
	return 0;
	}
}
