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
		    int A=s.nextInt();
		    int B=s.nextInt();
		    int C=s.nextInt();
		    int D=s.nextInt();
		   if(A<=C && B<=D){
		       System.out.println("POSSIBLE");
		   }else{
		       System.out.println("IMPOSSIBLE");
		   }
		}

	}
}