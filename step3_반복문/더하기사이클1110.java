package step3_�ݺ���;

import java.util.Scanner;

public class ���ϱ����Ŭ1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();
		
		int first = input / 10;
		int second = input % 10;
		int newNum = 0;
		int sum = 0;
		int cnt = 0;
		
		if (input == 0) { // ó�� input�� 0�϶��� ����ó��
			cnt++;
			
		}
		
		else { // ó�� input�� 0�� �ƴ� ��
			while (input != newNum) {
				if (cnt == 0) { // ó�� �����Ҷ���
					if (first == 0) {
						first = second;
					} else {
						sum = first + second;

						first = input % 10; // first�� ó�����ö� input % 10�̾��
						if (sum >= 10) {
							second = sum % 10;
						} else {
							second = sum;
						}
					}
				} else { // �ι�°����
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