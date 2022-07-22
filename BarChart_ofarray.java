import java.util.*;
public class BarChart_ofarray {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] a= new int[n];

        for(int i=0; i<a.length; i++){
            a[i] =sc.nextInt();
        }
        int max=a[0];
        for(int i=1; i<a.length; i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        for(int top=max;top>=1;top--){
            for(int i=0; i<a.length; i++){
                if(a[i]>=top){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
