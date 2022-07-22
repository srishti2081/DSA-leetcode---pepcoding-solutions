import java.util.*;
import java.util.Scanner;

public class Inversenumber {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n= sc.nextInt();

    int inv=0;
    int op=1;
    while(n!=0){
      int od=n%10;


      int ip=od;
      int id=op;

      inv=inv + id*(int)Math.pow(10,ip-1 );

      n=n/10;
      op++;
    }
    System.out.println(inv);
  } 
}
