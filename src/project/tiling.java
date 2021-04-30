package project;
import java.util.*;

//미완성
//dp 로 풀기

public class tiling{
    static int mod = 10007;
    static int[] dp = new int[1001];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(tile(n));
    }
    
    static int tile(int n){
        if(n <= 1){return 1;}
        int ret = dp[n];
        if(ret != -1){return ret;}
        return ret = (tile(n-2) + tile(n-1)) % mod;
    }
}