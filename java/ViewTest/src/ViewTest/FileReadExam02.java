package ViewTest;

import java.util.Scanner;

public class FileReadExam02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("숫자 입력");
		
		int N = sc.nextInt();	
		
		int[][] arr;
		arr = new int[N][N];
		arr[0][0] = 1;
		arr[N-1][N-1] = N*N;
		int row = 1, col = 0, value = 2;
		
		for(int i = 1; i < N; i++) {
			arr[row][col] = value++;
			/*
			 * System.out.println("i = " + i); System.out.println("x = " + x);
			 * System.out.println("y = " + y); System.out.println("value = " + value);
			 */
			for (int j = 0; j < i; j++) {
				if(i%2 == 1) {
					row--;
					col++;
				}
				else {
					row++;
					col--;
				}
				arr[row][col] = value++;
			}
			if(i%2 == 1) {
				col++;
			}
			else {
				row++;
			}
		}
		System.out.println(N);
		if(N%2==1) {
			row--;
			col++;
		}
		else {
			row++;
			col--;
		}
		/*
		 * System.out.println("x = " + x); System.out.println("y = " + y);
		 * System.out.println("value = " + value);
		 */
		for(int i = N-2; i > 0;i--) 
		{
			arr[row][col] = value++; 
			/*
			 * System.out.println("i = " + i); System.out.println("x = " + x);
			 * System.out.println("y = " + y); System.out.println("value = " + value);
			 */
			for (int j = 0; j < i; j++) {
				if(i%2 == 1) {
					row--;
					col++;
				}
				else {
					row++;
					col--;
				}
				arr[row][col] = value++;
			}
			if(i%2 == 1) {
				row++;
			}
			else {
				col++;
			}
		}
		
		
	
		for(int i = 0; i < N;i++) {
			for (int j = 0; j < N; j++) {
				if(arr[i][j]<10)
					System.out.print("0" + arr[i][j] + " ");
				else
					System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
