package step5_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어공부1157 {

	// 65~90 : 대문자 / 97~122 : 소문자
	public static void main(String[] args) throws IOException {
		// 1. 65~90 = 97~122
		// 2. 알파벳 배열 26개
		// 3. arr[문자-65], arr[문자-97] ++
		// 4. 조건처리

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[26];
		int max = 0;
		int idx = 0;
		char c = ' ';
		int cnt = 0;

		String s = br.readLine();

		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);

			if (65 <= c && c <= 90) {
				arr[c - 65]++;
			} else if (97 <= c && c <= 122) {
				arr[c - 97]++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				idx = i;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (max == arr[i]) {
				cnt++;
			} 
		}

		if (cnt >= 2) {
			System.out.println("?");
		} else {
			System.out.println((char) (idx + 65));
		}
	}
}
