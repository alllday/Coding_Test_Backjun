package step11_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 수정렬하기3_10989 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		
		int[] arr = new int[10001];
		
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[num]++;
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i]; j++) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
	}

}
