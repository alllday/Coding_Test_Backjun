package step3_�ݺ���;

import java.util.Scanner;

public class ���ϱ����Ŭ1110_�����丵2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();
		sc.close(); // ��ĳ�� �� �ݾ��ֱ�(�Է��ϳ��� ������ �Ǵϱ�)
		
		int copy = input;
		int cnt = 0;

		do {
			// �� �� ���� �������� �ʿ� ���� �� �ٷ� ����! �ٵ� ó������ �̷��� �����ϱⰡ... �������!
			input = ((input % 10) * 10) + (((input / 10) + (input % 10)) % 10);
			cnt++;
		} while (input != copy);

		System.out.println(cnt);
	}
}