package LARIK;

import java.util.Scanner;

public class LarikInt3 {
//	membuat function
	int n=5;
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
	
	int GetElemen(int i) {
		return a[i];
	}
	
	void SetElemen(int i) {
		Scanner sc = new Scanner(System.in); // supaya bisa di inputkan
		System.out.print("Data index ke-"+i+":");a[i]=sc.nextInt();
	}
	
	
	void BubbleSortMembesar() {
		int temp;
		
		for(int tahap=1; tahap<=n-1; tahap++) {
			for(int i=0; i<=n-tahap-1;i++) {
				if(a[i]>a[i+1]) {
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
	}
	
	void BubbleSortMengecil() {
		int temp;
		
		for(int tahap=1; tahap<=n-1; tahap++) {
			for(int i=0; i<=n-tahap-1;i++) {
				if(a[i]<a[i+1]) {
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
	}
	
//	isi eksekusi
	public static void main(String[] args) {
		LarikInt3 A=new LarikInt3(); // manggil class
		Scanner sc = new Scanner(System.in); // supaya bisa di inputkan
//	memanggil semua function dengan urutannya
		A.InitArray();
		A.InputArray();
		A.TampilArray();
		
//		A.Rata();
//		System.out.print("Tampil elemen keberapa :");int k=sc.nextInt();
//		System.out.println("Tampi elemen :" + A.GetElemen(k));
		
//		A.SetElemen(k);
//		A.TampilArray();
		
		A.BubbleSortMembesar();
		A.TampilArray();
		A.BubbleSortMengecil();
		A.TampilArray();
	}
}
