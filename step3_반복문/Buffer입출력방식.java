package step3_�ݺ���;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Buffer����¹�� {

	public static void main(String[] args) throws IOException{ // ����¿���ó��
		// �Է�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		// readLine()�� Line������ �о� ���� -> ���� ������ �Է¹����� ���� �ʿ�
		// readLine()�� ���ϰ��� String���� ���� -> String�� �ƴ� �ٸ� Ÿ������ �Է� �������� ����ȯ �ʼ�
		StringTokenizer st = new StringTokenizer(s);
		// ������� 1)
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		// ������� 2)
		String[] array = s.split(" ");
		// ���
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	}

}
