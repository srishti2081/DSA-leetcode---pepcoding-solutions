import java.util.*;

/**
 * Decimaltoanybase
 */
public class Decimaltoanybase {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int base=sc.nextInt();
        int ans = decimalbase(n,base);

        System.out.println(ans);
    }

    public static int decimalbase(int n,int base){
        int r=0;

        int pow=1;
        while(n>0){
           int dig =n%base;
           n=n/base;

           r +=dig *pow;
           pow=pow*10;

        }

        return r;

    }
}