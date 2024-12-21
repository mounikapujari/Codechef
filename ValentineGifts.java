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
		  int N=s.nextInt();
		  int init=1;
		  int Total=0;
		  for(int j=1;j<=6;j++){
	          init*=2;
		    Total+=init;
		}if(Total<N){
		    System.out.println("YES");
		}else System.out.println("NO");

	}
}
}