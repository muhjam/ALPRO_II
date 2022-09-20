package LARIK;

import java.util.Scanner;

public class LarikInt2 {
//	membuat function
	int n=3;
	int []a=new int[n]; // membuat array
	
	void InitArray() {
		System.out.println("Inisialisasi array");
		for (int i=0; i<n;i++) {
			a[i]=0;
		}
	}

	void InputArray() {
		System.out.println("Menginput element-element array");
		Scanner sc = new Scanner(System.in); // supaya bisa di inputkan
		for (int i=0; i<n;i++) {
			System.out.print("Data ke-"+i+":");a[i]=sc.nextInt(); // tambahkan ini bila Scanner sc sudah di buat
		}
	}

	void TampilArray() {
		System.out.println("Menampilkan isi/element array");
		for (int i=0; i<n;i++) {
			System.out.println("Data ke "+i+" adalah "+a[i]);
		}
	}
	
	void Rata() {
		int total=0;
		for(int i=0; i<n;i++) {
			total=total + a[i];
		}
		double rata=(double)total/n;
		System.out.println("Rata-rata adalah: "+ rata);
	}
	
//	isi eksekusi
	public static void main(String[] args) {
		LarikInt2 A=new LarikInt2(); // manggil class
		
//	memanggil semua function dengan urutannya
		A.InitArray();
		A.InputArray();
		A.TampilArray();
		
		A.Rata();

	}


}
