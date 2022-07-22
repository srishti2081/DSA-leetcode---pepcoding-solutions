import java.util.*;

//print number in descending number
public class Printno_indescending {
    
    public static void printnumber(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printnumber(n-1);
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       
       printnumber(n);
       
       
       
      
       
    }
}
