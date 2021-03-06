package project;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class sortTwo{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new                       InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());
        int n = Integer.parseInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =0;i<n;i++){
            arr.add(Integer.parseInt(br.readLine()));
        }
        
        Collections.sort(arr);
        
        for(int v:arr){
            sb.append(v).append('\n');
        }
        System.out.println(sb);
    }
}