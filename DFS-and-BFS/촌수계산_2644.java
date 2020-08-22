import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 촌수계산_2644 {
	static int people[];
	static int result;
	static boolean v[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		v = new boolean[n+1];
		people = new int[n+1];
		result = -1;
		int A = sc.nextInt();  int B = sc.nextInt();
		int m = sc.nextInt();
		for(int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			people[y] = x;
		}
		
		dfs(A,B,0);
		System.out.println(result);
	}
	
	static void dfs(int start, int target ,int cnt) {
		
		if(start == target) {
			result = cnt;
			return;
		}
		
		v[start] = true;
		for(int i = 1; i < people.length; i++) {
			
			if(start == 0) {
				break;
			}
			
			if(people[i] == start) {
				if(v[i]) {
					continue;
				}
				v[i] = true;
				dfs(i, target, cnt + 1);
				v[i] = false;
			}
		}
		
		if(!v[people[start]]) {
			dfs(people[start], target, cnt+1);			
		}
		
	}
}
