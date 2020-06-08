import java.io.*;
import  java.util.*;
class UserMainCode{
  public int digitSum(int input1){
  int s;
	s = sum(input1);
	while(s >= 10 || s <= -10){
			s = sum(s);
			System.out.print(s);
	}
	return s;
}
	public static int sum(int i){
		int sum1 = 0;
		while(i != 0){
			int r = i % 10;
			sum1 += r;
			i /= 10;
		}
		return sum1;
	}
}
