package NilaiMahasiswa;

import java.util.Scanner;

public class Mahasiswa {
	String NIM;
	String Nama;
	double UTS;
	double UAS;
	double Tugas;
	int Kehadiran;
	double NA;
	char Index;

	void BacaMahasiswa() {
		Scanner sc= new Scanner (System.in);
		System.out.println("");
		System.out.print("NIM (string): ");NIM=sc.next();
		System.out.print("Nama (string): ");Nama=sc.next();
		System.out.print("UTS (real): ");UTS=sc.nextFloat();
		System.out.print("UAS (real): ");UAS=sc.nextFloat();
		System.out.print("Tugas (real): ");Tugas=sc.nextFloat();
		System.out.print("Kehadiran (real): ");Kehadiran=sc.nextInt();
		
		NA= 0.35*UTS + 0.35*UAS + 0.2*Tugas + 0.1*(100*Kehadiran/14);
		
		if(Kehadiran > 10) {
			if(NA>=85) {
				Index='A';
				}else if(NA >=70) {
						Index='B';
						}else if(NA >= 55) {
								Index='C';
								}else if(NA >=40) {
									Index='D';
									}else {
											Index='E';
			}
		
		
	}else {
		Index='E';
	}
		
	}

	void TulisMahasiswa() {
		System.out.print("("+NIM+", "+Nama+", "+UTS+", "+UAS+", "+Tugas+". "+Kehadiran+")");
	}
	
	
	
//	Main Program dibawah ini
	public static void main(String[] args) {
	Mahasiswa M=new Mahasiswa();
	M.BacaMahasiswa();
	M.TulisMahasiswa();
	}
			
}
	
	

