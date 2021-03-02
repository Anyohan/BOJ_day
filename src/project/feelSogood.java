package project;
import java.util.*;

public class feelSogood{
    public static double[][] iu;
    public static double gtg,gtb,btg,btb;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int feel = sc.nextInt();
        
        gtog = sc.nextDouble();
        gtob = sc.nextDouble();
        btog = sc.nextDouble();
        btob = sc.nextDouble();
        
        iu = new double[2][n];
        
        if(feel == 0){
            iu[0][0] = gtog;
            iu[1][0] = gtob;
        }
        else{
            iu[0][0] = btog;
            iu[1][0] = btob;
        }
        
        feelCheck(n);
        System.out.println(Math.round(iu[0][n-1]*1000));
        System.out.println(Math.round(iu[1][n-1]*1000));
        
    }
    
    static void feelCheck(int a){
        int idx = 1;
        while(idx != a){
            iu[0][idx] = iu[0][idx-1]*gtog + iu[1][idx-1]*btog
            iu[1][idx] = iu[0][idx-1]*gtob + iu[1][idx-1]*btob;
            idx++;
        }
    }
}