import java.util.*;
public class PrintSubsequence {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String st= sc.next();
        printsubsequence(st , " ");
    }
    public static void printsubsequence(String question, String answer){
        //base case 
        if(question.length()==0){
            System.out.println(answer);
            return;
        }
        char ch = question.charAt(0);
        String restq = question.substring(1);//restq= rest question

        printsubsequence(restq,answer + " ");
        printsubsequence(restq,answer + ch);

    }
    
}
