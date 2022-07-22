import java.util.Scanner;

/**
 * Bubblesort
 */
public class Bubblesort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        
       System.out.println("ORIGINAL ARRAY ");
        for ( int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        //bubble sort
        //time complexity O(n^2)

        for(int j=0; j<arr.length-1; j++){
            for(int k=0; k<arr.length-j-1; k++){

                if(arr[k]> arr[k+1]){
                    //swap
                    int temp=arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=temp;
                }
            }
        }

        for(int i = 0; i < arr.length; i++){
        System.out.print( arr[i]+ " ");
        } 
        sc.close();
}
}