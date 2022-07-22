
import java.util.*;
public class PrintMaizepath_withjump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        pmaizepath_withjump(0,0,n-1, m-1,"");
        
        sc.close();
        
    }
    public static void pmaizepath_withjump(int sr,int sc,int dr,int dc,String  path){
        if(sr==dr && sc==dc){
            System.out.println(path);
            return ;
        }
        
        
        //horizontal path
        for(int hsize=1; hsize<= dc-sc; hsize++){
        pmaizepath_withjump(sr, sc+hsize ,dr, dc, path+"h"+hsize);
        }
        
        //vertical path
        for(int vsize=1; vsize<= dr-sr; vsize++){
        pmaizepath_withjump(sr+vsize, sc ,dr, dc, path+"v"+vsize);
        
        }
        
        //diagonal path
        for(int dsize=1; dsize<= dr-sr && dsize<=dc-sc; dsize++){
        pmaizepath_withjump(sr+dsize, sc+dsize ,dr, dc, path+"v"+dsize);
        }
    }
}
        
    



