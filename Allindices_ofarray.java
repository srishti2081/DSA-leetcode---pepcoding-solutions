import java.util.*;
public class Allindices_ofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[]= new int[n];
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int m = sc.nextInt();
        int[] iarr= Allindices_ofarray(arr,m,0,0);//counter = x

        if(iarr.length ==0){ //for blank Line
            System.out.println("Not Found");
            return;
        }

        for(int i=0;i<iarr.length;i++){
            System.out.print(iarr[i]+" ");
        }
        
        
        sc.close();
        
        
    }
    public static int[] Allindices_ofarray(int []arr,int num, int idx ,int x) {
        //base case
        if(idx == arr.length){
            return new int[x];
        }

        if(arr[idx]==num){
           int[] iarr = Allindices_ofarray(arr,num,idx+1, x+1);
           iarr[x]= idx;
           return iarr;
        }else{
            int[] iarr=Allindices_ofarray(arr,num,idx+1,x);
           return iarr;
        }
    }
    
}
