import java.util.Scanner;

public class Functiondemo {

    public static int calculateSum(int a, int b){
        int sum= a+b;
       // System.out.println(sum); ture   false
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();

        //calculateSum(a,b);
        int suma= calculateSum(a,b);
       System.out.println(suma);
    }
    
}
