import java.util.Scanner;

/**
 * Pattern13
 */
public class benjamin_bulb {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for(int i = 0; i*i <= n;i++){
            System.out.println(i*i);
        }
    }
}