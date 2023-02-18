package step3_반복문;

import java.util.Scanner;

public class 더하기사이클1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();
		
		int first = input / 10;
		int second = input % 10;
		int newNum = 0;
		int sum = 0;
		int cnt = 0;
		
		if (input == 0) { // 처음 input이 0일때만 예외처리
			cnt++;
			
		}
		
		else { // 처음 input이 0이 아닐 때
			while (input != newNum) {
				if (cnt == 0) { // 처음 시작할때만
					if (first == 0) {
						first = second;
					} else {
						sum = first + second;

						first = input % 10; // first가 처음들어올때 input % 10이어야
						if (sum >= 10) {
							second = sum % 10;
						} else {
							second = sum;
						}
					}
				} else { // 두번째부터
					if (first == 0) {
						first = second;
					} else {
						sum = first + second;

						first = newNum % 10;
						if (sum >= 10) {
							second = sum % 10;
						} else {
							second = sum;
						}
					}
				}
				newNum = first * 10 + second;
				first = newNum / 10;
				second = newNum % 10;
				cnt++;
			} 
		}
		System.out.println(cnt);
	}
}