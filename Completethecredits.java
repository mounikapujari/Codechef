import java.util.*;
class Codechef{
    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int i=0;i<T;i++){
            int x=s.nextInt();
            if(x>65){
                System.out.println("Overload");
            }else if(x<35){
                System.out.println("Underload");
            }else{
                System.out.println("Normal");
            }
        }
    }
}