import java.io.*;
import  java.util.*;
class UserMainCode{
  public int SecondLastDigitOf(int input1){
  if(input1 < 10 && input1 > -10){
			return -1;
		}
		int n = Math.abs(input1);
		n = n / 10;
		return n % 10;
		
	}
}
