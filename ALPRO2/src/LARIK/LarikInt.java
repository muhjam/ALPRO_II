package LARIK;

import java.util.Scanner;

public class LarikInt {
	
	public static void main(String[] args) {
		int n=3;
		int []a=new int[n];

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inisialisasi array");
		for (int i=0; i<n;i++) {
			a[i]=0;
		}
		
		System.out.println("Menginput element-element array");
		for (int i=0; i<n;i++) {
			System.out.print("Data ke-"+i+":");a[i]=sc.nextInt();
		}
		
		System.out.println("Menampilkan isi/element array");
		for (int i=0; i<n;i++) {
			System.out.println("Data ke "+i+" adalah "+a[i]);
		}
		
		int total=0;
		for(int i=0; i<n;i++) {
			total=total + a[i];
		}
		double rata=(double)total/n;
		System.out.println("Rata-rata adalah: "+ rata);
	}


}
