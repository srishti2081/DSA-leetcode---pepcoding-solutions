import java.util.*;
public class Reversearray {

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
       
    int a[] = new int[n];
  
    for (int i = 0; i < a.length; i++){
        a[i]= sc.nextInt();
    }                                                               
                                                                    
    for(int i = 0; i < a.length/2;i++){
        int temp = a[i];
        a[i] = a[a.length-1 -i]  ;
        a[a.length-1 -i]= temp;

    }
    for(int i = 0; i < a.length;i++){
    System.out.print(a[i]+" ");}
      sc.close();
      
  }  
}
