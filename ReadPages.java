import java.util.*;
class Codechef
{
	public static void main (String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		for(int i=0;i<T;i++){
		    int N=s.nextInt();
		    int X=s.nextInt();
		    int Y=s.nextInt();
		    if(N>=1 && N<=100 && X>=1 && Y<=10 && X*Y>=N)
		    {
		      System.out.println("YES"); 
		     }else
		      System.out.println("No"); 

		    }
	}
}
