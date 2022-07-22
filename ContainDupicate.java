import java.util.*;
public class ContainDupicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int a[]= new int[n];
        for (int i=0; i<a.length; i++) {
            a[i] = sc.nextInt();
        }     
        boolean boo=false;
        // int i=0;
        for(int i=0; i<a.length; i++) {

            for(int j=i+1; j<a.length ; j++) {
             if(a[i]==a[j]){
                boo=true;
                break;
             }
        }
    }
    System.out.println(boo);
        sc.close();
}
        
}

