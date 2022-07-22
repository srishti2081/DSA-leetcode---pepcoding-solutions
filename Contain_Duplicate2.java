import java.util.*;

/**
 * Contain_Duplicate2
 */
public class Contain_Duplicate2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]a=new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);boolean boo = false;

        System.out.println(Arrays.toString(a));
        
        for (int i = 0; i < a.length-1; i++) {
            
            // System.out.print(a[i]+" ");
            
            if (a[i] ==a[i+1]) {
                boo = true;
                break;
                
            }
        }
        System.out.println(boo);
        
        sc.close();
        
    }
}