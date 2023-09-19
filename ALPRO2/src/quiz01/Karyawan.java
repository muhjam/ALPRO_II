package quiz01;

import java.util.Scanner;

public class Karyawan {
	String NIK, Nama;
	char Golongan;
	float Gaji;

	void InputData() {
		Scanner sc= new Scanner (System.in);
		
		System.out.print("NIK (String): ");NIK=sc.next();
		System.out.print("Nama (String): ");Nama=sc.next();
		System.out.print("Golongan (Char): ");Golongan=sc.next().charAt(0);
		System.out.print("Gaji (Real): ");Gaji=sc.nextFloat();
	}

	void OutputData() {
		System.out.println("("+NIK+", "+Nama+", "+Golongan+","+Gaji+")");
	}
	
//	Main Program dibawah ini
	public static void main(String[] args) {
	Karyawan K=new Karyawan();
	K.InputData();
	K.OutputData();
	}
			
}
	
	

