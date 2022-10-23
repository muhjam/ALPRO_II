package DataTerstruktur;

import java.util.Scanner;

public class Mahasiswa {
	String NIM;
	String Nama;
	float IPK;

	void BacaMahasiswa() {
		Scanner sc= new Scanner (System.in);
		
		System.out.print("NIM (string): ");NIM=sc.next();
		System.out.print("Nama (string): ");Nama=sc.next();
		System.out.print("IPK (real): ");IPK=sc.nextFloat();
	}
	
	void BacaIpk() {
		Scanner sc= new Scanner (System.in);
		
		System.out.print("IPK (real): ");IPK=sc.nextFloat();
	}

	void TulisMahasiswa() {
		System.out.print("("+NIM+", "+Nama+", "+IPK+")");
	}
	
	
	
//	Main Program dibawah ini
	public static void main(String[] args) {
	Mahasiswa M=new Mahasiswa();
	M.BacaMahasiswa();
	M.TulisMahasiswa();
	}
			
}
	
	

