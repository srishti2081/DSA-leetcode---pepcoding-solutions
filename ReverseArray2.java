import java.util.Scanner;

public class ReverseArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int a[]= new int[n];
        System.out.println("ORIGINAL ARRAY");
        for(int i = 0; i < a.length; i++){
            a[i]= sc.nextInt();

            // System.out.print(a[i]+ " ");
        }
        int b[]= new int[n];
        System.out.println("REVERSED ARRAY");
        for(int i=a.length-1;i>=0;i--){
            //b[i]= sc.nextInt();
            System.out.print(a[i]);
        }
        

        sc.close();
        }
        
    }

