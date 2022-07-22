import java.util.*;
/**
 * Find_element_positionofarray
 */
public class Find_element_positionofarray {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        
        int[] a=new int[n];
        for( i=0; i<a.length; i++){
            a[i] =sc.nextInt();
        }
        int m = sc.nextInt();

        boolean b= false;
        for( i=0;i<a.length;i++){
        if(a[i]==m){
            b=true;
            break;
        }  
    }
    //System.out.println(b);
    if(b) System.out.println(i);
    else  System.out.println("NA");
    
}
}