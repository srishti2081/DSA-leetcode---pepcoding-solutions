import java.util.Scanner;

/**
 * Insertionsort
 */

class Insertion{
    public  void sort( int arr[]){
            int n=arr.length;
            for( int i=1; i<n; i++){
                int k=arr[i];//unsorted part
                int j=i-1;//sorted part

                for(;j>=0 && arr[j]>k;){ //0 index value hai
                    //aadha swap
                    arr[j+1]=arr[j];
                    j=j-1;
                }
                arr[j+1]=k;
            }

    }
} 


public class Insertionsort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        // Insertion sort
        
        Insertion object = new Insertion();
        object.sort(a);
        
        for(int i = 0; i < a.length; i++) {
       
            System.out.println(a[i]);
    }
        sc.close();
        
    }
}