import java.io.*;
import  java.util.*;
class UserMainCode{
  public int nthPrime(int input1){
  if(input1>=1 && input1<=1000){
			int num=1, count=0, i;
			while (count < input1){
      			num=num+1;
      			for (i = 2; i <= num; i++){
        			if (num % i == 0) {
          			break;
        		}
      		}
      		if ( i == num)
        		count = count+1;
    		}
			return num;
		}
		return 0;
	}
}
