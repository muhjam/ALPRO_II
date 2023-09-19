package tugas1;

import java.util.Scanner;

public class nomor1 {
//	membuat function
	int N=6;
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
			System.out.print("Data ke-"+(i)+":");a[i]=sc.nextInt(); // tambahkan ini bila Scanner sc sudah di buat
		}
	}

	void TampilArray() {
		System.out.println("Menampilkan isi/element array");
		for (int i=0; i<N;i++) {
			System.out.println("Data ke "+(i)+" adalah "+a[i]);
		}
	}
	
	int CariElement(int x) {
		int index=-1;
	       for (int i = 0; i < N; i++)
	       {
	        if(a[i]==x) {
	    		index= i;
	        }
	       }
	       return index;
	}
	
	int search(int x) {
 		int index=-1;
 		int i=0;
	
 	while((i<N-1)&&(a[i] != x)){
		i++;
	}
	
	if(a[i]==x) {
		index=i;
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
		if(A.search(k)>=0) {
		System.out.println("Value "+ k +" berada pada index ke: " + A.search(k));
		}else{
			System.out.println("Value X "+ k +" yang anda cari tidak ada");
		}
	}

}
