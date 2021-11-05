package project;
import java.util.*;

public class statistic{
    static int mean(int[] a){
        int mean;
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum += a[i];
        }
        mean = Math.round(sum/a.length);
        return mean;
    }
    static int middle(int[] a){
        int middle;
        Arrays.sort(a);
        middle = a[Math.round(a.length/2)];
        return middle;
    }
   // static int mode(int[] a){
        //int mode = 0;
        
   // }
    static int bound(int[] a){
        int bound;
        Arrays.sort(a);
        if(a[0] == a[a.length-1]){
            bound = 0;
        }
        bound = Math.abs(a[0]) + Math.abs(a[a.length-1]);
        return bound;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int arr[] = new int[p];
        for(int i=0;i<p;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(mean(arr));
        System.out.println(middle(arr));
        
        System.out.println(bound(arr));
    }
}
