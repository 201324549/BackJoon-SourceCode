package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 그룹단어체커_1316 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] input = new String[N];
		int[] check;
		int result = 0;
		for(int i = 0; i < N; i++) {
			input[i] = br.readLine();
			check = new int[26];
			boolean flag = true;
			for(int j = 0; j < input[i].length(); j++) {
				if(check[input[i].charAt(j) -'a'] != 0) {
					flag = false;
					break;
				}
				
				if(j == input[i].length()-1) {
					continue;
				}
				
				if(input[i].charAt(j) == input[i].charAt(j+1)) {
					continue;
				}
				
				check[input[i].charAt(j)-'a']++;
			}
			if(flag) {
				result++;
			}
		}
		
		System.out.println(result);
		
	}
}
