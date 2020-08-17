package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KMP는왜KMP일까_2902 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String result = "";
		
		String []arr = input.split("-");
		
		for(int i = 0; i < arr.length; i++) {
			result += arr[i].charAt(0);
		}
		
		System.out.println(result);
	}
}
