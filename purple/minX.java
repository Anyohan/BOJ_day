package project;
import java.util.*;

//ArrayList 의 동적할당과 각 요소값 출력 기억하기
//for문 사용 해도 되고,get 메소드 사용가능

public class minX{
    
    static void minOf(int[]a , int n,int x){
        int min = x;
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(a[i] < x){
                arr2.add(a[i]);
            }
        }
        for(Integer i : arr2){
            System.out.print(i+" ");
        }
        
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        minOf(arr,n,x);
    }
}