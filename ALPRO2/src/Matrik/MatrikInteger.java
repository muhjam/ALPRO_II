package Matrik;

import java.util.Scanner;

import latihan1.ArrayMahasiswa;

public class MatrikInteger {
	int m=3; // baris semua matrik
	int n=3; // kolom semua matrik
	int [][]a=new int[m][n];

	Scanner sc = new Scanner(System.in);
	
	void InitMatrik() {
		for (int i=0; i<m;i++) {
			for(int j=0; j<n;j++) {
				a[i][j]=0;
			}
		}
	}

	void InputMatrik() {
		for (int i=0; i<m;i++) {
			for(int j=0; j<n;j++) {
				System.out.print("Data baris "+i+" kolom "+j+":");int x=sc.nextInt();
				a[i][j]=x;
			}
		}
	
	}

	void TampilMatrik() {
		System.out.println("Menampilkan isi/element array");
		for (int i=0; i<m;i++) {
			for(int j=0; j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	void SegitigaAtas() {
		for (int i=0; i<m;i++) {
			for(int j=0; j<n;j++) {
				if(i>j) {
					a[i][j]=0;				
				}
			}
		}
	}

	int GetElemen(int i, int j) {
		return a[i][j];
	}

	void SetElemen(int i, int j, int x) {
		Scanner sc = new Scanner(System.in);
		System.out.print("datanya "+i+" ");a[i][j]=x;
	}

	public static void main(String[] args) {
		MatrikInteger A=new MatrikInteger(); // manggil class
		MatrikInteger B=new MatrikInteger(); 
		Scanner sc = new Scanner(System.in); // supaya bisa di inputkan

		A.InitMatrik();
		A.InputMatrik();
		System.out.println("Menampilkan Matrik A");
		A.TampilMatrik();
		
		B.InputMatrik();
		System.out.println("Menampilkan Matrik B");
		B.SegitigaAtas();
		
		B=A;
		System.out.println("Menampilkan Matrik B sebelum buat Segitiga Atas");
		B.TampilMatrik();
		
		System.out.println("Menampilkan Matrik Asli setelah buat SGA");
		A.TampilMatrik();
		
	}

}
