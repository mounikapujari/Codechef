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
		    int Sal=s.nextInt();
		    double Gross_Salary;
		    if(Sal<1500){
		        double HAR=(double)Sal*0.1;
		        double DA=(double)Sal*0.9;
		        Gross_Salary=Sal+HAR+DA;
		        System.out.println(Gross_Salary);
		      }else{
		          if(Sal>=1500){
		              int HAR=500;
		              double DA=(double)Sal*0.98;
		              Gross_Salary=Sal+HAR+DA;
		              System.out.println(Gross_Salary);
		          }
		      }
		}
	}
}
