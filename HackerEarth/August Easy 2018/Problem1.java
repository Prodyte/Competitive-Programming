import java.lang.*;
import java.util.*;

class Problem1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		String t = sc.next();

		char[] sArray = s.toCharArray();
		char[] tArray = t.toCharArray();

		int steps = 0;

		for(int i=0; i<n; i++){
			int x = tArray[i] - sArray[i];
			if(x >= 0){
				steps += x%13;
				steps += x/13;
			}
			else{
				x += 26;
				steps += x%13;
				steps += x/13;
			}
		}

		System.out.println(steps);
	}
}