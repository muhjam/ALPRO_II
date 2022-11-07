package quiz01;

import java.util.Scanner;

public class LarikKaryawan {
	int N=20;
	Karyawan []L=new Karyawan[N];

	void InitArray() {
		Karyawan R=new Karyawan();
		
		System.out.println("Inisialisasi array");
		for (int i=0; i<N;i++) {
			R.NIK="0";
			R.Nama="$";
			R.Golongan='z';
			R.Gaji=0;
			L[i]=R;
		}
	}

	void InputDataArray() {	
		Karyawan R=new Karyawan();
		System.out.println("Menginput element-element array");
		Scanner sc = new Scanner(System.in); // supaya bisa di inputkan
		for (int i=0; i<N;i++) {
			R=new Karyawan(); // record tersebut harus disimpan dimemory
			R.InputData();
			L[i]=R;
		}
	}

	void OutputDataArray() {
		System.out.println("");
		System.out.println("Menampilkan isi/element array");
		for (int i=0; i<N;i++) {
			System.out.print("Data ke "+i+" adalah ");
			L[i].OutputData();
		}
	}     
     
	
//	Main Program dibawah ini
	public static void main(String[] args) {
		LarikKaryawan Nas=new LarikKaryawan();
		Scanner sc = new Scanner(System.in);
		
		Nas.InitArray();
		Nas.InputDataArray();
		Nas.OutputDataArray();
		
	}	
}
