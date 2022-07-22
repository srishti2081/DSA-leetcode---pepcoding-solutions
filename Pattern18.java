import java.util.*;
/**
 * Pattern18
 */
public class Pattern18 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int star=n;
        int space=0;

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=space; j++) {
               
                System.out.print("\t");
            }

            for(int j=1; j<=star; j++) {
                if(i>1 && i<=n/2 && j>1 && j<star){
                    System.out.print("\t");
                }else{
                System.out.print("*\t");}
            }
            if(i<=n/2){
                space++;
                star-=2;
            }else{
                space--;
                star+=2;
        }
        System.out.println();
        }
        sc.close();
        }
         
    }
