import java.util.*;
import java.lang.*;
import java.io.*;

class Advitiya
{
	public static void main (String[] args) 
	{
	   Scanner s=new Scanner(System.in);
	   int n=s.nextInt();
	   if((n>=1)&&(n<=18))
	   {
	    if((n==16)|(n==17)|(n==18)){
	        System.out.println("ADVITIYA");
	    }else{
	        System.out.println("WAITING FOR ADVITIYA");
	    }   
	   }

	}
}

