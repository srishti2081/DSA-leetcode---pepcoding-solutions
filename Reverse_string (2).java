import java.util.*;
//time complexity O(n)
public class Reverse_string {
    
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   String n = sc.next();
   sc.close();
   
    System.out.println("Original string =  " + n );
    System.out.print("Reversed string = ");
    revString(n, n.length()-1);
 }   
 public static void revString(String str, int index){

    if(index==0){
        System.out.println(str.charAt(index));
        return;  
    }
    System.out.print(str.charAt(index));
    revString(str,index-1);
}
}
