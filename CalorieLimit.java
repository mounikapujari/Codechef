import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		for(int j=0;j<T;j++){
		    int N=s.nextInt();
		    int K=s.nextInt();
		    int A[]=new int[N];
		    int c=0;
		    int calorie=0;
		    for(int i=0;i<N;i++){
		        A[i]=s.nextInt();
		    }for(int i=0;i<N;i++){
		        calorie+=A[i];
		        if(calorie<=K){
		            c++;
		        }else  break;
		    }
		    System.out.println(c);
		    
		}

	}
}
