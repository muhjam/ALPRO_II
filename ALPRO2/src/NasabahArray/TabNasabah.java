package NasabahArray;

import java.util.Scanner;

public class TabNasabah {
	int N=1;
	Nasabah []A=new Nasabah[N];

	void InitArray() {
		Nasabah R=new Nasabah();
		
		System.out.println("Inisialisasi array");
		for (int i=0; i<N;i++) {
			R.NoRek="0";
			R.Nama="$";
			R.Saldo=4;
			R.Password="xxx";
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
		System.out.println("");
		System.out.println("Menampilkan isi/element array");
		for (int i=0; i<N;i++) {
			System.out.print("Data ke "+i+" adalah ");
			A[i].TulisNasabah();
		}
	}

	int CariElement(String x) {
		int index=-1;
	       for (int i = 0; i < N; i++){
	    	    if(A[i].NoRek.equals(x)==true) {
	    		index= i;
	    	    }
	       }
	       return index;
	}
	
//	tipe recordnya TabMahasiswa  
	Nasabah GetElement(int i) {
		return A[i];
	}
	
	void SetElement(int i) {
		Scanner sc = new Scanner(System.in); // supaya bisa di inputkan
		System.out.println("Input data index ke-"+i+":");A[i].BacaNasabah(); // dapet dari file mahasiswa
	}
	

//     boolean Login() {
//    	 Boolean login = false;
//		int i=0;
//		int coba=0;
//		
//		System.out.println("Login!");
//		Scanner sc= new Scanner(System.in);
//		System.out.print("NoRek anda :");String id=sc.next();
//		System.out.print("Password anda :");String pass=sc.next();
//			
//		while((i<N-1)&&(!A[i].NoRek.contentEquals(id))){
//				i++;
//		}
//			
//		if(A[i].NoRek.equals(id)) {
//				
//			while(coba<4) {
//				if(A[i].Password.equals(pass)){
//				   System.out.println("");
//				   System.out.println("Selamat Datang "+A[i].Nama);
//				   System.out.println("");
//				   A[i].TampilNasabah();
//				   login=true;
//				   break;
//				 }else if(!A[i].Password.equals(pass)&&coba<3){
//						  System.out.println("");
//						  System.out.println("Password yang anda inputkan salah");
//					      System.out.println("Sisa percobaan "+(3-coba)+"x lagi");
//						  System.out.print("Password anda :");pass=sc.next();
//						  coba++;
//				 		}else{
//				 		      System.out.println("");
//					          System.out.println("Kartu Anda Tertelan");
//					          login=false;
//					          break;
//				 			 }
//			}
//		
//		}else{
//		      System.out.println("Maaf, NoRek anda tidak terdaftar");
//		      return login;
//		}
//			
//		return login;
//	}
	
     
     
     
	
//	Main Program dibawah ini
	public static void main(String[] args) {
		TabNasabah Nas=new TabNasabah();
		Scanner sc = new Scanner(System.in);
		
		Nas.InitArray();
		Nas.TampilArray();
		Nas.InputArray();
		
//		looping
		for(int i=0;i == 0;) {
//			menentukan perintah
			System.out.print("Command (1=mencari, 2=mengubah, 3=a-z, 4=z-a) : ");
			int z=sc.nextInt();
			System.out.println("");
			
//			mencari
		if(z==1) {			
		Nas.TampilArray();
		System.out.println("");
		System.out.print("Cari NoRek bernilai : ");
		String x=sc.next();
		int k = 0;
		k = Nas.CariElement(x);
		if(k!=-1) {
			System.out.println("NoRek "+ x + " ke temu di index ke: "+k);
			Nasabah R= new Nasabah();
			R=Nas.GetElement(k); R.TulisNasabah();
		}else {
			System.out.print("NoRek "+ x + " tidak ada di dalam larik");
		}
		System.out.println("");
		z=0;
		}
		
//			mengubah
		if(z==2) {
		int k = 0;
		System.out.print("Mengubah data index ke : ");
//		int k=sc.nextInt(); //ga dipake
//		Nas.GetElement(k);
//		Nas.SetElement(k);
//		Nas.TampilArray();
		Nasabah R= new Nasabah(); // disimpan dahulu
		R=Nas.GetElement(k); R.TulisNasabah();
		Nas.SetElement(k); Nas.TampilArray();
		z=0;
		}	
	}
		
//		login
//		System.out.println("");
//		if(Nas.Login()==false) {
//			System.out.println("");
//			Nas.Login();
//		}else{
//			System.out.println("Ketik:");
//			System.out.println("1. Mengisi Saldo");
//			System.out.println("2. Tarik Saldo");
//			System.out.println("3. Cek Saldo");
//			System.out.println("4. Logout Saldo");
//			System.out.print("Lakukan: ");int z=sc.nextInt();
//		}	
	}	
}
