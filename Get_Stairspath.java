import java.util.*;
public class Get_Stairspath {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<String> result = getStairpath(n);
    System.out.println(result);
    
    sc.close();
    
   } 
    
   public static ArrayList<String> getStairpath(int n){

    if(n==0){
        ArrayList<String>  bres  = new ArrayList<>();
        bres.add(" ");
        return bres;
    }else if(n<0){
        ArrayList<String>  bres  = new ArrayList<>();
        return bres;
    }

    ArrayList<String> p1 = getStairpath(n-1);
    ArrayList<String> p2 = getStairpath(n-2);
    ArrayList<String> p3 = getStairpath(n-3);

    ArrayList<String> allpath = new ArrayList<>();

    for(String path : p1){
    allpath.add(1+path);
    }
    for(String path : p2){
    allpath.add(2+ path);
    }
    for(String path : p3){
     allpath.add(3+ path);
    }
    return allpath;

   }

}

