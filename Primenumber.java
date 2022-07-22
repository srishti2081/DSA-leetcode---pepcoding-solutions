import java.util.Scanner;


public class Primenumber {
  
        static void checkPrime(int a){
            int count=0;
            for (int j = 1; j <=a; j++) {
                if (a%j==0) {
                    count++;                
                }
            }
            if (count==2) {
                System.out.println("prime");
            }else{
                System.out.println("not prime");
            }
        }
    
    
        public static void main(String[] args) {
    
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                checkPrime(n);
            }
            sc.close();
        }
    }
    

