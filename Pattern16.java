import java.util.*;
public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();


        int star=1;
        int space=2*n-3;
      
        for(int i=1; i<=n; i++) {
             int x=1;

            for(int j=1; j<=star; j++) {
                System.out.print(x+"\t");
                x++;
            }

            if(i==n){
                star--;
                x--;
            }
            for(int j=1; j<=space; j++) {
                System.out.print("\t");
            }

           
            for(int j=1; j<=star; j++) {
                x--;
                System.out.print(x+"\t");
                
            }
            star++;
            space -=2;
            System.out.println();
        }
       
        sc.close();
    }
    
}
