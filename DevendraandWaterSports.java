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
		    int z=s.nextInt();
		    int Y=s.nextInt();
		    int A=s.nextInt();
		    int B=s.nextInt();
		    int C=s.nextInt();
		    if((z-Y)>=(A+B+C)){
		        System.out.println("Yes");
		    }else System.out.println("No");
		}

	}
}
