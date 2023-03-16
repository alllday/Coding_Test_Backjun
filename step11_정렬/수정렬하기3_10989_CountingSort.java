package step11_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수정렬하기3_10989_CountingSort {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		
		int[] arr = new int[10001];
		
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[num]++;
		}
		
		// arr.length의 크기 -> 10,000
		// arr[i]의 크기 -> 최대 10,000,000
		// 이중 for문이라 시간복잡도를 10,000 x 10,000,000이라고 생각할 수도 있지만
		// 두 번째 for문이 i에 영향을 받기 때문에, 이중 for문이 총 최대 10,000,000번 실행
		// 따라서, 입력(천만번) + 출력(천만번) = 2천만번으로 정렬가능
		// 이는  Arrays.sort() (O(n^2)=천만x천만, O(nlogn)=천만x7) 보다 훨씬 빠름
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i]; j++) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
	}

}
