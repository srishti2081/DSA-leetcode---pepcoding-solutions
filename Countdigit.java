import java.util.*;
import java.util.Scanner;


public class Countdigit {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int a=0;
        while(n !=0){
            n=n/10;
            a++;
        }
        
            System.out.println(a);
    }
}
