import java.util.*;
public class Towerofhanoi {
    //time complexity O(n^2)

    public static void towerofhanoi(int n, String Sourse,String Helper,String Destination){

        if(n==0){
           
            return;
        }
        towerofhanoi(n-1,Sourse,Destination,Helper); //step 1.
        System.out.println("transfer disk "  +  n  + " from " +  Sourse  + " to " +  Destination); // step 2
       
        towerofhanoi(n-1,Helper,Sourse,Destination); //step 3
          
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       
       
       
       towerofhanoi(n, "S" ,  "H" ,  "D" );
       
       sc.close();
       
    }
}
