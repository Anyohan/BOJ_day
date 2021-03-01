package project;
import java.util.*;

public class fib{
    static int fib1(int[] a){
        a[0] = 0;
        a[1] = 1;
        for(int i=2;i<a.length;i++){
            a[i]=a[i-1] + a[i-2];
        }
        return a[a.length-1];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if(n=0){
            System.out.println("0");
        }
        else{
            int[] arr = new int[n+1];
            System.out.println(fib1(arr));
        }
        
    }
}