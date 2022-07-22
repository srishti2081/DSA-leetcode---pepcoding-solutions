import java.util.*;
public class Sum_of_twoarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
        }

        int m=sc.nextInt();
        int b[]=new int[m];
        for(int i=0; i<b.length; i++){
            b[i]=sc.nextInt();
        }

        int[] sum;
        if(n>m){
             sum=new int[n];
        }else{
             sum=new int[m];
        }

        int c=0;
        int i=a.length-1;
        int j=b.length-1;
        int k= sum.length-1;

        while(k>=0){
            int dig=c;
            if(i>=0){
                dig+=a[i];
            }
            if(j>=0){
                dig+=b[j];
            }
            c=dig/10;
            dig =dig%10;

            sum[k]=dig;
            i--; j--; k--;
        }
        if(c !=0){
            System.out.print(c);
        }
        for(int val:sum){
            System.out.print(val);
        }
    }
    
    
}
