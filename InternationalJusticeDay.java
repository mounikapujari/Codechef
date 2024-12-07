import java.util.*;
class Codechef{
    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        int X=s.nextInt();
        int Y=s.nextInt();
        if(X>=1 && Y<=10){
            if(X>=Y){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}