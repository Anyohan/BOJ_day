package project;
import java.util.*;

public class makeOne{
    
    static Integer dp[];
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new Integer[n+1];
        dp[0] = dp[1] = 0;
        System.out.println(makeOne(n));
        
    }
    
    static int makeOne(int n){
        if(dp[n] == null){
            if(n%6 == 0){
                dp[n] = Math.min(makeOne(n-1),Math.min(makeOne(n/3),makeOne(n/2))) + 1;
            }
            else if(n%3 == 0){
                dp[n] = Math.min(makeOne(n/3),makeOne(n-1)) + 1;
            }
            else if(n%2 == 0){
                dp[n] = Math.min(makeOne(n/2),makeOne(n-1)) + 1;
            }
            else{
                dp[n] = makeOne(n-1) + 1;
            }
        }
        return dp[n];
    }
}