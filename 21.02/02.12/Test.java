package project;
import java.util.*;

public class Test{
    static long sum(int[] a){
        long sum = 0;
        for(int i =0;i<a.length;i++){
            sum += a[i];
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(sum(arr));
    }
}