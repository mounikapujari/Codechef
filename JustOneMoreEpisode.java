import java.util.*;
class Codechef
{
	public static void main (String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		for(int i=0;i<T;i++)
		{
		    int X=s.nextInt();
		    if(X>=1 && X<=100 && X>24){
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		}

	}
}