import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Island {
	static int[] dy= {-1, -1, 0, 1, 1, 1, 0, -1};
	static int[] dx= {0, 1, 1, 1, 0, -1, -1, -1};
	static boolean[][] v;
	static int count = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N , M;
		while(true) {
			N = sc.nextInt(); M = sc.nextInt();
			if(N == 0 && M == 0) {
				break;
			}
			int map[][] = new int[M][N];
			v = new boolean[M][N];
			for(int i = 0; i < map.length; i++) {
				for(int j = 0; j < map[0].length; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			for(int i =0; i< map.length; i++) {
				for(int j =0; j < map[0].length; j++) {
					if(v[i][j] == false && map[i][j] == 1) {
						bfs(j, i, map);		
					}		
				}
			}
			for(int i =0; i< map.length; i++) {
				for(int j =0; j < map[0].length; j++) {
					System.out.print(v[i][j] + " ");
				}
				System.out.println();
			}
		
			System.out.println(count);
			count = 0;
		}
	}
	static void bfs(int x, int y, int[][] map) {
		Queue<XY> q = new LinkedList<XY>();
		q.offer(new XY(x,y));
		v[y][x] = true;
		XY a;
		int nx, ny;
		while(!q.isEmpty()) {
			a = q.poll();
				for(int i = 0; i < 8; i++) {
					nx = a.x + dx[i];
					ny = a.y + dy[i];
					if(nx < 0 || ny < 0 || nx >= map[0].length || ny >= map.length) {
						continue;
					}
					if(v[ny][nx]) {
						continue;
					}
					if(map[ny][nx] == 0) {
						continue;
					}
					
					v[ny][nx] = true;
					q.offer(new XY(nx,ny));
				}
			
		}
		count++;
		
	}
	
	static class XY{
		int x;
		int y;
		public XY(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
