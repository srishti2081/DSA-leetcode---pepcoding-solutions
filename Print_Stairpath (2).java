import java.util.*;
public class Print_Stairpath {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    pstairpath(n , " ");
    sc.close();
    
    
  } 
  public static void pstairpath(int n , String path){
    //base case
    if(n==0){  
       System.out.println(path);
        return ;
    }
     if(n<0){
        return ;
    }
    pstairpath(n-1,path + "1");
    pstairpath(n-2,path + "2");
    pstairpath(n-3,path + "3");
  } 
}
