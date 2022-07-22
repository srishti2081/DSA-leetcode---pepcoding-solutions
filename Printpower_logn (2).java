//here stack height is logn

import java.util.*;
 //x^n = x^n/2 * x^n/2  ...if n is even
//x^n = x^n/2 * x^n/2 * x .... if n is odd

public class Printpower_logn {

    public static int printpow(int x, int n){
        if(n==0){
            return 1;//base case1
        }
        if(x==0){
            return 0;//base case 2
        }
        //n is even 
        if(n % 2 ==0){
            return printpow(x, n/2) * printpow(x, n/2);
        }
        //n is odd
        else{
            return printpow(x, n/2) * printpow(x, n/2) * x;
        } 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        
        int ans = printpow(x,n);
        System.out.println(ans);
    
        sc.close();
        
        
    }
    
}
    