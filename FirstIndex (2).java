import java.util.*;
public class FirstIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr= new int[n];
        for(int i = 0; i < n; i++){
            arr[i]=sc.nextInt();
        }
       
        int m = sc.nextInt();
        int FS=FirstInd(arr,0,m);
        System.out.println(FS);
        sc.close();
        
    }
   public static int FirstInd(int[]arr, int idx, int num){
    if(idx==arr.length){
        return -1 ;
    }

  
     if(arr[idx]==num){
         return idx;
     }else{
         int a=  FirstInd(arr,idx+1,num);
            return a;
        }


}
}

        

