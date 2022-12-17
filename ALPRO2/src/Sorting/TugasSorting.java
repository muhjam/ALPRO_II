package Sorting;

import java.util.Scanner;

public class TugasSorting {
//	membuat function
	
	int Data() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Jumlah data: ");int x=sc.nextInt();
		return x;
	}
	
	int N=	Data();
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
	

	void MaximumSort() {
		int temp, imax;
		
		for(int tahap=1;tahap<=N-1;tahap++) {
			imax=0;
			for(int i=1;i<=N-tahap;i++) {
				if(A[i]>A[imax]) {
					imax=i;					
				}
			}
			temp=A[imax];
			A[imax]=A[N-tahap];
			A[N-tahap]=temp;
		}
	}
	
	void MinimumSort() {
		int temp, imin;
		
		for(int tahap=1;tahap<=N-1;tahap++) {
			imin=0;
			for(int i=1;i<=N-tahap;i++) {
				if(A[i]<A[imin]) {
					imin=i;					
				}
			}
			temp=A[imin];
			A[imin]=A[N-tahap];
			A[N-tahap]=temp;
		}
	}
	
	void RangeArray() {
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("Menampilakan data teratas/terbawah ");
		System.out.print("1(Top)/2(Bottom): ");x=sc.nextInt();
		
		if(x==1) {
			do {
				System.out.print("Top berapa (1-"+N+"): ");y=sc.nextInt();
			}while(y>N || y<=0);
		
			System.out.println("Menampilkan data dari Top "+y+": ");
			for (int i=0; i<y;i++) {
				System.out.println("Data ke "+i+" adalah "+A[i]);
			}
		}else {
			do {
				System.out.print("Bottom berapa (1-"+N+"): ");y=sc.nextInt();
			}while(y>N || y<=0);
			System.out.println("Menampilkan data dari Bottom "+y+": ");
			for (int i=N-y; i<N;i++) {
				System.out.println("Data ke "+i+" adalah "+A[i]);
			}
		}
	}
	
//	isi eksekusi
	public static void main(String[] args) {
		TugasSorting A=new TugasSorting(); // manggil class
		Scanner sc = new Scanner(System.in); // supaya bisa di inputkan
//	memanggil semua function dengan urutannya
		A.InitArray();
		A.InputArray();
		A.TampilArray();
		
		int x;
		do {
			System.out.println("");
			System.out.print("1(membesar)/2(mengecil)/0(stop):");x=sc.nextInt(); // tambahkan ini bila Scanner sc sudah di buat
	
			if(x==1) {
				A.MaximumSort();
			}else{
				A.MinimumSort();
			}
			A.TampilArray();
			A.RangeArray();
		}while(x!=0);	
		System.out.print("Selesai");

	}
}
