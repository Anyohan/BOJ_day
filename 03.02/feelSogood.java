package project;
import java.util.*;

public class feelSogood{
    public static double[][] iu;
    public static double gtg,gtb,btg,btb;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int feel = sc.nextInt();
        
        gtg = sc.nextDouble();
        gtb = sc.nextDouble();
        btg = sc.nextDouble();
        btb = sc.nextDouble();
        
        iu = new double[2][n];
        
        if(feel == 0){
            iu[0][0] = gtg;
            iu[1][0] = gtb;
        }
        else{
            iu[0][0] = btg;
            iu[1][0] = btb;
        }
        
        feelCheck(n);
        System.out.println(Math.round(iu[0][n-1]*1000));
        System.out.println(Math.round(iu[1][n-1]*1000));
        
    }
    
    static void feelCheck(int a){
        int idx = 1;
        while(idx != a){
            iu[0][idx] = iu[0][idx-1]*gtg + iu[1][idx-1]*btg;
            iu[1][idx] = iu[0][idx-1]*gtb + iu[1][idx-1]*btb;
            idx++;
        }
    }
}