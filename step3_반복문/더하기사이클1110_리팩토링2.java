package step3_반복문;

import java.util.Scanner;

public class 더하기사이클1110_리팩토링2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();
		sc.close(); // 스캐너 꼭 닫아주기(입력하나만 받으면 되니까)
		
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