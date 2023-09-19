package NilaiMahasiswa;

import java.util.Scanner;

public class CMPK {

	double CMPK1;
	double CMPK2;
	double CMPK3;
	double CMPK4;
	double CMPK5;
	double CMPK6;
	double CMPK7;
	double NA=0;

	void BacaMahasiswa() {
		Scanner sc= new Scanner (System.in);
		System.out.println("");

		System.out.print("CMPK1: ");CMPK1=sc.nextDouble();
		System.out.print("CMPK2: ");CMPK2=sc.nextDouble();
		System.out.print("CMPK3: ");CMPK3=sc.nextDouble();
		System.out.print("CMPK4: ");CMPK4=sc.nextDouble();
		System.out.print("CMPK5: ");CMPK5=sc.nextDouble();
		System.out.print("CMPK6: ");CMPK6=sc.nextDouble();
		System.out.print("CMPK7: ");CMPK7=sc.nextDouble();
		
		NA= 0.20*CMPK1 + 0.15*CMPK2 + 0.15*CMPK3 + 0.15*CMPK4 + 0.15*CMPK5 + 0.10*CMPK6+ 0.10*CMPK7;
	}	
		
	void TulisMahasiswa() {
		System.out.print(NA);
	}
	
	
	
//	Main Program dibawah ini
	public static void main(String[] args) {
	CMPK M=new CMPK();
	M.BacaMahasiswa();
	M.TulisMahasiswa();
	}
			
}
	
	

