import java.io.*;
import  java.util.*;
class UserMainCode{
public int sumOfNonPrimeIndexValues(int[] input1, int input2){
    int sum=0;
		for(int i=0;i<input2;i++){
			if(i==0||i==1){
				sum +=input1[i];
				continue;
			}
			int isP = prime(i);
			if(isP==1)
				sum += input1[i];
		}
		return sum;
	}
	public static int prime(int num){
		for(int k=2;k<=num/2;k++){
			if(num%k==0)
				return 1;
		}
		return 0;
	}
}
