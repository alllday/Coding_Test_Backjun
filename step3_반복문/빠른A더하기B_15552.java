package step3_�ݺ���;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ����A���ϱ�B_15552 {

	public static void main(String[] args) throws IOException{ // ����¿���ó��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int input = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < input; i++) {
			st = new StringTokenizer(br.readLine());
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
			//�ٷιٷ����
			//bw.flush();
		}
		bw.close();
	}

}
