package Searching;

import java.util.Scanner;

public class SequensialSearch {
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
	
	void InputArrayManual() {
		a[0]=15;
		a[1]=13;
		a[2]=11;
		a[3]=9;
		a[4]=7;
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
	
	int SeqSearch(int x) {
	 int i=0;
	 
	 while((i<N-1)&&(a[i]>x)) {
	 		i++;
	 }
	 
	 if(a[i]==x) {
		 return i;
	 }else {
		 return -1;
	 }
	}
	
	
//	isi eksekusi
	public static void main(String[] args) {
		SequensialSearch A=new SequensialSearch(); // manggil class
		Scanner sc = new Scanner(System.in); // supaya bisa di inputkan
//	memanggil semua function dengan urutannya
		A.InitArray();
		A.InputArrayManual();
		A.TampilArray();
		
		System.out.print("Mencari index dengan value :");int k=sc.nextInt();
		if(A.SeqSearch(k)>=0) {
		System.out.println("Value "+ k +" berada pada index ke: " + A.SeqSearch(k));
		}else{
			System.out.println("Value X "+ k +" yang anda cari tidak ada");
		}
		
	}

}
