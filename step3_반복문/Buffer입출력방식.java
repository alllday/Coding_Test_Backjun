package step3_반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Buffer입출력방식 {

	public static void main(String[] args) throws IOException{ // 입출력예외처리
		// 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		// readLine()시 Line단위로 읽어 들임 -> 여러 데이터 입력받을시 가공 필요
		// readLine()시 리턴값이 String으로 고정 -> String이 아닌 다른 타입으로 입력 받으려면 형변환 필수
		StringTokenizer st = new StringTokenizer(s);
		// 가공방법 1)
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		// 가공방법 2)
		String[] array = s.split(" ");
		// 출력
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	}

}
