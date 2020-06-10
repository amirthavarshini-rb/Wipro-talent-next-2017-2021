import java.io.*;
import  java.util.*;
class UserMainCode{
public int moveRobot(int input1, int input2,String input3,String input4){
    String[] cur = input3.split("-");
		String[] move = input4.split(" ");
		int x = Integer.parseInt(cur[0]);
		int y = Integer.parseInt(cur[1]);
		String dir = cur[2];
		int f=0;
		for(String s:move){
			if(s.equals("R")){
				if(dir.equals("N"))
					dir="E";
				else if(dir.equals("E"))
					dir="S";
				else if(dir.equals("S"))
					dir="W";
				else
					dir="N";
			}
			else if(s.equals("L")){
				if(dir.equals("N"))
					dir="W";
				else if(dir.equals("E"))
					dir="N";
				else if(dir.equals("S"))
					dir="E";
				else
					dir="S";
			}
			else if(f != 1){
				if(dir.equals("N")){
					if(input2 > y ) 
						y += 1; 
					else
						f=1;
				}
				else if(dir.equals("S")){
					if(y>0)
						y -=1;
					else
						f=1;
				}
				else if(dir.equals("E")){
					if(input1 > x ) 
						x += 1; 
					else
						f=1;
				}
				else{
					if(x>0) 
						x -=1;
					else
						f=1;
				}
			}
		}
		if(f != 1)
			return String.valueOf(x)+"-"+String.valueOf(y)+"-"+String.valueOf(dir);
		else
			return String.valueOf(x)+"-"+String.valueOf(y)+"-"+String.valueOf(dir)+"-ER";
	}
}
