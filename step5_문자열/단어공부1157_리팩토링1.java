package step5_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어공부1157_리팩토링1 {

	// 65~90 : 대문자 / 97~122 : 소문자
	public static void main(String[] args) throws IOException {
		// 1. 65~90 = 97~122
		// 2. 알파벳 배열 26개
		// 3. arr[문자-65], arr[문자-97] ++
		// 4. 조건처리

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
