package project;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
//java 의 BufferedReader 는 입출력의 성능을 향상시켜준다

public class snail{
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new                          InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        //StringTokenizer 를 이용하여 엔터가 아닌 공백을 기준으로 문자를 잘라준다.
        //Scanner 의 split 함수와 유사 
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        //readLine 함수의 return 값은 항상 String 이기 때문에 Int 로 형변환이 필요했다.
        
        int day = (v-b)/(a-b);
        if((v-b)%(a-b) != 0){
            day++;
        }
        System.out.println(day);
        
        
    }
}