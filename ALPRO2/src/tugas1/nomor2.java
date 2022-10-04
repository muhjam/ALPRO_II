package tugas1;

import java.util.Scanner;

public class nomor2 {
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
			System.out.print("Data ke-"+(i)+":");a[i]=sc.nextInt(); // tambahkan ini bila Scanner sc sudah di buat
		}
	}
	
	void TampilArray() {
		for(int i = 0; i< a.length;i++ ) {
			System.out.println("Data ke-"+(i)+": "+a[i]);
		}
	}
	
	void SortingKecil() {
	    for ( int i = 0; i < a.length; i ++ ) {
	        for ( int j = 0; j < a.length - 1 ; j ++ ) {
	            if ( a[ j ] > a[ j + 1 ] ) {
	                int temp = a[ j ];
	                a[ j ] = a[ j + 1 ];
	                a[ j + 1 ] = temp ;
	            }
	        }
	    }
	}

	void SortingBesar() {
	    for ( int i = 0; i < a.length; i ++ ) {
	        for ( int j = 0; j < a.length - 1 ; j ++ ) {
	            if ( a[ j ] < a[ j + 1 ] ) {
	                int temp = a[ j ];
	                a[ j ] = a[ j + 1 ];
	                a[ j + 1 ] = temp ;
	            }
	        }
	    }
	}
	
	
//	isi eksekusi
	public static void main(String[] args) {
		nomor2 A=new nomor2(); // manggil class
		Scanner sc = new Scanner(System.in); // supaya bisa di inputkan
//	memanggil semua function dengan urutannya
		A.InitArray();
		A.InputArray();
		//menggunakan Bubble Sort                        
		// sorting kecil ke kebesar
		A.SortingKecil(); 
		System.out.println("");
		System.out.println("Sorting dari kecil ke besar:");
		A.TampilArray();
		// sorting besar ke kecil
		A.SortingBesar();
		System.out.println("");
		System.out.println("Sorting dari besar ke kecil:");
		A.TampilArray();
	}
}
