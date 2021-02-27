package project;
import java.util.*;

public class  Alram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h , m;
        h=sc.nextInt();
        m=sc.nextInt();
        if(m-45<0){
            if(h-1<0){
                h = 23;
                System.out.printf("%d %d",h,m+15);
            }
            else{
                 System.out.printf("%d %d",h-1 ,m+15);
            }
           
        }
        else{
            System.out.printf("%d %d",h ,m-45);
        }
    }    
}
