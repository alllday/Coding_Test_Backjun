package step31_�׷����ͼ�ȸ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

// �����ϰ� �ٽ� �����ϱ� + git���ε�~

public class ���̿켱Ž��1_24479 {
	
	static int cnt = 1;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		
		// �����湮����
		// �ε����� 1������ �����ϱ� ����(�򰥸��� �ʰ�) ����� �ʿ��� �� ���� �ϳ� �� ũ�� �������.
		int[] visited = new int[n+1];
		// �������� ���������� �����ϱ� ���� ����Ʈ ��ø
		// 2���� �迭�� �ƴ϶� ����Ʈ ��ø�� ����? : �޸𸮹���!, 2�����迭�� ���ʿ��� ���������� �ʹ� ����
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		
		// ����Ʈ ����
		for (int i = 0; i < n+1; i++) {
			list.add(new ArrayList<Integer>());
		}
		
		// �������� �Է�&����
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			// �� ������ ���ؼ� �����ؾ� ��!
			list.get(u).add(v);
			list.get(v).add(u);
		}
		
		// ���� ���ǿ� ���� ũ�Ⱑ ���� �������� �湮�ϱ� ���� ����
		for (int i = 1; i < n+1; i++) {
			Collections.sort(list.get(i));
		}
		
		dfs(visited, list, r);
		
		for (int i = 1; i < visited.length; i++) {
			sb.append(visited[i]).append("\n");
		}
		
		System.out.println(sb);
	}
	
	// ������ ���ǿ� ���� DFS�⺻�������� ��¦ ����
	// main�� dfs�Լ����� �迭�� ����Ʈ�� ���� ���������� ���°� �� ������ �� �ϴ�. (�ٸ� �������� �� �� �� �����ϱ�)
	static void dfs(int[] visited, ArrayList<ArrayList<Integer>> list, int r) {
		visited[r] = cnt++; // cnt�� static ����
		
		for (int i = 0; i < list.get(r).size(); i++) {
			if (visited[list.get(r).get(i)] == 0) {
				dfs(visited, list, list.get(r).get(i));	
			}
		}	
	}
	
	// DFS �⺻����
//	static void dfs(int[] visited, ArrayList<ArrayList<Integer>> list, int r) {
//		visited[r] = true; 
//		
//		for (int i = 0; i < list.get(r).size(); i++) {
//			if (!visited[list.get(r).get(i)]) {
//				dfs(visited, list, list.get(r).get(i));	
//			}
//		}	
//	}
}
