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
		    int a=s.nextInt();
		    int b=s.nextInt();
		    if((a+b)%2==0)
		    System.out.println("Bob");
		    else System.out.println("Alice");
		}
	}
}