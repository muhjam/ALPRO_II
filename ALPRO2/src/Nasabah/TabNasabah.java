package Nasabah;

import java.util.Scanner;

public class TabNasabah {
	int N=3;
	Nasabah []A=new Nasabah[N];

	void InitArray() {
		Nasabah R=new Nasabah();
		
		System.out.println("Inisialisasi array");
		for (int i=0; i<N;i++) {
			R.NoRek="0";
			R.Nama="$";
			R.Saldo=4;
			A[i]=R;
		}
	}

	void InputArray() {	
		Nasabah R=new Nasabah();
		System.out.println("Menginput element-element array");
		Scanner sc = new Scanner(System.in); // supaya bisa di inputkan
		for (int i=0; i<N;i++) {
			R=new Nasabah(); // record tersebut harus disimpan dimemory
			R.BacaNasabah();
			A[i]=R;
		}
	}

	void TampilArray() {
		System.out.println("Menampilkan isi/element array");
		for (int i=0; i<N;i++) {
//			System.out.println("Data ke "+i+" adalah "+A[i].NIM+","+A[i].Nama+","+A[i].IPK);
			System.out.print("Data ke "+i+" adalah ");
			A[i].TulisNasabah();
		}
	}

	int CariElement(String x) {
		int index=-1;
	       for (int i = 0; i < N; i++)
	       {
	        if(A[i].NoRek.equals(x)==true) {
	    		index= i;
	        }
	       }
	       return index;
	}
	
//	tipe recordnya TabMahasiswa  
	Nasabah GetElemen(int i) {
		return A[i];
	}
	
	void SetElemen(int i) {
		Scanner sc = new Scanner(System.in); // supaya bisa di inputkan
		System.out.print("Data index ke-"+i+":");A[i].BacaNasabah(); // dapet dari file mahasiswa
	}
	
//	Main Program dibawah ini
	public static void main(String[] args) {
		TabNasabah Nas=new TabNasabah();
		Scanner sc = new Scanner(System.in);
		
		Nas.InitArray();
		Nas.TampilArray();
		Nas.InputArray();
		Nas.TampilArray();
		System.out.println("");
		System.out.print("Cari NoRek bernilai : ");
		String x=sc.next();
		int k = 0;
		k = Nas.CariElement(x);
		if(k!=-1) {
			System.out.println("NoRek "+ x + " ke temu di index ke: "+k);
			Nasabah R= new Nasabah();
			R=Nas.GetElemen(k); R.TulisNasabah();
		}else {
			System.out.print("NoRek "+ x + " tidak ada ddalam larik");
		}
	}
			
			
}
