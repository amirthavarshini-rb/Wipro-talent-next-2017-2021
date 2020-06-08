import java.io.*;
import  java.util.*;
class UserMainCode{
  public int secondUpperCase(String input1){
  String word="";
		for(int i=0;i<input1.length();i++){
			if(input1.charAt(i)==' '){
				for(int j=i+1;j<input1.length();j++){
					if(input1.charAt(j)==' ')
						break;
					word += input1.charAt(j);
					
			}
			break;
		}
		}
		if(word.isEmpty())
			return "LESS";
		return word.toUpperCase();
	
}
}
