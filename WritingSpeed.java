import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int X=s.nextInt();
		if(X>=1 && X<=1000){
		    if(X*5<=60){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
	}
}