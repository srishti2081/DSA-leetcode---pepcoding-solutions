import java.util.*;
public class PrintKeypad_combination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        pkeycombination(st,"");
    }
    static String[] code = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz" };
    public static void pkeycombination(String question, String answer){
       //base case 
       if(question.length()==0){
        System.out.println(answer);
        return;
    }
        char ch =question.charAt(0);
        String restq= question.substring(1);

        String chcode =code[ch -'0']; //ch me character aaiga isiliye 0 character minus hoga
        for(int i=0; i<chcode.length(); i++){ //ascii code 0 ka 48 hota h isiliye ch-0 hua h
            char ch1 =  chcode.charAt(i);
        pkeycombination(restq,answer + ch1);
        }
   
    }

}
