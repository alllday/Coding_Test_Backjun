package step5_���ڿ�;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �ܾ����1157_�����丵1 {

	// 65~90 : �빮�� / 97~122 : �ҹ���
	public static void main(String[] args) throws IOException {
		// 1. 65~90 = 97~122
		// 2. ���ĺ� �迭 26��
		// 3. arr[����-65], arr[����-97] ++
		// 4. ����ó��

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[26];
		int max = -1;
		char c = ' ';

		String s = br.readLine();

		for (int i = 0; i < s.length(); i++) {
			if (65 <= s.charAt(i) && s.charAt(i) <= 90) {
				arr[s.charAt(i) - 65]++;
			} else if (97 <= s.charAt(i) && s.charAt(i) <= 122) {
				arr[s.charAt(i) - 97]++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				c = (char)(i+65);
			}else if (arr[i] == max) {
				c = '?';
			}
		}
		System.out.println(c);
	}
}
