import java.util.*;
public class Digitfrequency {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int dig= sc.nextInt();
        int freq= frequency(n,dig);
        System.out.println(freq);
    
    }
    public static int frequency(int n, int dig){
        int rv=0;

        while(n>0){
            int d=n%10;
            n=n/10;

            if(d==dig){
                rv++;
            }
        }
        return rv;
    }
}
