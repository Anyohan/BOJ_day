package project;
import java.util.*;

public class howMany{
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        sc.close();
            
        int num = a*b*c;
        int [] arr = new int[10];
        while(num > 0){
            arr[num%10]++;
            num /= 10;
        }
        
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}