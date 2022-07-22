import java.util.*;
public class Find_pythagoreusnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        int z= sc.nextInt();
        boolean a;


        int max=x;
        if(y>=max){
            y=max;
        }
        if(z>=max){
            z=max;
        }

        if(max==x){
            a = ((x*x) == (y*y + z*z));
            System.out.println(a);
        }else if(max==y){
            a = ((y*y) == (x*x + z*z));
            System.out.println(a);

        }else{
            a = ((z*z) == (y*y + x*x));
            System.out.println(a);
        }

    }
}
