import java.util.*;
public class Print_Maizepath {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    pmaizepath(0,0,n-1,m-1," ");
    sc.close();
    
}    
public static void pmaizepath(int sr,int sc,int dr,int dc, String path ){

    //base case
    if(sr>dr || sc>dc){
        return;
    }
    if(sr==dr && sc==dc){
       System.out.println(path);
        return ;
    }
    pmaizepath(sr, sc+1, dr, dc, path+"h");
    pmaizepath(sr+1, sc, dr, dc, path+"v");


}
}
