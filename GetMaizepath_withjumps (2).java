import java.util.*;
public class GetMaizepath_withjumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    ArrayList<String> result = getMaizepathwithjumps(0,0 ,n-1,m-1);
    System.out.println(result);
    }
    public static ArrayList<String> getMaizepathwithjumps(int srow,int scol, int drow,int dcol){
        if(srow==drow && scol==dcol){
            ArrayList<String>  bres  = new ArrayList<>();
            bres.add(" ");
            return bres;
        }

        ArrayList<String> path = new ArrayList<String>();

        //horizontal path
        for(int hsize=1; hsize<= dcol-scol; hsize++){
            ArrayList<String> hpath= getMaizepathwithjumps(srow, scol+ hsize ,drow, dcol);
            for(String allhpath : hpath){
                path.add("h"+ hsize+ allhpath);

            }
        }
        //vertical path
        for(int vsize=1; vsize<= drow-srow; vsize++){
            ArrayList<String> vpath= getMaizepathwithjumps(srow + vsize, scol,drow, dcol);
            for(String allvpath : vpath){
                path.add("v"+ vsize+ allvpath);

            }
        }
        //diagonal path
        for(int dsize=1; dsize<= drow-srow && dsize<=dcol-scol; dsize++){
            ArrayList<String> dpath= getMaizepathwithjumps(srow + dsize, scol + dsize,drow, dcol);
            for(String alldpath : dpath){
                path.add("d"+ dsize + alldpath);

            }
        }
        return path;
       
    }
}
