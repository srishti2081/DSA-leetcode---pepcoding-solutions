import java.util.*;
/**
 * TwoDArray_find_digit
 */
public class TwoDArray_find_digit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int colm= sc.nextInt();
         int[][] arr= new int[rows][colm];
        
        //input
         for(int i=0; i<rows; i++){
            for(int j=0; j<colm; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int x=sc.nextInt();
        //output
        for(int i=0; i<rows; i++){
            for(int j=0; j<colm; j++){
             if(arr[i][j]==x){
                 System.out.println("Number is found at location ("+ i + ","+ j +")" );
             } 
            }
        }

        
        
        sc.close();
        
    }
}

