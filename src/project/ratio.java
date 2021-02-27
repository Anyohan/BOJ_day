package project;
import java.util.*;

public class ratio{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int p = sc.nextInt();
            int arr[] = new int[p];
            int sum = 0;
            double res = 0;
            for(int j=0;j<arr.length;j++){
                arr[j] = sc.nextInt();
                sum += arr[j];
            }
            for(int k=0;k<arr.length;k++){
                long e = sum/arr.length;
                if(arr[k]>e){
                    res++;
                }
            }
            double ratio = res/arr.length;
            System.out.println((Math.round(ratio*100000)/100000.0)*100 + "%");
        }
        
    }
}
