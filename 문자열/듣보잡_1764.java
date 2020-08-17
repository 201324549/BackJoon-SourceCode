package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class 듣보잡_1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());                       	//  듣도 못한 사람의 수
		int M = Integer.parseInt(st.nextToken());							//  보도 못한 사람의 수
		
		String[] Narr = new String[N];										//  듣도 못한 사람의 이름 배열
		PriorityQueue<String> result = new PriorityQueue<String>();		 	//  듣보잡의 명단을 저장할 변수

		for(int i = 0 ; i < N; i++) {										//  듣도 못한 사람의 이름 입력
			Narr[i] = br.readLine();
		}
		Arrays.sort(Narr); 													//  배열을 오름차순 정렬한다.
		
		for(int i = 0 ; i < M; i++) {										//  보도 못한 사람의 이름 입력
			String input = br.readLine();
			if(Arrays.binarySearch(Narr, input) >= 0) {
				result.offer(input);
			}
		}
		
		
		System.out.println(result.size());											//  듣보잡의 수 출력
		while(!result.isEmpty()) {								//  그 명단을 사전순으로 출력한다.
			System.out.println(result.poll());
		}
		
	}
}
