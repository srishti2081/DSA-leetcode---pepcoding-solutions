
import java.util.*;
//printing factorial
public class Factorial {

    public static void factorial(int n,int sum){
        if(n==1){
            sum=sum*n;
            System.out.println(sum);
            return ;
        }

        sum= sum*n;
        factorial(n-1,sum);
    }
    public static void main(String[] args) {
        factorial(5,1);
    }
    
}
