package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 하얀칸_1100 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[][] map = new char[8][8];
		int result = 0;
		for(int i = 0; i < 8; i++) {
			map[i] = br.readLine().toCharArray();
		}
		
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				
			
				
				if((i+j) % 2 == 0 && map[i][j] == 'F') {
					result++;
				}
			}
		}
		System.out.println(result);
	}
}
