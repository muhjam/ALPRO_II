package DataTerstruktur;

import java.util.Scanner;

public class TabMhs {
	int n=3;
	Mahasiswa []a=new Mahasiswa[n];

	void InitArray() {
		Mahasiswa R=new Mahasiswa();
		
		System.out.println("Inisialisasi array");
		for (int i=0; i<n;i++) {
			R.NIM="0";
			R.Nama="$";
			R.IPK=4;
			a[i]=R;
		}
	}

	void InputArray() {	
		Mahasiswa R=new Mahasiswa();
		System.out.println("Menginput element-element array");
		Scanner sc = new Scanner(System.in); // supaya bisa di inputkan
		for (int i=0; i<n;i++) {
			R=new Mahasiswa(); 
			System.out.print("NIM ke-"+i+":");R.NIM=sc.next();
			System.out.print("Nama ke-"+i+":");R.Nama=sc.next();
			System.out.print("Data ke-"+i+":");R.IPK=sc.nextFloat();
			a[i]=R;
		}
	}

	void TampilArray() {
		System.out.println("Menampilkan isi/element array");
		for (int i=0; i<n;i++) {
			System.out.println("Data ke "+i+" adalah "+a[i].NIM+","+a[i].Nama+","+a[i].IPK);
		}
	}

	
//	Main Program dibawah ini
	public static void main(String[] args) {
		TabMhs Mhs=new TabMhs();
		
		Mhs.InitArray();
		Mhs.TampilArray();
		Mhs.InputArray();
		Mhs.TampilArray();
	}
			
			
}
