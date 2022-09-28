package tugas1;

import java.util.Scanner;

public class nomor1 {
//	membuat function
	int N=5;
	int []a=new int[N]; // membuat array
	
	void InitArray() {
		System.out.println("Inisialisasi array");
		for (int i=0; i<N;i++) {
			a[i]=0;
		}
	}

	void InputArray() {
		System.out.println("Menginput element-element array");
		Scanner sc = new Scanner(System.in); // supaya bisa di inputkan
		for (int i=0; i<N;i++) {
			System.out.print("Data ke-"+(i+1)+":");a[i]=sc.nextInt(); // tambahkan ini bila Scanner sc sudah di buat
		}
	}

	void TampilArray() {
		System.out.println("Menampilkan isi/element array");
		for (int i=0; i<N;i++) {
			System.out.println("Data ke "+(i+1)+" adalah "+a[i]);
		}
	}
	
	int CariElement(int x) {
		int index=0;
	       for (int i = 0; i < N; i++)
	       {
	        if(a[i]==x) {
	    		index= i+1;
	        }
	       }
	       return index;
	}
	
	
//	isi eksekusi
	public static void main(String[] args) {
		nomor1 A=new nomor1(); // manggil class
		Scanner sc = new Scanner(System.in); // supaya bisa di inputkan
//	memanggil semua function dengan urutannya
		A.InitArray();
		A.InputArray();
		A.TampilArray();
		
		System.out.print("Mencari index dengan value :");int k=sc.nextInt();
		if(A.CariElement(k)>0) {
		System.out.println("Value "+ k +" berada pada index ke: " + A.CariElement(k));
		}else{
			System.out.println("Value X "+ k +" yang anda cari tidak ada");
		}
	}

}
