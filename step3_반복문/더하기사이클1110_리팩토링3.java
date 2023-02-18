package step3_반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 더하기사이클1110_리팩토링3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		
		int copy = input;
		int cnt = 0;

		do {
			// 쓸 데 없는 변수만들 필요 없이 한 줄로 가능! 근데 처음부터 이렇게 생각하기가... 노력하자!
			input = ((input % 10) * 10) + (((input / 10) + (input % 10)) % 10);
			cnt++;
		} while (input != copy);

		System.out.println(cnt);
	}
}