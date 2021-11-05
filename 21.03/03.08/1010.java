package project;
import java.util.*;

//bottom-up 반복문 
//조합 성질 이용

public class bridge{
    public static void main(String[] args) {
        int [][] com = new int[30][30];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<30;i++){
            com[i][i] = 1;
            com[i][0] = 1;
        }
        
        for(int i = 2;i<30;i++){
            for(int j = 1;j<30;j++){
                com[i][j] = com[i-1][j-1] + com[i-1][j]; 
            }
        }
        
        for(int i =0;i<n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sb.append(com[b][a]).append("\n");
        }
        System.out.println(sb);
         
    }
    
}