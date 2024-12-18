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
		    int X=s.nextInt();
		    int a[]=new int[N];
		    for(int j=0;j<N;j++){
		        a[j]=s.nextInt();
		    }
		    int count=0;
		    for(int j=0;j<N;j++){
		        if(a[j]>=X){
		            count++;
		        }
		    }System.out.println(count);
		}
	}
}