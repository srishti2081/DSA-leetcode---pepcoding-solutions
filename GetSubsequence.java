import java.util.*;
public class GetSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> result = gss(str);
        System.out.println(result);
        
        
        sc.close(); 
    }
    public static ArrayList<String> gss(String str) { //gss-get subseq
        if(str.length()==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch =str.charAt(0); //a
        String rest = str.substring(1); //bc
        ArrayList<String> rres = gss(rest); //{--,-c,-b,bc ,rres=recursion result

        ArrayList<String>  mres = new ArrayList<> (); //mres=my result
        for(String rstr: rres){
            mres.add(""+ rstr);
        }
        for(String rstr: rres){
            mres.add(ch + rstr);
        }
        return mres;
    }
}

