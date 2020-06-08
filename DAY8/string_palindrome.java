import java.io.*;
import  java.util.*;
import  java.lang.*;
class UserMainCode{
  public int isPalindrome(String input1){
  input1 = input1.toLowerCase();
		StringBuilder sb=new StringBuilder(input1);  
    	sb.reverse();  
    	String r=sb.toString();  
    	if(input1.equals(r))  
        	return 2;  
    	else
        	return 1;  
    
	}
}
