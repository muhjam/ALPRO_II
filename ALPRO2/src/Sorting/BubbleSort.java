package Sorting;

import java.util.Scanner;

public class BubbleSort {
//	membuat function
	int N=5;
	int []A=new int[N]; // membuat array
	
	void InitArray() {
		System.out.println("Inisialisasi array");
		for (int i=0; i<N;i++) {
			A[i]=0;
		}
	}

	void InputArray() {
		System.out.println("Menginput element-element array");
		Scanner sc = new Scanner(System.in); // supaya bisa di inputkan
		for (int i=0; i<N;i++) {
			System.out.print("Data ke-"+i+":");A[i]=sc.nextInt(); // tambahkan ini bila Scanner sc sudah di buat
		}
	}

	void TampilArray() {
		System.out.println("Menampilkan isi/element array");
		for (int i=0; i<N;i++) {
			System.out.println("Data ke "+i+" adalah "+A[i]);
		}
	}
	
	
	void BubbleSort(int kodeurut) {
		int temp;
		
		for(int tahap=1; tahap<=N-1; tahap++) {
			for(int i=0; i<=N-tahap-1;i++) {
				if(kodeurut==1) {
//					mengurut membesar
					if(A[i]>A[i+1]) {
						temp=A[i];
						A[i]=A[i+1];
						A[i+1]=temp;
					}
				}else {
//					mengurut mengecil
					if(A[i]<A[i+1]) {
						temp=A[i];
						A[i]=A[i+1];
						A[i+1]=temp;
					}
				}
				
	
			}
		}
	}

	
	void BubbleSortMembesar() {
		int temp;
		
		for(int tahap=1; tahap<=N-1; tahap++) {
			for(int i=0; i<=N-tahap-1;i++) {
				if(A[i]>A[i+1]) {
					temp=A[i];
					A[i]=A[i+1];
					A[i+1]=temp;
				}
			}
		}
	}
	
	void BubbleSortMengecil() {
		int temp;
		
		for(int tahap=1; tahap<=N-1; tahap++) {
			for(int i=0; i<=N-tahap-1;i++) {
				if(A[i]<A[i+1]) {
					temp=A[i];
					A[i]=A[i+1];
					A[i+1]=temp;
				}
			}
		}
	}
	
	
//	terurut membesar
	void BubbleSort2() {
		int tahap=1, temp;
		Boolean tukar;
		
		
		do {
			System.out.println("Tahap ke" +tahap);
			tukar=false;
			for(int i=0; i<=N-tahap-1;i++) {
				if(A[i]>A[i+1]) {
					tukar=true;
					temp=A[i];
					A[i]=A[i+1];
					A[i+1]=temp;
				}
			}
			tahap++;
		}while(tahap<=N-1 && tukar==true);

	}
	
//	isi eksekusi
	public static void main(String[] args) {
		BubbleSort A=new BubbleSort(); // manggil class
		Scanner sc = new Scanner(System.in); // supaya bisa di inputkan
//	memanggil semua function dengan urutannya
		A.InitArray();
		A.InputArray();
		A.TampilArray();
		
//		int x;
//		do {
//			System.out.print("1(membesar)/2(mengecil)/0(stop):");x=sc.nextInt(); // tambahkan ini bila Scanner sc sudah di buat
//			A.BubbleSort(x);
//			A.TampilArray();
//		}while(x!=0);
		
		A.BubbleSort2();
		A.TampilArray();

	}
}
