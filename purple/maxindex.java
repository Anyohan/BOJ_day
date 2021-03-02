package project;
import java.util.*;

public class maxindex  {
    static int maxOf(int[]a){
        int max = a[0];
        int prr = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        return max;
    }
    
    static int maxOfindex(int[] a){
        int max = a[0];
        int prr = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
                prr = i + 1;
            }
        }
        if(max == a[0]){
            prr = 1;
        }
        return prr;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[9];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.printf("%d \n",maxOf(arr));
        System.out.printf("%d",maxOfindex(arr));
       
    }    
}