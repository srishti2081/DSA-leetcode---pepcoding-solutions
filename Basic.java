import java.util.*;
public class Basic{
    public static void main(String[] args) {
        Integer n1 = 5; 
        Integer n2 = 5; 

        // when integers pass 127, their length becomes too long to store normally,
        // and thus the default comparing operator between them does not work properly. 
        // If you need to make this comparison, I'd advise using some 
        // other numeric type, but usually just storing them and using the
        // .equals() function would do - It compares objects by value.

        Integer num1 = 128; 
        Integer num2 = 128;
        if(n1==n2){ 

            System.out.println("n1 == n2"); 

        } 

        else{ 

            System.out.println("n1 != n2"); 

        } 

        if(num1== num2){ 

            System.out.println("num1 == num2"); 

        } 

        else{ 

            System.out.println("num1 != num2"); 

        } 
        int a = 4, b = 5, c = 2;
        a = b * c++;
        b = --a * c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}


