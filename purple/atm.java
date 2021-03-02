package project;
import java.util.*;

public class atm{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int arr[] = new int[p];
        int sum = 0;
        for(int i=0;i<p;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i>0){
                arr[i] += arr[i-1];
            }
            sum += arr[i];
        }
        System.out.println(sum);
    }
}