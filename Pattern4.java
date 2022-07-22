

import java.util.*;

public class Pattern4 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();


    int space=0;
    int star=n;
    for(int i=n; i>=1; i--){

        for(int j=1; j<=space;j++){
         System.out.print(" ");
        }

        for(int j=1; j<=star;j++){
            System.out.print("*");
           }

     space++;
     star--;
               
        System.out.println();
    }
   
    sc.close();
}    
}
