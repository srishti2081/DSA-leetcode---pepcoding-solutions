import java.util.*;
import java.util.Scanner;

public class GCDandLCM {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
  int n=sc.nextInt();
  int m=sc.nextInt();

  int orin=n;
  int orim=m;
   
  while(n % m !=0){
    int r = n%m;
     n=m;
     m=r;
  }
 int lcm=(orin * orim)/m;

  System.out.println("gcd is" +m);
  System.out.println("lcm is" + lcm);
      
  
}
    

}
