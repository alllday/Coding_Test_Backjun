package step17_재귀;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 하노이탑이동순서_11729 {

	static int cnt = 0;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		hanoi(n, 1, 2, 3);
		// bw.write(cnt + "\n" + sb);
		bw.write(cnt + "\n" + sb);
		bw.flush();
		bw.close();
	}
	
	static void hanoi(int n, int start, int mid, int to) {
		cnt++;
		if (n==1) {
			sb.append(start + " " + to + "\n");
			// sb.append(start).append(" ").append(to).append("\n");
			return;
		} else {
			hanoi(n-1, start, to, mid);
			sb.append(start + " " + to + "\n");
			// sb.append(start).append(" ").append(to).append("\n");
			hanoi(n-1, mid, start, to);
		}
	}

}
