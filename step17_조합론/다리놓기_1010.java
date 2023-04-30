package step17_���շ�;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// �������� ��� => �Ľ�Į�ﰢ�� => ����
// (a+b)^n = nC0*a^n*b^0 + nC1*a^n-1*b^1 ... + nCn*a^0*b^n
// 1) nCr = n!/r!(n-r)! | 2) nC0, nCn = 1 | 3) nCr = n-1Cr-1 + n-1Cr

// �� ������ 1)ó�� Ǯ�� n!�� ���ڰ� �ʹ� Ŀ�� ǥ���� �� ���� => dp�� Ǯ �� �ִ�.
public class �ٸ�����_1010 {

	// 30x30 2�����迭�� �ݸ� ��! 
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
		
		// �̹� ���ؼ� �����ߴ� ���� �׳� ���� => Memoization => dp����Ǯ���� �ٽ�
		if(dp[n][r] > 0) {
			return dp[n][r];
		}
		
		// nCr = n-1Cr-1 + n-1Cr => ���
		return dp[n][r] = combi(n-1, r-1) + combi(n-1, r);
	}

}
