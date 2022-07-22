import java.util.*;
public class Rotatenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        int nod=0;
        int temp=n;

        while(temp!=0){
        temp=temp/10;
        nod++;
        }
        k=k % nod;
        if (k<0){
            k=k+nod;
        }
        int div=1;
        int multi=1;
         for( int i=0;i<=nod;i++){
             if (i<=k){
                 div=div*10;}
             else{
                 multi=multi*10;}
            }
             int q=n /div;
             int r=n %div;
         
            int rotate = r * multi +q;
            System.out.println(rotate);
            sc.close();       
    }
 }
    

