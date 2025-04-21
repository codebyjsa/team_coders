import java.util.Scanner;

public class untitled{
	public static boolean isprime(int a){
		if (a<=1) {
			return false;
		}
		for (int i = 2; i<a; i++) {
			if (a%i == 0) {
				return false;
			}
			
		}
		return true;
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter no of rows and columns: ");
		int n = sc.nextInt();

		int[][] arr = new int[n][n];

		System.out.print("Enter element: ");
		for (int i =0; i<n; i++) {
			for (int j=0; j<n; j++) {
				int num = sc.nextInt();
				arr[i][j] = num;
			}
		}

		int max_n = 0;

		for (int i = 0; i<n; i++) {
			if (isprime(arr[i][i])) {
				max_n = Math.max(max_n, arr[i][i]);
			}if (isprime(arr[i][n-i-1])) {
				max_n = Math.max(max_n, arr[i][n-i-1]);
			}
			
		}

		if (max_n == 0) {
			System.out.println("No prime numbers found!");
		}else {
			System.out.println("lagest prime number is: "+max_n);
		}
	}
}
