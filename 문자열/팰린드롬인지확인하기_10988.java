package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팰린드롬인지확인하기_10988 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();							// 주이전 단어 입력받기
		for(int i = 0; i < input.length()/2; i++) {
			if(input.charAt(i) != input.charAt(input.length()-i-1)) {		// 팰린드롬이아니면
				System.out.println(0);										// 0 을 출력 후
				return;														// 리턴
			}
		}
		
		System.out.println(1); 												// 팰린드롬이면 1을출력
	}
}
