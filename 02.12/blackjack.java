package project;
import java.util.*;

public class blackjack{
    static int sum(int[] a){
        int sum = 0;
        for(int i=0;i<a.length;i++){
            
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(sum(arr));
    }
}