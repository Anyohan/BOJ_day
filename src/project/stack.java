package project;
import java.util.*;

public class stack{
    public static int[] stk;
    public static int size = 0;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        
        stk = new int[n];
        for(int i =0;i<n;i++){
            String str = sc.next();
            
            switch(str){
                case "push":
                    push(sc.nextInt());
                    break;
                case "pop":
                    sb.append(pop()).append('\n');
                    break;
                case "size":
                    sb.append(size()).append('\n');
                    break;
                case "empty":
                    sb.append(empty()).append('\n');
                    break;
                case "top":
                    sb.append(top()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
    
    static void push(int a){
        stk[size++] = a;
    }
    
    static int pop(){
        if(size == 0){
            return -1;
        }
        else{
            return stk[--size];
            
        }
    }
    
    static int size(){
        return size;
    }
    
    static int empty(){
        if(size == 0){
            return 1;
        }
        else{
            return 0;
        }
    }
    
    static int top(){
        if(size == 0){
            return -1;
        }
        else{
            return stk[size-1];
        }
    }
}