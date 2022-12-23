package NilaiMahasiswa;

import java.util.Scanner;

import NasabahArray2.Nasabah;

public class TabMhs {
	int N=3;
	Mahasiswa []A=new Mahasiswa[N];

	void InitArray() {
		Mahasiswa R=new Mahasiswa();
		
		System.out.println("Inisialisasi array");
		for (int i=0; i<N;i++) {
			R.NIM="0";
			R.Nama="$";
			R.UTS=0;
			R.UAS=0;
			R.Tugas=0;
			R.Kehadiran=0;
			R.NA=0;
			R.Index=0;
			A[i]=R;
		}
	}

	void InputArray() {	
		Mahasiswa R=new Mahasiswa();
		System.out.println("Menginput element-element array");
		Scanner sc = new Scanner(System.in); // supaya bisa di inputkan
		for (int i=0; i<N;i++) {
			R=new Mahasiswa(); // record tersebut harus disimpan dimemory
//			System.out.print("NIM ke-"+i+":");R.NIM=sc.next();
//			System.out.print("Nama ke-"+i+":");R.Nama=sc.next();
//			System.out.print("Data ke-"+i+":");R.IPK=sc.nextFloat();
			R.BacaMahasiswa();
			A[i]=R; // menyimpan
		}
	}

	void TampilArray() {
		System.out.println("Menampilkan isi/element array");
		for (int i=0; i<N;i++) {
//			if(A[i].IPK < 2) {
//			System.out.println("Data ke "+i+" adalah "+A[i].NIM+","+A[i].Nama+","+A[i].IPK);
			System.out.println("");
			System.out.println("Data untuk ke- "+i);
			System.out.println("NIM (string): " + A[i].NIM);
			System.out.println("Nama (string): "+A[i].Nama);
			System.out.println("UTS (real): "+ A[i].UTS);
			System.out.println("UAS (real): "+ A[i].UAS);
			System.out.println("Tugas (real): "+ A[i].Tugas);
			System.out.println("Kehadiran (real): "+ A[i].Kehadiran);
			System.out.println("Nilai Akhir (real): "+ A[i].NA);
			System.out.println("Index (char): "+ A[i].Index);
//}
		}
	}

	int CariElement(String x) {
		int index=-1;
	       for (int i = 0; i < N; i++)
	       {
	        if(A[i].NIM.equals(x)==true) {
	    		index= i;
	        }
	       }
	       return index;
	}
	

	

	
//	tipe recordnya TabMahasiswa  
	Mahasiswa GetElement(int i) {
		return A[i];
	}
	
	void SetElement(int i) {
		Scanner sc = new Scanner(System.in); // supaya bisa di inputkan
		System.out.print("Data index ke-"+i+":");A[i].BacaMahasiswa(); // dapet dari file mahasiswa
	}
	

	

	
//	Main Program dibawah ini
	public static void main(String[] args) {
		TabMhs Mhs=new TabMhs();
		Scanner sc = new Scanner(System.in);
		
		Mhs.InitArray();
		Mhs.InputArray();
		Mhs.TampilArray();

		
	}
			
}
