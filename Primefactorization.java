import java.util.*;
import java.util.Scanner;

public class Primefactorization {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();

    for(int div=2; div*div<n; div++) {
       while( n % div==0){
        n= n/ div;
        System.out.print(div);
        System.out.print(",");
       }
    }
    if(n!=1){
        System.out.print(n);
    }

}    
}
