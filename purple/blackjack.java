package project;
import java.util.*;

//Brute force
public class blackjack{
    static int sum(int[] a,int n,int m){
        int sum = 0;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    int temp = a[i]+a[j]+a[k];
                    if(temp == m){
                        return temp;
                    }
                    if(sum<temp && temp<m){
                        sum = temp;
                    }
                }
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(sum(arr,n,m));
    }
}