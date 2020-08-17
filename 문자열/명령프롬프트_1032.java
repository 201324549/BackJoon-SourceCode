package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 명령프롬프트_1032 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String arr[] = new String[N];
		for(int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}
		
		String result = "";
		boolean[] barr = new boolean[arr[0].length()];
		
		for(int i = 0; i < arr[0].length(); i++) {
			char check = arr[0].charAt(i);
			for(int j = 1; j < N; j++) {
				if(check != arr[j].charAt(i)) {
					barr[i] = true;
					break;
				}
			}
		}
		
		
		for(int i = 0; i < arr[0].length(); i++) {
			if(!barr[i]) {
				result += arr[0].charAt(i);
			} else {
				result += "?";
			}
		}
		
		System.out.println(result);
	}
}
