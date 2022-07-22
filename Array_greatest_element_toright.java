import java.util.*;
public class Array_greatest_element_toright {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i+1]>arr[i]){
                System.out.println("Next greater element of"+i+"is"+(i+1));
            }
        }
        
        
        sc.close();
        
    }
}
