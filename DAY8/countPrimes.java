import java.io.*;
import  java.util.*;
class UserMainCode{
  public int countPrimes(int input1,int input2){
  int c=0;
	while (input1 < input2) {
            int f=1;
            for(int i = 2; i <= input1/2; ++i) {
                if(input1 % i == 0) {
                    f = 0;
                    break;
                }
            }
            if (f==1 && input1 != 0 && input1 != 1)
                c++;

            ++input1;
		}
		return c;
	}
}
