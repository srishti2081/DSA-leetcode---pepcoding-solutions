import java.util.*;
public class Display_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[]arr= new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
       
        dArray(arr,0);        
        sc.close();
           
    }
    public static void dArray(int[]arr, int inx){
        if(inx==arr.length){
            return;
        }
        System.out.println(arr[inx]);
        dArray(arr,inx+1);


    }
}
