package step3_�ݺ���;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ���ϱ����Ŭ1110_�����丵3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		
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