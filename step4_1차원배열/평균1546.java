package step4_1차원배열;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 평균1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] grade = new double[N];
		double max = 0;
		double sum = 0;
		
		for (int i = 0; i < N; i++) {
			grade[i] = sc.nextInt();
			if (max < grade[i]) {
				max = grade[i];
			}
		}
		for (int i = 0; i < N; i++) {
			grade[i] = grade[i]/max*100;
			sum += grade[i];
		}
		System.out.println(sum/N);
	}

}
