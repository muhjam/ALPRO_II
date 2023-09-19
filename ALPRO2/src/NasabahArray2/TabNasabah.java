package NasabahArray2;

import java.util.Scanner;
import java.time.LocalDateTime;  // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;  // Import the 

public class TabNasabah {
	int N=3;
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
			System.out.println("");
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
	
     boolean Login1() {
    	Boolean login = false;
		int i=0;
		int coba=0;
		
		System.out.println("Login!");
		Scanner sc= new Scanner(System.in);
		System.out.print("NoRek anda :");String id=sc.next();
		System.out.print("Password anda :");String pass=sc.next();
			
		while((i<N-1)&&(!A[i].NoRek.contentEquals(id))){
				i++;
		}
			
		if(A[i].NoRek.equals(id)) {
				
			while(coba<4) {
				if(A[i].Password.equals(pass)){
				   System.out.println("");
				   System.out.println("Selamat Datang "+A[i].Nama);
				   System.out.println("");
				   A[i].TampilNasabah();
				   login=true;
				   break;
				 }else if(!A[i].Password.equals(pass)&&coba<3){
						  System.out.println("");
						  System.out.println("Password yang anda inputkan salah");
					      System.out.println("Sisa percobaan "+(3-coba)+"x lagi");
						  System.out.print("Password anda :");pass=sc.next();
						  coba++;
				 		}else{
				 		      System.out.println("");
					          System.out.println("Kartu Anda Tertelan");
					          break;
				 			 }
			}
		
		}else{
		      System.out.println("Maaf, NoRek anda tidak terdaftar");
		}
			
		return login;
	}
     
     
//     AWAL LOGIN
     int Login() {
		int i=0;
		int coba=0;
		
		System.out.println("Login!");
		Scanner sc= new Scanner(System.in);
		System.out.print("NoRek anda :");String id=sc.next();
		System.out.print("Password anda :");String pass=sc.next();
			
		while((i<N-1)&&(!A[i].NoRek.contentEquals(id))){
				i++;
		}
			
		if(A[i].NoRek.equals(id)) {
				
			while(coba<4) {
				if(A[i].Password.equals(pass)){
				   System.out.println("");
				   System.out.println("Selamat Datang "+A[i].Nama);
				   System.out.println("");
				   A[i].TampilNasabah();
				   break;
				 }else if(!A[i].Password.equals(pass)&&coba<3){
						  System.out.println("");
						  System.out.println("Password yang anda inputkan salah");
					      System.out.println("Sisa percobaan "+(3-coba)+"x lagi");
						  System.out.print("Password anda :");pass=sc.next();
						  coba++;
				 		}else{
				 		      System.out.println("");
					          System.out.println("Kartu Anda Tertelan");
					          return i=-1;
				 			 }
			}
		
		}else{
		      System.out.println("Maaf, NoRek anda tidak terdaftar");
		      return i=-1;
		}
			
		return i;
	}
	
	
     
     void IsiSaldo(int i) {
 		Scanner sc= new Scanner(System.in);
    	System.out.print("Nominal: ");float saldo=sc.nextFloat();
 
    	saldo= A[i].Saldo + saldo;
    	A[i].SaldoNasabah(saldo);
     }
     
     void TarikSaldo(int i) {
    	Scanner sc= new Scanner(System.in);
    	int a=0;
    	while(a==0) {
	       	System.out.print("Nominal (min 50k): ");float tarik=sc.nextFloat();
	    	if(tarik >= 50000) {
    			float saldo= A[i].Saldo - tarik;
	    		if(saldo>=0) {
	    			System.out.println("Uang anda sudah ditarik senilai Rp."+tarik);
	    			A[i].SaldoNasabah(saldo);
		    		break;
	    		}else {
	    			System.out.println("Maaf saldo anda tidak cukup!");
	    			break;
	    		}
	   		}else{
	    			System.out.println("Minimal tarik saldo diatas Rp.50.000");
	    			continue;
	   		}
		
    	}
     }
//  
     float TransferSaldo(int index, int i) {
    	Scanner sc= new Scanner(System.in);
    	float x=-1;
    	int a=0;
    	while(a==0) {
	       	System.out.print("Nominal (min 10k): ");float transfer=sc.nextFloat();
	    	if(transfer >= 10000) {
    			float saldo= A[i].Saldo - transfer;
	    		if(saldo>=0) {
	    			System.out.println("Uang anda berhasil ditransfer senilai Rp."+transfer+" kepada "+A[index].Nama);
	    			A[i].SaldoNasabah(saldo);
	    			return transfer;
	    		}else {
	    			System.out.println("Maaf saldo anda tidak cukup!");
	    			break;
	    		}
	   		}else{
	    			System.out.println("Minimal transfer saldo Rp.10.000");
	    			continue;
	   		}
    	}
		return x;
     }
     

     
     void TeransferBerhasil(float x, int i) {
    	float saldo=x;
    	saldo= A[i].Saldo + saldo;
    	A[i].SaldoNasabah(saldo);
     }
     
     
     void CekSaldo(int i) {
    	A[i].CekSaldo();
     }
     	
  
     
//	Main Program dibawah ini
	public static void main(String[] args) {
		TabNasabah Nas=new TabNasabah();
		Scanner sc = new Scanner(System.in);
		
		Nas.InitArray();
		Nas.TampilArray();
		Nas.InputArray();
		
//		login
		int a=0;
		while(a==0){
			System.out.println("");
			int login = Nas.Login();
			while(login>-1) {
				int i=login;
				System.out.println("");
				System.out.println("Ketik:");
				System.out.println("1. Mengisi Saldo");
				System.out.println("2. Tarik Saldo");
				System.out.println("3. Cek Saldo");
				System.out.println("4. Transfer Saldo");
				System.out.println("5. Logout Saldo");
				System.out.print("Lakukan: ");int z=sc.nextInt();
			
				if(z==1) {
					Nas.GetElement(i);
					Nas.IsiSaldo(i);
					Nas.CekSaldo(i);
					continue;
				}
				
				if(z==2) {
					Nas.GetElement(i);
					Nasabah R= new Nasabah(); // disimpan dahulu
					R=Nas.GetElement(i);
					Nas.TarikSaldo(i);
					Nas.CekSaldo(i);
					continue;
				}
			
				if(z==3) {
					Nas.CekSaldo(i);
					continue;
				}
				
				if(z==4) {
					int loop=0;
					while(loop==0) {
						System.out.print("NoRek Tujuan: ");String rek=sc.next();
					  	int index = Nas.CariElement(rek);
					  	if(index != -1) {
						Nas.TeransferBerhasil(Nas.TransferSaldo(index, i), index);
						Nas.CekSaldo(i);
						break;
						}else {
						  	System.out.println("NoRek yang anda tuju tidak ada!");
						  	System.out.print("1.ulang/2.exit: ");int x=sc.nextInt();
							System.out.println("");
							if(x==1) {
								continue;
						  	}else {
						  		loop=1;
						  		break;
						  	}
						}
					}
				  	
					continue;
				}
				
				
				if(z==5) {
					System.out.println("Logout");
					login=-1;
					continue;
				}

			}
		}
			
	}
}
