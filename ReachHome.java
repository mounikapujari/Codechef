import java.util.*;
class Codechef
{
	public static void main (String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		for(int i=0;i<T;i++)
		{
		int x=s.nextInt();
		int Y=s.nextInt();
		if(x*5>=Y)
		{
		    System.out.println("YES");
		}else
		System.out.println("No");
		}

	}
}
