package DataTerstruktur;

import java.util.Scanner;

public class TabMhs {
	int N=3;
	Mahasiswa []A=new Mahasiswa[N];

	void InitArray() {
		Mahasiswa R=new Mahasiswa();
		
		System.out.println("Inisialisasi array");
		for (int i=0; i<N;i++) {
			R.NIM="0";
			R.Nama="$";
			R.IPK=4;
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
			A[i]=R;
		}
	}

	void TampilArray() {
		System.out.println("Menampilkan isi/element array");
		for (int i=0; i<N;i++) {
			
//			System.out.println("Data ke "+i+" adalah "+A[i].NIM+","+A[i].Nama+","+A[i].IPK);
			System.out.println("Data ke "+i+" adalah ");
			A[i].TulisMahasiswa();
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
	Mahasiswa GetElemen(int i) {
		return A[i];
	}
	
	void SetElemen(int i) {
		Scanner sc = new Scanner(System.in); // supaya bisa di inputkan
		System.out.print("Data index ke-"+i+":");A[i].BacaMahasiswa(); // dapet dari file mahasiswa
	}
	
//	Main Program dibawah ini
	public static void main(String[] args) {
		TabMhs Mhs=new TabMhs();
		Scanner sc = new Scanner(System.in);
		
		Mhs.InitArray();
		Mhs.TampilArray();
		Mhs.InputArray();
		Mhs.TampilArray();
		System.out.print("Cari NIM bernilai : ");
		String x=sc.next();
		int k = 0;
		k = Mhs.CariElement(x);
		if(k!=-1) {
			System.out.println("Nilai "+ x + " ketemu diindex ke: "+k);
			Mahasiswa R= new Mahasiswa();
			R=Mhs.GetElemen(k); R.TulisMahasiswa();
		}else {
			System.out.print("Nilai "+ x + " tidak ada didalam larik");
		}
	}
			
			
}
