import java.util.Arrays;
import java.util.Scanner;

public class NandMOne {
	static int arr[];
	static int result[];
	static boolean v[];
	static int M;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();  M =sc.nextInt();
		arr = new int[N];
		result = new int [M];
		for(int i = 0; i < arr.length; i++ ){
			arr[i] = i+1;
		}
		v = new boolean[N];
		dfs(0);
		
	}
	
	static void dfs(int cnt){
		if(cnt == M){
			for(int i = 0 ; i < result.length; i++){
				System.out.print(result[i] + " ");
			}
			System.out.println();
			return;
		}
		for(int i = 0; i <arr.length; i++){
			if(!v[i]){
				result[cnt] = arr[i];
				v[i] = true;
				dfs(cnt+1);				
				v[i] = false;
			}
		}
	}
}
