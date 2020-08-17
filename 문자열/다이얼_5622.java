package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 다이얼_5622 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int count[] = {3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10};
		
		int sum = 0;
		for(int i = 0; i < input.length(); i++) {
			sum += count[input.charAt(i) - 'A'];
		}
		
		
		System.out.println(sum);
	}
}
