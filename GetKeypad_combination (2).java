import java.util.*;
public class GetKeypad_combination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        ArrayList<String> result = gkc(st);
        System.out.println(result);
        
        sc.close();
    }

    static String[] code = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz" };

   public static ArrayList<String> gkc(String st){
    //base case
    if(st.length()==0){
        ArrayList<String> bres = new ArrayList<>();
        bres.add("");
        return bres;
    }

    char ch =st.charAt(0);
    String rest= st.substring(1);
    
    ArrayList<String> rres = gkc(rest);
    ArrayList<String> myres  = new ArrayList<> ();

    for(int i=0; i<code[ch -'0'].length(); i++){ //ascii code 0 ka 48 hota h isiliye ch-0 hua h
        char chcode =code[ch -'0'].charAt(i);
    
       
        // for ( i=0;i<rres.size();i++ ){
        //     myres.add(chcode + rres.get(i));
        // }
    for(String rst: rres){
        myres.add(chcode + rst);
    }
}
return myres;
   }
}
