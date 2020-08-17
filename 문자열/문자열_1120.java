package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 문자열_1120 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());				//  문자열 A와 B 입력받기
		String A = st.nextToken();
		String B = st.nextToken();
		int dif = B.length() - A.length();										// 두 문자열 길이의 차이
		
		int min = 50;															// 차이의 최소를 담을 변수

		for(int i = 0; i <= dif; i++) {
			int sum = 0;														// 두 문자열의 차이의 합을 담을 변수
			String subB = B.substring(i, i+A.length());							
			for(int j = 0; j < A.length(); j++) {
				if(A.charAt(j) != subB.charAt(j)) {
					sum++;
				}
			}
			
			if(sum < min) {														// 최소값 갱신
				min = sum;
			}
		
		}
		System.out.println(min);												// 차이의 최소 출력
	}
}
