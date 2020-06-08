import java.io.*;
import  java.util.*;
class EncodingThreeStrings {
	public class Result{
		public final String output1;
		public final String output2;
		public final String output3;

		public Result(String out1, String out2, String out3){
			output1 = out1;
			output2 = out2;
			output3 = out3;
		}
	}
    public Result encodeThreeStrings(String input1,String input2,String input3){
    String[] a = new String[3];
		String[] b = new String[3];
		String[] c = new String[3];
		a = getParts(input1);
		b = getParts(input2);
		c = getParts(input3);
		StringBuilder output1 = new StringBuilder (a[0] + b[0] + c[0]);
		StringBuilder output2 = new StringBuilder (a[1] + b[1] + c[1]);
		StringBuilder output3 = new StringBuilder (a[2] + b[2] + c[2]);
		for (int i = 0; i < output3.length(); i++) {
			if (Character.isLowerCase(output3.charAt(i)))
				output3.setCharAt(i, Character.toUpperCase(output3.charAt(i)));
			else
				output3.setCharAt(i, Character.toLowerCase(output3.charAt(i)));
		}
		Result r = new Result(output1.toString(), output2.toString(), output3.toString());
    return r;
 }
public static String[] getParts(String str) {
		int n = str.length();
		String[] parts = new String[3];
		int len = n / 3;	
		if (n % 3 == 0) {
			parts[0] = str.substring(0, len);
			parts[1] = str.substring(partLen, 2 * len);
			parts[2] = str.substring(2 * len, n);
		} else if (n % 3 == 1) {
			parts[0] = str.substring(0, len);
			parts[1] = str.substring(partLen, 2 * len + 1);
			parts[2] = str.substring(2 * len + 1, n);
		} else if (n % 3 == 2) {
			parts[0] = str.substring(0, len + 1);
			parts[1] = str.substring(partLen + 1, 2 * len + 1);
			parts[2] = str.substring(2 * len + 1, n);
		}
		return parts;
	}
}
