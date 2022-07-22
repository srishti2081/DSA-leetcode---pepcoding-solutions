import java.util.*;
public class LastIndex {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        
        int []arr= new int[n];
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        int m =sc.nextInt();
        int LS= lastIndex(arr,0,m);
        System.out.println(LS);

    }
    public static int lastIndex(int[]arr, int idx, int num) {
        if(idx==arr.length){
            return -1;
        }

       
        int a =lastIndex(arr, idx+1, num);
        if(a==-1){
            if(arr[idx]==num){
                return idx;
            }else{
                return -1;
            }
        }else {
                 return a; }
        


    }
}
