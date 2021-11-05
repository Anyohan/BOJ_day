package project;
import java.util.*;

//memoization
//숫자간의 규칙을 찾아서 배열의 저장
//초기값 3개는 무조건 필요해서 초기화
//숫자가 1,2,3 3개이므로 초기값 3개는 필요했음

public class threeSum{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        
        int dp[] = new int[12];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int i = 4;i<dp.length;i++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        for(int i =0;i<n;i++){
            int k = sc.nextInt();
            sb.append(dp[k]).append("\n");
        }
        System.out.println(sb);           
    }
}