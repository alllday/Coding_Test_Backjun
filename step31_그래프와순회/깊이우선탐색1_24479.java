package step31_그래프와순회;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

// 정리하고 다시 제출하기 + git업로드~

public class 깊이우선탐색1_24479 {
	
	static int cnt = 1;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		
		// 정점방문여부
		// 인덱스를 1번부터 시작하기 위해(헷갈리지 않게) 사이즈를 필요한 것 보다 하나 더 크게 만들어줌.
		int[] visited = new int[n+1];
		// 정점별로 간선정보를 저장하기 위해 리스트 중첩
		// 2차원 배열이 아니라 리스트 중첩인 이유? : 메모리문제!, 2차원배열은 불필요한 정보저장이 너무 많음 ( 단, 검색에 있어서는 배열이 더 빠르다! )
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		
		// 리스트 생성
		for (int i = 0; i < n+1; i++) {
			list.add(new ArrayList<Integer>());
		}
		
		// 간선정보 입력&저장
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			// 양 정점에 대해서 저장해야 함!
			list.get(u).add(v);
			list.get(v).add(u);
		}
		
		// 문제 조건에 따라 크기가 작은 정점부터 방문하기 위해 정렬
		for (int i = 1; i < n+1; i++) {
			Collections.sort(list.get(i));
		}
		
		dfs(visited, list, r);
		
		for (int i = 1; i < visited.length; i++) {
			sb.append(visited[i]).append("\n");
		}
		
		System.out.println(sb);
	}
	
	// 문제에 조건에 따라 DFS기본구조에서 살짝 변형
	// main과 dfs함수에서 배열과 리스트를 쓰니 전역변수로 쓰는게 더 좋았을 듯 하다. (다른 곳에서도 쓸 수 도 있으니까)
	static void dfs(int[] visited, ArrayList<ArrayList<Integer>> list, int r) {
		visited[r] = cnt++; // cnt는 static 선언
		
		for (int i = 0; i < list.get(r).size(); i++) {
			if (visited[list.get(r).get(i)] == 0) {
				dfs(visited, list, list.get(r).get(i));	
			}
		}	
	}
	
	// DFS 기본구조
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
