package Nasabah;


import java.util.Scanner;

// ingat kalo java arsip di record itu harus ada implements java.io.Serializable
class Nasabah implements java.io.Serializable {
	String norek,nama,pin;
	float saldo;
	
	Nasabah(){
		
	}
	
	Nasabah(String no, String nm, String pn, float uang ){
		norek=no;
		pin=pn;
		nama=nm;
		saldo=uang;
		
	}
	
	void BacaNasabah() {
		System.out.println("Baca nilai setiap elemen array dari keyboard");
		Scanner sc= new Scanner(System.in);
		
		System.out.print("norek  "); norek=sc.next();
		System.out.print("nama  "); nama=sc.next();
		System.out.print("pin  "); pin=sc.next();
		System.out.print("saldo ");saldo=sc.nextFloat();
	}
	
	void TulisNasabah() {
		System.out.println("Datanya "+": "+norek+
				", "+nama+", "+saldo);
	}
	
	String getNorek(){
		return norek;	
	}
	
	String getPin(){
		return pin;	
	}
	
	String getNama(){
		return nama;	
	}
	
	Float getSaldo(){
		return saldo;	
	}
	
	
	 public static void main(String[] args) {
		 Nasabah M=new Nasabah();
		 
		 M.BacaNasabah();
		 M.TulisNasabah();
		 
		 
	 }

}

