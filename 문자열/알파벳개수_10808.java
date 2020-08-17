package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알파벳개수_10808 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int[] count = new int[26];
		
		for(int i = 0; i < input.length(); i++) {
			count[input.charAt(i) - 'a'] ++;
		}
		
		for(int i = 0; i < count.length; i++) {
			System.out.print(count[i] + " ");
		}
	}
}
