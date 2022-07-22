import java.util.*;
public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int space=n/2;
        int star=1;
        int x=1;
        for(int i=1; i<=n; i++){
    
            for(int j=1; j<=space;j++){
             System.out.print("\t");
            }
    
            int cx=x;
            for(int j=1; j<=star;j++){
                System.out.print(cx +"\t");
                
                if( j <=star / 2){
                    cx++;
                }else{
                    cx--;
                }
               }
               
    
               if(i<=n/2){
                   space--;
                   star +=2;
                   x++;
               }else{
                   space++;
                   star -=2;
                   x--;
               }
            System.out.println();
        }
    }
    
}
