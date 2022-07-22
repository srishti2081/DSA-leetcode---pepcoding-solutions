import java.util.*;
public class Pattern13 {
    public static int fact(int x){
        int rv=1;

        for(int i=1;i<=x; i++){
            rv=rv*1;
        }
        return rv;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int r= sc.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++){
                int nfact =fact(n);
                int rfact= fact(r);
                int tfact= fact(n-r);
        
                int ncr= nfact/rfact*tfact;
                System.out.print(ncr+"\t");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
