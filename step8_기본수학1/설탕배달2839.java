package step8_�⺻����1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �������2839 {
   public static void main(String[] args) throws IOException {
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int input = Integer.parseInt(br.readLine());
      
      int cnt = 0;
      
      // 5�� ���� ����, 3���� ������ ���� �ִ� ���� �ȳ����� ���� �ֱ⿡, 3�� ���� ���� ���� ���� 5�� ������ �������� ��!
      // => �̰� �ٽ�
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