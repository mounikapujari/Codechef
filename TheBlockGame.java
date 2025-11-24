import java.lang.*;
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++){
		    int n=sc.nextInt();
		    int sum=0;
		    int temp=n;
		    while(n!=0){
		    int r=n%10;
		    sum=sum*10+r;
		    n=n/10;
		}
		if(sum==temp){
		    System.out.println("wins");
		}else System.out.println("loses");
		}
	}
}
