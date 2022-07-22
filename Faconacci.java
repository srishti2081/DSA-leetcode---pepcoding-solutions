import java.util.*;
public class Faconacci {
    public static void faconacciseries(int a, int b,int n){
        if(n==0){
            return;
        }
    int sum = a+b;
    System.out.println(sum);
    faconacciseries(b,sum,n-1);

    }
    public static void main(String[] args) {
     int a=0;
     int b=1;  
     int n=8; 
     System.out.println(a);
     System.out.println(b);
     faconacciseries(a,b,n-2);
    }
}
