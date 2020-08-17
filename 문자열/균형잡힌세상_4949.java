package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 균형잡힌세상_4949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		abc : while(true) {
			Stack<Character> st = new Stack<Character>();				// ( , [ 를 저장할 스택 변수
			String input = br.readLine();								// 문자열 입력받기
			if(input.equals(".")) {
				break;
			}
			for(int i = 0 ; i < input.length(); i++) {
				if(input.charAt(i) == '(') {
					st.push(input.charAt(i));
					
				} else if(input.charAt(i) == '[') {
					st.push(input.charAt(i));
				} else if(input.charAt(i) == ')') {
					if(!st.isEmpty() && st.peek() == '(') {
						st.pop();
					} else {
						System.out.println("no");
						continue abc;
					}
				} else if(input.charAt(i) == ']') {
					if(!st.isEmpty() &&  st.peek() == '[') {
						st.pop();
					} else {
						System.out.println("no");
						continue abc;
					}
				}
			}
			if(st.size() == 0) {
				System.out.println("yes");				
			} else {
				System.out.println("no");
			}
		}
	}
}
