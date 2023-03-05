package step8_기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 설탕배달2839 {
   public static void main(String[] args) throws IOException {
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int input = Integer.parseInt(br.readLine());
      
      int cnt = 0;
      
      // 5를 먼저 빼면, 3으로 나눠질 수도 있는 수가 안나눠질 수도 있기에, 3을 먼저 빼고 남은 수가 5로 나누어 떨어지는 지!
      // => 이게 핵심
      while (true) {
         if (input % 5 == 0) {
            cnt += input / 5;
            System.out.println(cnt);
            break;
         }
         else {
            if (input<0) {
               System.out.println(-1);
               break;
            }
            input -= 3;
            cnt++;
         }
      }
   
   }
}