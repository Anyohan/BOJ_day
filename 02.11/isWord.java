package project;
import java.util.*;



public class isWord{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sns = sc.nextLine().trim();
        sc.close();
        // 공백만 들어갔을때 예외처리
        if(sns.isEmpty()){
            System.out.println(0);
        }
        else{
            System.out.println(sns.split("\\s").length);
        }
     }
}