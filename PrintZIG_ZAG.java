import java.util.*;
public class PrintZIG_ZAG {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pzz(n);
        
        sc.close();
        
    }

    public static void pzz(int n){
        if(n==0){
            return;
        }
        System.out.println("PRE "+ n );
        pzz(n-1);
        System.out.println("IN "+ n );
        pzz(n-1);
        System.out.println("POST "+ n );
    }
}
