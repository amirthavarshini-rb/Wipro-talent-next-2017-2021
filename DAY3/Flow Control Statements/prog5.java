public class prog5{
public static void main(String args[])
    {
        char ch='a';
        if(ch>=48 && ch<=57)
        {
            System.out.print("Digit");

        }
        else if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
        {
            System.out.print("Alphabet");
        }
        else
        {
            System.out.print("Special character");

        }
    }
}