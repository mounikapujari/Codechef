import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s=new Scanner(System.in);
	    int T=s.nextInt();
	    for(int i=0;i<T;i++){
	        int x=s.nextInt();
	         int m=s.nextInt();
	          int d=s.nextInt();
	          if((x*m)<(x+d)) System.out.println(x*m);
	          else System.out.println(x+d);
	    }

	}
}
