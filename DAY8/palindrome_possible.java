import java.io.*;
import  java.util.*;
class UserMainCode{
  public int isPalinPossible(int input1){
  if(input1>=1 &&input1<=25000){
		int[] a = new int[10];
        while (input1 > 0) {
            int r = input1 % 10;
            a[r]++;
            input1 /= 10;
        }
		for (int i = 0; i < 10; i++) {
            if (a[i]  == 1) {
				a[i] +=1;
				break;
			}
		}
        for (int i = 0; i < 10; i++) {
            if (a[i] % 2 != 0) {
                return 1;
            }
        }
		return 2;
		}
		return 0;
	}
}

