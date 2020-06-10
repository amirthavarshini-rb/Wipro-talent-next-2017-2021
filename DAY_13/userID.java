import java.io.*;
import  java.util.*;
class UserMainCode{
public int userID(String input1,String input2, int input3, int input4){
    String s="";
		String str="";
		int l1=input1.length();int l2=input2.length();
		if(l1<l2)
			s +=input1.charAt(l1-1)+input2;
		else if(l2<l1)
			s +=input2.charAt(l2-1)+input1;
		else{
			if((input1.compareTo(input2)<0))
				s +=input1.charAt(l1-1)+input2;
			else
				s +=input2.charAt(l2-1)+input1;
		}
		String n1 = Integer.toString(input3);
		s += n1.charAt(input4-1) ;
		s += n1.charAt(n1.length()-input4);
		for(int i=0;i<s.length();i++)
			if(Character.isUpperCase(s.charAt(i)))
				str += Character.toLowerCase(s.charAt(i));
			else
				str += Character.toUpperCase(s.charAt(i));
		return str;
	}
}
