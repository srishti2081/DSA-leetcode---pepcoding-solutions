package Stack;

import java.util.*;

public class Balancebracket2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        
        Stack <Character> st=new Stack<Character>();
        String a = sc.nextLine();
        
        for(int i = 0; i < a.length(); i++){
            char ch=a.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }else if(ch==')'){
               boolean val= checkBracket(st,'(');
               if(val ==false){
                   System.out.println(val);
                   return;
               }
            }else if(ch =='}'){
                boolean val= checkBracket(st,'{');
                if(val ==false){
                    System.out.println(val);
                    return;
                }
            }else if(ch== ']'){
                boolean val =checkBracket(st,'[');
                if(val ==false){
                    System.out.println(val);
                    return;
                }
            }else{

            }
            if(st.size()==0){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
        }
      

    public static boolean checkBracket(Stack<Character> st, char cho) {
        if (st.size() == 0) {
            return false;
        } else if (st.peek() != cho) {
            return false;
        } else {
            st.pop();
            return true;
        }
       
    }

    
}


