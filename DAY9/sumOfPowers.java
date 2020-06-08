import java.io.*;
import  java.util.*;
class UserMainCode{
public int sumOfPowerOfDigits(int input1){
      if(input1>9){
			int sum=0;
			while(input1!=0){
				int r1 = input1%10;
				input1 /= 10;
				int r2 = input1 %10;
				sum += Math.pow(r2, r1);
			}
			return sum+1;
		}
		return 0;
	}
}
