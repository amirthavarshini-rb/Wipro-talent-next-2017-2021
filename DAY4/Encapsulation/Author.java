public class Author
{
	public static String email;
	public static char gender;
	public static String name;
	Author(String n,String e,char g)
	{
		name=n;
		email=e;
		gender=g;
	}
	public String toString() {
		return name + " (" + gender + ") at " + email;
	}
}