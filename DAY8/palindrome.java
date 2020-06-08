import java.io.*;
import  java.util.*;
class UserMainCode{
  public int isPalin(int input1){
  if(input1 >= 1 && input1 <=25000){
			int s=0,r;
			int m = input1;
			while(m != 0){
				r = m % 10;
				s = (s * 10) + r;
				m /= 10;
			}
			if(input1==s)
				return 2;
			return 1;
		}
		return 0;
	}
}
