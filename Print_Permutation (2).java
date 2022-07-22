import java.util.Scanner;
public class Print_Permutation {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String st = sc.next();
    
    printpermutation(st,"");
    sc.close();
}   
public static void printpermutation(String question, String path){
    //base case 
    if(question.length()==0){
        System.out.println(path);
        return;
    }
    for(int i = 0; i <question.length(); i++){
        char ch = question.charAt(i);
        String questionl = question.substring(0,i);
        String questionr = question.substring(i+1);

        String restq = questionl + questionr;
        printpermutation(restq , path +ch);

    }
} 
}
