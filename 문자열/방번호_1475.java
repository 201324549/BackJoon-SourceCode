package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 방번호_1475 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		int[] count = new int[9];
		
		
		for(int i = 0; i < N.length(); i++) {
			if(N.charAt(i) -'0' == 9 || N.charAt(i) -'0' == 6) {
				count[6] ++;
			} else {
				count[N.charAt(i) - '0'] ++;
			}
		}
		
		int max = 0;
		
		
		for(int i = 0; i < count.length; i++) {
			if(i == 6) {
				if(max < count[i]/2 + count[i] % 2) {
					max = count[i]/2 + count[i] % 2;
				}
			} else {
				if(max < count[i]) {
					max = count[i];
				}
			}
		}
		
		System.out.println(max);
		
	}
}
