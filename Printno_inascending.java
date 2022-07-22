import java.util.*;
//print number in ascending order
public class Printno_inascending {
    public static void printnumber(int n ,int m){
        if(n==m+1){
            return;
        }
    
        System.out.println(n);
        printnumber(n+1,m);
    }
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       
       int n = sc.nextInt();
       int m = sc.nextInt();
       
       printnumber(n,m);        
       
       
       
       
    
    }
}
