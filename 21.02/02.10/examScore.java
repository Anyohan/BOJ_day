package project;
import java.util.*;

public class examScore  {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(90<=n && n<=100){
            System.out.println("A");
        }
        else if(n<90 && n>79){
             System.out.println("B");
        }
        else if(n>69 && n<80){
             System.out.println("C");
        }
        else if(n>59 && n<70){
             System.out.println("D");
        }
        else{
             System.out.println("F");
        }
       
       
    }    
}