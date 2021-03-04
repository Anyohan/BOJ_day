package project;
import java.util.*;

//기본적인 스택 문제로, 여는 괄호는 넣고 닫는괄호는 빼자
// ( -> push, ) -> pop
// VPS 는 마지막에 스택에 아무것도 없어야 한다.

public class gwalho{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    for(int i =0;i<k;i++)
        System.out.println(VPS(sc.next()));
    }
    
    static String VPS(String s){
         Stack<Character> stk = new Stack<>();
         for(int i =0;i<s.length();i++){
             char c = s.charAt(i);
             if(c == '('){
                 stk.push(c);
             }
             else if(stk.empty()){
                 return "NO";
             }
             else{
                 stk.pop();
             }
         }
        
        if(stk.empty()){return "YES";}
        else{return "NO";}
    }
   
    
}