package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 상수_2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] arr = input.split(" ");
		StringBuilder sb1 = new StringBuilder(arr[0]);
		StringBuilder sb2 = new StringBuilder(arr[1]);
		String num1 = sb1.reverse().toString();
		String num2 = sb2.reverse().toString();
		
		if(Integer.parseInt(num1) > Integer.parseInt(num2)) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
	}
}
