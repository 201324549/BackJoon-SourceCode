package Union_Find;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 집합의표현_1717 {
	
	static int parents[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("");
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		parents = new int[n+1];
		int m = Integer.parseInt(st.nextToken());
		makeSet();
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int check = Integer.parseInt(st.nextToken());
			
			if(check == 0) {
				union(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
			} else if (check == 1) {
				int x = parents[Integer.parseInt(st.nextToken())];
				int y = parents[Integer.parseInt(st.nextToken())];
				
				if(find(x) == find(y)) {
					sb.append("YES\n");
				} else {
					sb.append("NO\n");
				}
			}
		}
		System.out.println(sb.toString());
	}
	
	static void makeSet() {
		for(int i = 0; i < parents.length; i++) {
			parents[i] = i;
		}
	}
	
	static int find(int x) {
		if(parents[x] == x) {
			return x;
		}
		
		int nx = find(parents[x]);
		parents[x] = nx;
		return nx;
	}
	
	static void union(int x, int y) {
		x = find(x);
		y = find(y);
		
		if(x == y) {
			return;
		}
		
		
		parents[y] = x;
		
		
	}
	
}
