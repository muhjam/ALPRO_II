package Matrik;

import java.util.Scanner;

public class MatrikIntegerV2 {
	
	public static void main(String[] args) {
		int m=3;
		int n=4;
		int [][]a=new int[m][n];

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inisialisasi array");
		for (int i=0; i<m;i++) {
			for(int j=0; j<n;j++) {
				a[i][j]=0;
			}
		}
		
		System.out.println("Menginput element-element array");
		for (int i=0; i<m;i++) {
			for(int j=0; j<n;j++) {
				System.out.print("Data ke-"+i+":");int x=sc.nextInt();
				a[i][j]=x;
			}
		}

		
		System.out.println("Menampilkan isi/element array");
		for (int i=0; i<m;i++) {
			for(int j=0; j<n;j++) {
				System.out.print(a[i][j]+"");
			}
			System.out.println();
		}
		
	}

}
