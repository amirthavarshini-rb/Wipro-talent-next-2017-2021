import java.io.*;
import  java.util.*;
class UserMainCode{
  public int addLastDigits(int input1,int input2){
  int n1 = Math.abs(input1 % 10);
  int n2 = Math.abs(input2 % 10);
  return n1 + n2;
	}
}
