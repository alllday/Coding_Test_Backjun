package step4_1차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 평균1546_burffer {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		double[] grade = new double[n];
		double max = 0;
		double sum = 0;
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			
			grade[i] = Integer.parseInt(st.nextToken());
			if (max < grade[i]) {
				max = grade[i];
			}
		}
		for (int i = 0; i < n; i++) {
			grade[i] = grade[i]/max*100;
			sum += grade[i];
		}
		bw.write(sum/n + "");
		bw.close();
	}
}
