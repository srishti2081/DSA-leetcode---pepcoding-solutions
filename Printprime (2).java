import java.util.*;
//print prime number upto n
public class Printprime {
  
    public static void printprime(int i,int n,int sum) {
        if(i==n){
            sum = sum+i;
            System.out.println(sum);
            
            return;
        }

        sum =sum+i;
        printprime(i+1, n,sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int n = sc.nextInt();
        
        printprime(i,n,0);
        
        
        
        sc.close();
        
    }
}
