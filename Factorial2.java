import java.util.*;
public class Factorial2 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int fact=factorial(n);
    System.out.println(fact);
    sc.close();
    
   } 
   public static int factorial(int n) {
    if(n==1 ){
        return 1;
    }
    int fn =factorial(n-1);
    int f=n*fn;
    return f;
   }
}
