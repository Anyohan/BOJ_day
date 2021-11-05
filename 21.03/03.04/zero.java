package project;
import java.util.*;

public class zero{
    
    public static void main(String[] args){
        Stack<Integer> stk = new Stack<>(); 
        
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int sum = 0;
        for(int i=0;i<k;i++){
            int zero = sc.nextInt();
            if(zero == 0){
                stk.pop();
            }
            else{
                stk.push(zero);
            }
        }
        for(int i : stk){
          sum += i;  
        }
        System.out.println(sum);
    }
}