import java.util.*;

public class Difference_ofarray {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
   
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
        }

        int m=sc.nextInt();
        int b[]=new int[m];
        for(int i=0; i<b.length; i++){
            b[i]=sc.nextInt();
        }

        int max, min;
        if(n>m){  
             max=n;
             min=m;
        }else{
             max=m;
             min=n;
        }

        int[] diff= new int[max];
        int[] small=new int[min];
        int c=0;
        int i=a.length-1;
        int j=b.length-1;
        int k= diff.length-1;

           //agar niche me kuch divide karne k liye nahi ho
          // int val;
          //ye if(min>=0){
          // val     val=small[min];
          // }else{
           //    val=0;
         //  }
         int val=min>=0? small[min]: 0;
        while(k>=0){
            int dig=0;

            if(diff[max]> small[min]){
                dig = diff[max]+c -val;
                c=0;  
            }
            else{
                dig= diff[max]+c+10 -val;
                c=-1;
            }
            
            diff[k]=dig;
            i--; j--; k--;
        }
       

//ye kaam answer k phele ka zero hatane k liye hua hai
        int index=0;
        while(index<diff.length){
            if(diff[index]==0){
                index++;
            }else{
                break;
            }
        }
        while(index<diff.length){
            System.out.println(diff[index]);
        }
    }
    
    
}

