import java.io.*;
import  java.util.*;
class UserMainCode{
public int identifyPossibleString(String input1, String input2){
    input1 = input1.toUpperCase();
		input2 = input2.toUpperCase();
		String[] a = input2.split(":");
		int index = input1.indexOf("_");
		String s="";
		for(int i = 0;i<a.length;i++){
			if(a[i].length()!=input1.length())
				continue;
			String s1=input1;
			char ch = a[i].charAt(index);
			s1 = s1.replace('_',ch);
			if(s1.equals(a[i])){
				if(s.isEmpty())
					s +=s1;
				else
					s += ":"+s1;
			}
		}
		if(s.isEmpty())
			s="ERROR-009";
		return s;
	}
}
