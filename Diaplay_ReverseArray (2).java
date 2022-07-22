import java.util.*;
public class Diaplay_ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for (int i=0; i<n; i++) {
             arr[i] = sc.nextInt();
        }

        ReverseArray(arr,arr.length-1);
        sc.close();   
    }

    public static void ReverseArray(int[] arr, int idx){
        if(idx==0){
            System.out.println(arr[0]);
            return;}
       
            System.out.println(arr[idx]);
             ReverseArray(arr,idx-1);
        
    }
  } 

