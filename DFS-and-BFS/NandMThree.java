import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class NandMThree {
	static int M;
	static int arr[];
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); M = sc.nextInt();
		arr = new int[N];
		for(int i = 0; i < arr.length; i++){
			arr[i] = i+1;
		}
		dfs(0);
	}
	static void dfs(int cnt) throws IOException{
		if(cnt == M){
			bw.write(sb.toString()+ "\n");
			return;
		}
		for(int i = 0; i < arr.length; i++){
			sb.append(arr[i] + " ");
			dfs(cnt+1);
			sb.delete(cnt*2, (cnt+1)*2);
		}
	}
}
