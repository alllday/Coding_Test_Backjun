package step3_�ݺ���;

import java.util.Scanner;

public class ���ϱ����Ŭ1110_�����丵1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();

		int first = input / 10;
		int second = input % 10;
		int newNum = input;
		int sum = 0;
		int cnt = 0;

		do {
			sum = first + second;
			first = newNum % 10;
			second = sum % 10;

			newNum = first * 10 + second;
			first = newNum / 10;
			second = newNum % 10;
			cnt++;
		} while (input != newNum);

		System.out.println(cnt);

	}
}