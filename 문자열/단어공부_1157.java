package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어공부_1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		int count[] = new int[26];
		
		for(int i = 0; i < input.length(); i++) {
			char alpha = input.charAt(i);
			if(alpha >= 'a' && alpha <= 'z') {
				count[alpha -'a'] ++;
			}
			
			if(alpha >= 'A' && alpha <= 'Z') {
				count[alpha -'A'] ++;				
			}
		}
		
		int max = 0;
		
		for(int i = 0; i < count.length; i++) {
			if(count[i] > max) {
				max = count[i];
			}
		}
		
		int num = 0;
		int idx = 0;
		for(int i = 0; i < count.length; i++) {
			if(count[i] == max ) {
				idx = i;
				num++;
			}
		}
		
		if(num > 1) {
			System.out.println("?");
		} else {
			char alpha = (char)((int)'A' + idx);
			System.out.println(alpha);
		}
		
		
	}
}
