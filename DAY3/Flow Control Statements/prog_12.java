public class prog12 { 
public static void main(String[] args) { 
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt(); 
	int f=0; 
	for(int i=1;i<=n/2;i++) { 
		if(n%i==0) {
			f=1;
			break;
		}		
	}
	if(f==0) 
		System.out.println("Prime"); 
	else 
		System.out.println("Not prime"); 
       }
}
