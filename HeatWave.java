import java.util.*;
class Codechef{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int X=s.nextInt();
        int Y=s.nextInt();
        if(X>=100 && Y<=150){
        if(Y>X){
            System.out.println("YES");
        }else{
            System.out.println("No");
        }
      }
    }
}