package step6_심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 그룹단어체커1316 {

	public static void main(String[] args) throws IOException {
		// 1. 첫 글자는 그냥 해당 알파벳배열에 +1 하고
		// 2. 두번째 글자부터 그 전글자랑 비교해서 다르면 +1
		// 3. 알파벳중 2이상의 수가 있으면 그룹단어가 아니다.

		// 디버깅하는법 질문
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int cnt = num; //

		for (int i = 0; i < num; i++) {
			int[] arr = new int[26];
			String s = br.readLine();
			arr[s.charAt(0) - 97] = 1; // 문자열 첫번째 값은 그냥 대입

			for (int j = 1; j < s.length(); j++) { // 두번째 문자부터 문자열순회
				if (s.charAt(j) != s.charAt(j - 1)) { // 현재문자가 전문자와 같지 않으면
					arr[s.charAt(j) - 97] += 1; // 현문자에 해당하는 배열에 +1
					if (arr[s.charAt(j) - 97] > 1) { // 해당문자의 값이 1보다 크면 연속되지 않게 문자가 출현했다는 뜻이므로 그룹단어가 아님!
						cnt--;
						break;
					}
				}
			}
		}
		System.out.println(cnt);
	}
}
