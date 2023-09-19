package Matrik;

import java.util.Scanner;

import latihan1.ArrayMahasiswa;

public class MainMatrik {
	
	static void PenjumlahanMatrik(MatrikInteger A, MatrikInteger B, MatrikInteger C) {
		int x=0;
		
		if(A.m==B.m && A.n==B.n) {
			for (int i=0; i<A.m;i++) {
				for(int j=0; j<A.n;j++) {
				x=A.GetElemen(i, j)+B.GetElemen(i, j);
				C.SetElemen(i, j, x);
				}
			}
		}else{
			System.out.println("Tidak bisa");
		}
	}
	
	static void PenguranganMatrik(MatrikInteger A, MatrikInteger B, MatrikInteger C) {
		int x=0;
		
		if(A.m==B.m && A.n==B.n) {
			for (int i=0; i<A.m;i++) {
				for(int j=0; j<A.n;j++) {
					x=A.GetElemen(i, j)-B.GetElemen(i, j);
					C.SetElemen(i, j, x);
				}
			}
		}else{
			System.out.println("Tidak bisa");
		}
	}
	
//	static void PerkalianMatrik(MatrikInteger A, MatrikInteger B, MatrikInteger C) {
//		int x=0;
//
//		for (int i=0; i<A.m;i++) {
//			for(int j=0; j<A.n;j++) {
//				for(int k=0;k<A.m;k++) {
//					x+=A.GetElemen(i, k)*B.GetElemen(k, j);
//				}
//				C.SetElemen(i, j, x);
//				x=0;
//			}
//		}
//	}
	
	static void PerkalianMatrik(MatrikInteger A, MatrikInteger B, MatrikInteger C) {
		int x;

		if(A.n==B.m){
			for (int i=0; i<A.m;i++) {
				C.SetElemen(i, 0, 0);
				for(int j=0; j<A.n;j++) {
					x=0;
					for(int k=0;k<A.m;k++) {
						x+=A.GetElemen(i, k)*B.GetElemen(k, j);
					}
					C.SetElemen(i, j, x);
				}
			}
		}else{
			System.out.println("Tidak bisa");
		}
	}
	
	
	static void SegitigaAtas(MatrikInteger SGA, MatrikInteger A) {
		int x;
		
	for (int i=0; i<A.m;i++) {
		for(int j=0; j<A.n;j++) {
			if(i>j) {
					SGA.SetElemen(i, j, 0);
				}else {
				x=A.GetElemen(i, j);
					SGA.SetElemen(i, j, x);
				}
			}
		}
	}
	
	

	public static void main(String[] args) {
		MatrikInteger A=new MatrikInteger(); // manggil class
		MatrikInteger B=new MatrikInteger(); 
		MatrikInteger C=new MatrikInteger(); // manggil class
		MatrikInteger SGA=new MatrikInteger(); 
		Scanner sc = new Scanner(System.in); // supaya bisa di inputkan

		A.InitMatrik();
		A.InputMatrik();
		System.out.println("Menampilkan Matrik A");
		A.TampilMatrik();
	
//		B.InputMatrik();
//		System.out.println("Menampilkan Matrik B");
//		B.TampilMatrik();
		
//		PenjumlahanMatrik(A, B, C);
//		System.out.println("Menampilkan Matrik C (Penjumlahan)");
//		C.TampilMatrik();
//		
//		PenguranganMatrik(A, B, C);
//		System.out.println("Menampilkan Matrik C (Pengurangan)");
//		C.TampilMatrik();
		
//		PerkalianMatrik(A, B, C);
//		System.out.println("Menampilkan Matrik C (Perkalian)");
//		C.TampilMatrik();
		
		SegitigaAtas(SGA, A);
		System.out.println("Menampilkan Matrik SGA");
		SGA.TampilMatrik();
		
	}

}
