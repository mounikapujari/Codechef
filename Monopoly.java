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
		    int P=s.nextInt();
		    int Q=s.nextInt();
		    int R=s.nextInt();
		    int S=s.nextInt();
		    if(P>Q+R+S || Q>P+R+S || R>Q+P+S || S>Q+R+P){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
	}
}