import java.util.*;
public class Printmaximum_fromarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for (int i=0; i<n; i++) {
             arr[i] = sc.nextInt();
        }

        int max = arrayMax(arr,0);
        System.out.println(max);
        sc.close();
        
    }

    public static int arrayMax(int[] arr, int idx){
        if(idx==arr.length-1){
            return arr[idx];}
        
            int a=arr[idx];
            arrayMax(arr,idx+1);

            if(arr[idx]>a){
                return arr[idx];
            }else{
                return a;
            }
        
    }
    

    
  } 


