package Sorting;

import java.util.Scanner;

public class AllSort{
	Scanner sc = new Scanner(System.in); // supaya bisa di inputkan
//	membuat function
	int N=Jumlah();
	int []A=new int[N]; 
	
	int Jumlah() {
		System.out.print("Jumlah Data: ");int N=sc.nextInt(); 
		return N;
	}
	
	void InitArray() {
		System.out.println("Inisialisasi array");
		for (int i=0; i<N;i++) {
			A[i]=0;
		}
	}

	void InputArray() {
		System.out.println("Menginput element-element array");
		
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
	
	void InsertionSort() {
		   int tahap, temp, i;
		    for (tahap = 1; tahap <= N-1; tahap++)
		    {
		        temp = A[tahap];
		        i = tahap - 1;
		 
		        while (i >= 0 && A[i] > temp)
		        {
		            A[i + 1] = A[i];
		            i--;
		        }
		        A[i + 1] = temp;
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
	
	void Sorting(int x) {
		if(x==1) {
			MaximumSort();
		}else {
			MinimumSort();
		}
	}
	
	void Peringkat(int x) {
		int y;
		do {
			System.out.print("Dari(1-"+N+"):");y=sc.nextInt();
		}while(y>N);
		if(x==1) {
			for (int i=0; i<y;i++) {
				System.out.println("Data ke "+i+" adalah "+A[i]);
			}
		}else {
			for (int i=N-y; i<N;i++) {
				System.out.println("Data ke "+i+" adalah "+A[i]);
			}
		}
	}
//	isi eksekusi
	public static void main(String[] args) {
		AllSort A=new AllSort(); // manggil class
		Scanner sc = new Scanner(System.in); // supaya bisa di inputkan
//	memanggil semua function dengan urutannya
		A.InitArray();
		A.InputArray();
		A.TampilArray();
		int x;
		do {
			System.out.print("1.Membesar/2.mengecil/0.stop: ");x=sc.nextInt(); // tambahkan ini bila Scanner sc sudah di buat
			A.Sorting(x);
			A.TampilArray();
			System.out.print("1.Top/2.Bottom: ");x=sc.nextInt(); // tambahkan ini bila Scanner sc sudah di buat
			A.Peringkat(x);
		}while(x!=0);
		A.TampilArray();
	}
}
