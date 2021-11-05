package project;
import java.util.*;


//memoization 
// int[] 와 Integr[] 전자는 일반적인 변수 타입이고,
// 후자는 클래스이다.
// 후자같은 경우 null 값 처리가 가능 하기 때문에 지속적인 dp 배열값 초기화를 위해 사용함
// int[] 배열을 이용해 맨처음에 초기화를 해주어도 되지만 조건문 사용에 까다로움을 덜기위해


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