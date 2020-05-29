public class prog1 
{
    public static void main(String[] args) 
    {
        int N;
        N = Integer.parseInt(args[0]);
        if(N == 0)
        {
	System.out.println(N + " is zero ");  
        }
        else if(N > 0)
        {
	 System.out.println(N+" is Positive");
        }
        else
        {
	System.out.println(N+" is Negative");
        }
    }
}