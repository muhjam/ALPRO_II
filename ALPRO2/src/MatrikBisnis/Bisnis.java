package MatrikBisnis;

import java.util.Scanner;

public class Bisnis {
	String Kode, Nama;
	int Jenis;
	Boolean Status;

	void InputBisnis() {
		Scanner sc= new Scanner (System.in);
		
		System.out.print("Kode (string): ");Kode=sc.next();
		System.out.print("Nama (string): ");Nama=sc.next();
		
		do {
				System.out.println("Jenis Bisnis");
				System.out.println("1. Bengkel, 2. Kafe, 3. Petshop, 4. Resto, 5. TokoSembako");
				System.out.print("Masukan Jenis Usaha (1/2/3/4/5): ");Jenis=sc.nextInt();
		}while(Jenis<1 || Jenis >5);
		
		Status=true;
	}

	
	void OutputBisnis() {
		System.out.println("Kode	: "+Kode);
		System.out.println("Nama	: "+Nama);
		

			switch(Jenis) {
				case 1: System.out.println("Jenis	: Bengkel");
						break;
				case 2: System.out.println("Jenis	: Kafe");
						break;
				case 3: System.out.println("Jenis	: Pets");
						break;
				case 4: System.out.println("Jenis	: Resto");
						break;
				case 5: System.out.println("Jenis	: Toko Sembako");
						break;
			}

		if(Status==true) {
			System.out.println("Status	: Buka");
		}else {
			System.out.println("Status	: Tutup");
		}
	}

	
//	Main Program dibawah ini
	public static void main(String[] args) {
	Bisnis S=new Bisnis();
	S.InputBisnis();
	S.OutputBisnis();
	}
			
}
	
	

