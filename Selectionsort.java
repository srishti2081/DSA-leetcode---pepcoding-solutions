import java.util.*;

public class Selectionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];

        for (int i=0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        //selection sort 
        //time complexity O(n^2)

        for(int j=0; j < arr.length-1; j++){
            int small= j;
            for(int k=j+1; k < arr.length; k++){
                if(arr[small]>arr[k]){
                    small=k;
                }
            }
            int temp=arr[small];
            arr[small]=arr[j];
            arr[j]=temp;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print( arr[i]+ " ");
            } 
        
        sc.close();
        
    }
    
}
