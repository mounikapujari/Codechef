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
		    int X=s.nextInt();
		    if(X>=1 && X<=10){
		        System.out.println("yes");
		    }else{
		        if(X>10 && X<=100)
		        System.out.println("no");
		    }
		}
	}
}