package project;
import java.util.*;

public class Eratos{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Boolean> arr = new ArrayList<Boolean>();
        int res = 0;
        
        arr.add(false);
        for(int i=1;i<n;i++){
            arr.add(i,true);
        }
        for(int i=2;i<n;i++){
                for(int j=i;j<n;j+=i){
                    if(!arr.get(i))
                        continue;
                    arr.set(j,false);
                    res++;
                    if(res == k){
                        System.out.println(j);
                        System.exit(0);
                    }
                    
                }
            
        }
        
        
    }
}