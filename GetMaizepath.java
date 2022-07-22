import java.util.*;
public class GetMaizepath {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    ArrayList<String> result = getMaizepath(0,0 ,n-1,m-1);
    System.out.println(result);
    
    
    sc.close();
    
   } 

   public static ArrayList<String> getMaizepath(int srow, int scol, int drow, int dcol){

    if(srow==drow && scol==dcol){
        ArrayList<String>  bres  = new ArrayList<>();
        bres.add(" ");
        return bres;
    }
    ArrayList<String> hpath = new ArrayList<> ();
    ArrayList<String> vpath = new ArrayList<>();
    
    if(srow<drow){
        
        vpath = getMaizepath(srow +1,scol,drow,dcol);
    }
   
   if(scol< dcol){
    hpath= getMaizepath(srow,scol+1,drow,dcol);

   } 
    ArrayList<String> allpath = new ArrayList<>();

    for(String path : hpath){
    allpath.add("h"+path);
    }
    for(String path : vpath){
    allpath.add("v"+ path);
    }
    
    return allpath;

   }
   }


