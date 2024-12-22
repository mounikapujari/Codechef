import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++){
		    int X=s.nextInt();
		    int Y=s.nextInt();
		    int Z=s.nextInt();
		    if(X+(Z*2)>=Y) System.out.println("YES");
		    else System.out.println("NO");
		}

	}
}
