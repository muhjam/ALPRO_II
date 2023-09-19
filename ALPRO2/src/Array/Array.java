package Array;

import java.util.Scanner;

public class Array {
//	jumlah penyimpanan array
	int N=5;
	
	// membuat array
	String[] nama= {"udin", "samal"}; 
	int[] B= {1,2,3};
	
	String[] C=new String[N];
	void InitArrayC() {
		C[0]="udin";
		C[1]="samal";
	}
	
	void tampil() {
		System.out.print(nama[1]);
	}

	
//	isi eksekusi
	public static void main(String[] args) {
		Array A=new Array(); // manggil class
		Scanner sc = new Scanner(System.in); // supaya bisa di inputkan
		A.tampil();
	}
}
