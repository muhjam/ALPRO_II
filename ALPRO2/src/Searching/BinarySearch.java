package Searching;

import java.util.Scanner;

public class BinarySearch {
//	membuat function
	int N=6;
	int []a=new int[N]; // membuat array
	
	void InitArray() {
		a[0]=5;
		a[1]=8;
		a[2]=10;
		a[3]=13;
		a[4]=26;
		a[5]=30;
	}


	void TampilArray() {
		System.out.println("Menampilkan isi/element array");
		for (int i=0; i<N;i++) {
			System.out.println("Data ke "+(i)+" adalah "+a[i]);
		}
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
	
	int BinarySearch(int x) {
	 int ia, ik, it;
	 Boolean ketemu = false;
	 ia=0;
	 ik=N-1;
	 it=0;
	 
	 while((ia<=ik)&&(!ketemu)) {
		   it=(ia+ik) / 2;
		   if(a[it]==x) {
			ketemu=true;
		   }else if(a[it]<x) {
		 	 	    ia=it+1;	// geser kanan
			     }else {
				     	ik=it-1;	// geser kiri
			     }
	 }
	 
	 if(ketemu) {
		 return it;
	 }else {
		 return -1;
	 }
	}
	
//	isi eksekusi
	public static void main(String[] args) {
		BinarySearch A=new BinarySearch(); // manggil class
		Scanner sc = new Scanner(System.in); // supaya bisa di inputkan
//	memanggil semua function dengan urutannya
		A.InitArray();
		A.TampilArray();
		
		System.out.print("Mencari index dengan value :");int k=sc.nextInt();
		if(A.BinarySearch(k)>=0) {
		System.out.println("Value "+ k +" berada pada index ke: " + A.BinarySearch(k));
		}else{
			System.out.println("Value X "+ k +" yang anda cari tidak ada");
		}
		
	}

}
