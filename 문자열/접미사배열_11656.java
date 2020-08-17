package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class 접미사배열_11656 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine(); 									// 문자열 입력받기
		
		PriorityQueue<String> result = new PriorityQueue<String>();     // 접미사를 담을 변수
		
		for(int i = 0; i < input.length(); i++) {                       // 접미사를 result 변수에 add
			result.add(input.substring(i, input.length()));
		}
		
		while(!result.isEmpty()) {										// 접미사 출력
			System.out.println(result.poll());
		}
	}
}
