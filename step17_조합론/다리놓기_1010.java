package step17_조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 이항정리 계수 => 파스칼삼각형 => 조합
// (a+b)^n = nC0*a^n*b^0 + nC1*a^n-1*b^1 ... + nCn*a^0*b^n
// 1) nCr = n!/r!(n-r)! | 2) nC0, nCn = 1 | 3) nCr = n-1Cr-1 + n-1Cr

// 이 문제는 1)처럼 풀면 n!의 숫자가 너무 커서 표현할 수 없음 => dp로 풀 수 있다.
public class 다리놓기_1010 {

	// 30x30 2차원배열을 반만 씀! 
	static int[][] dp = new int[30][30];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			sb.append(combi(m,n)).append("\n");
		}
		
		System.out.println(sb);
	}
	
	static int combi(int n, int r) {
		
		// nC0, nCn = 1
		if(n==r || r==0) {
			return dp[n][r] = 1;
		}
		
		// 이미 구해서 저장했던 값은 그냥 리턴 => Memoization => dp문제풀이의 핵심
		if(dp[n][r] > 0) {
			return dp[n][r];
		}
		
		// nCr = n-1Cr-1 + n-1Cr => 재귀
		return dp[n][r] = combi(n-1, r-1) + combi(n-1, r);
	}

}
