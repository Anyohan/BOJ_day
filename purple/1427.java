package project;

import java.util.*;

//toCharArray -> String,int 를 char[] 형 배열로 바꾸어줌

public class sortInside{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toCharArray();
        
        Arrays.sort(arr);
        
        for(int i = arr.length -1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
}