import java.io.*;
import  java.util.*;
class UserMainCode{
public int AddSub(int input1, int input2){
        if(input1>=1 && input1 <= 10000){
            int n = input1;
            int sum = n;
            int k =0;
            if(input2==1)
                k=1;
            else
                k=0;
            for(int i =n-1, j =0;i>=1;i--,j++){
                if(j%2==k)
                    sum += i;
                else
                    sum -=i;
            }
            return sum;
        }
        return 0;
    }
}
