package project;
import java.util.*;

public class numberSum{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        int p = sc.nextInt();
        String a = sc.next();
        int sum = 0;
        for(int i =0;i<p;i++){
            sum += a.charAt(i)-'0';
        }
        
        System.out.println(sum);
    }
}