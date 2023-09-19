package Nasabah;


import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import Nasabah.Nasabah;

public class Functions {
	    Scanner sc = new Scanner(System.in);
	    
	     // LOGIN
	    public String Login(){
			Nasabah R = new Nasabah();
			String norek, pin, hasil;
			int coba;
			Boolean ketemu;

			System.out.println("========== Login ATM Kasih Bunda ======");     
			ObjectInputStream in = null;
		    	   System.out.print("Norek :  "); norek=sc.next();
		    	   System.out.print("PIN :  "); pin=sc.next();
		    	   hasil="";
			try {
				// 1. buka file untuk dibaca	
				in=new ObjectInputStream(new FileInputStream
	    		   ("/Users/jamjam/Desktop/FileJava/Nasabah/NasabahKasihBunda.dat"));
	       Object curR = in.readObject();
	       ketemu=false;
	       try {	
	    	   while (ketemu==false && true) {
	        	   R = (Nasabah) curR; //inputstream -> objek customer
	        	   // cek apakah norek ada?
	        	  if(R.getNorek().contentEquals(norek)){
	        		 ketemu=true;
	        	  }
	        	  curR = in.readObject(); // baca terus kedata selanjutnya
	         } 
	       } catch (EOFException e) {}
	    	   if(ketemu==true) {
 	        		coba=1;
 	        	  do {
 	              	  if(R.getPin().contentEquals(pin)) {
 	              		  hasil=R.getNorek();
 		        	  }else {
 		        		  System.out.println("Password yang anda masukan salah!");
 		        		  if(coba==1) {
 		        			  System.out.println("Percobaan hanya sampai 3x, kalo tidak rekening anda ditahan");		        			  
 		        		  }
 		        		  if(coba<=3) {
 		        			  System.out.println("Percobaan ke-"+coba);
 		        			  System.out.print("PIN :  "); pin=sc.next();
 		        		  }else {
 		        			  System.out.println("");
 		        			  System.out.println("=== Mohon maaf norek anda kami tahan ===");
 		        		  }
 		        	  }
 	              	 coba++;
 	        	  }while(coba<=4);
 	          }else {
 	        	 System.out.println("");	
	             System.out.println("Nasabah tidak ditemukan");
 	          }
	       } catch (ClassNotFoundException e) {
	             System.out.println("Class tidak ditemukan.");
	       } catch (IOException e) {
	             e.printStackTrace();
	      }  
		return hasil;	
	    }
	    
	    // CEK Nama
	  		public String CekNama(String norek){
	  		    Nasabah R = new Nasabah();
	  		    Boolean ketemu;
	  		    String nama;
	  		    System.out.println("====== Cek Saldo ======");     
	  		    ObjectInputStream in = null;
	  		    nama="";
	  		    try {
	  		     // 1. buka file untuk dibaca	
	  		       in=new ObjectInputStream(new FileInputStream
	  		    		   ("/Users/jamjam/Desktop/FileJava/Nasabah/NasabahKasihBunda.dat"));
	  		       Object curR = in.readObject();	  
	  		       ketemu=false;
	  		       try {	
	  		       // 2. baca dan proses setiap record yang dibaca 
	  		    	 
	  		    	   while (ketemu==false) {
	  			        	   R = (Nasabah) curR; //inputstream -> objek customer
	  			        	  if(R.getNorek().contentEquals(norek)){
	  			        		  ketemu=true;
	  			        	  }		
	  			        	  curR = in.readObject(); // baca lagi...
	  			         } 
	  		       } catch (EOFException e) {}
	  	        		 if(ketemu==true) {
		  	        		  nama= R.getNama();
		  	        	  }
	  		             System.out.println("");				
	  		       } catch (ClassNotFoundException e) {
	  		             System.out.println("Class tidak ditemukan.");
	  		       } catch (IOException e) {
	  		             e.printStackTrace();
	  		      }    
	  		    return nama;
	  		    }
	
	    // CEK SALDO
		public void CekSaldo(String norek){
		    Nasabah R = new Nasabah();
		    Boolean ketemu;
		    System.out.println("====== Cek Saldo ======");     
		    ObjectInputStream in = null;
		    try {
		     // 1. buka file untuk dibaca	
		       in=new ObjectInputStream(new FileInputStream
		    		   ("/Users/jamjam/Desktop/FileJava/Nasabah/NasabahKasihBunda.dat"));
		       Object curR = in.readObject();	  
		       ketemu=false;
		       try {	
		       // 2. baca dan proses setiap record yang dibaca 
		    	 
		    	   while (ketemu==false) {
			        	   R = (Nasabah) curR; //inputstream -> objek customer
			        	  if(R.getNorek().contentEquals(norek)){
			        		  ketemu=true;
			        	  }		
			        	  curR = in.readObject(); // baca lagi...
			         } 
		       } catch (EOFException e) {}
	        	  if(ketemu==true) {
	        		  System.out.println("Saldo Anda : Rp."+ R.getSaldo());
	        	  }
		             System.out.println("");				
		       } catch (ClassNotFoundException e) {
		             System.out.println("Class tidak ditemukan.");
		       } catch (IOException e) {
		             e.printStackTrace();
		      }           
		    }
	
		// STOR SALDO
		public void StorSaldo(String norek){
		    Nasabah R = new Nasabah();
		    float saldoBaru, stor;
		    System.out.println("====== Stor Saldo ======");     
		    ObjectInputStream in = null; // read
		    ObjectOutputStream out = null; // write
		    try {	    	// 1. buka file untuk dibaca	
		       try {
		    	   in=new ObjectInputStream(new FileInputStream
			    		   ("/Users/jamjam/Desktop/FileJava/Nasabah/NasabahKasihBunda.dat"));
			    		   Object curR = in.readObject();
			       // 2. buka file untuk ditulis	
			    	out=new ObjectOutputStream(new FileOutputStream
			    		              ("/Users/jamjam/Desktop/FileJava/Nasabah/Temp.dat"+ ""));// nama direktori+file
			    	 BufferedReader brInput= new BufferedReader
			                    (new InputStreamReader(System.in)); 
		       // MEMBACKUP KE TEMP  
			    	  do {
				    	   System.out.print("Stor Saldo (min 10k) :  ");stor=sc.nextFloat();
		    		   }while(stor<10000);
		     	   while (true) {
		        	   R = (Nasabah) curR; //inputstream -> objek customer
	        		   if(R.getNorek().contentEquals(norek)) {
	        			   saldoBaru=R.getSaldo()+stor;
	        			   R=new Nasabah(R.getNorek(),R.getNama(),R.getPin(),saldoBaru);
	        			   System.out.println("Saldo berhasil distor");
		        		   System.out.println("Saldo Anda : Rp."+ R.getSaldo());
	        		   }else {
	        			   R=new Nasabah(R.getNorek(),R.getNama(),R.getPin(),R.getSaldo());
	        		   }
	        		   out.writeObject(R);
	        		   curR = in.readObject(); // baca lagi...
		           }   
		       } catch (EOFException e) {}
				try {
					// FILE TEMP DI UBAH LALU DI PINDAHKAN KEMBALI KE FILE UTAMA					
				 	// 1. buka file untuk dibaca	
				     in=new ObjectInputStream(new FileInputStream
				    		   ("/Users/jamjam/Desktop/FileJava/Nasabah/Temp.dat"));
				    		   Object curR = in.readObject();
				    // 2. buka file untuk ditulis	
				    out=new ObjectOutputStream(new FileOutputStream
				    		   ("/Users/jamjam/Desktop/FileJava/Nasabah/NasabahKasihBunda.dat"+ ""));// nama direktori+file      
				   while (true) {
		        	   R = (Nasabah) curR; //inputstream -> objek customer		        	   
		        	   R=new Nasabah(R.getNorek(),R.getNama(),R.getPin(),R.getSaldo()); 
		               out.writeObject(R); 
		        	   curR = in.readObject(); // baca lagi...
	     		   }
				}catch (EOFException e) {}
				 System.out.println("");	
		       } catch (ClassNotFoundException e) {
		             System.out.println("Class tidak ditemukan.");
		       } catch (IOException e) {
		             e.printStackTrace();
		      }  
		    }	

		// TARIK SALDO
				public void TarikSaldo(String norek){
				    Nasabah R = new Nasabah();
				    float saldoBaru, tarik;
				    Boolean batal;
				    int x;
				    System.out.println("====== Tarik Saldo ======");     
				    ObjectInputStream in = null; // read
				    ObjectOutputStream out = null; // write
				    // TRY DI DALAM TRY APABILA IN OUT NYA MASING MASING
				    try {
				    	batal=false;
				       try {
				    	 // CEK SALDO NYA CUKUP ATAU ENGGA
				    	// 1. buka file untuk dibaca	
					       in=new ObjectInputStream(new FileInputStream
					    		   ("/Users/jamjam/Desktop/FileJava/Nasabah/NasabahKasihBunda.dat"));
				    	   Object curR = in.readObject();
				       // 2. baca dan proses setiap record yang dibaca ;
					    	 while (batal==false&&true) {
					        	   R = (Nasabah) curR; //inputstream -> objek customer
					        	  if(R.getNorek().contentEquals(norek)&& R.getSaldo()< 10000){
					        		  System.out.println("Mohon maaf sldo anda kurang!");
					        			 System.out.println("");
					        			batal=true;
					        	  }else        	  
					        	  curR = in.readObject(); // baca lagi...
					        } 
				       } catch (EOFException e) {}
				       
				       if(batal==false) {
				       try {	
				    	// KALO CUKUP ISI FILE UTAMA DI BACKUP KE TEMP
				    	// 1. buka file untuk dibaca	
					       in=new ObjectInputStream(new FileInputStream
					    		   ("/Users/jamjam/Desktop/FileJava/Nasabah/NasabahKasihBunda.dat"));
					       // 2. buka file untuk ditulis	
					    	out=new ObjectOutputStream(new FileOutputStream
					    		              ("/Users/jamjam/Desktop/FileJava/Nasabah/Temp.dat"+ ""));// nama direktori+file
						    Object curR = in.readObject();
						    BufferedReader brInput= new BufferedReader
				                    (new InputStreamReader(System.in)); 
					
						 // MENGUBAH LALU PINDAHKAN KE TEM 
						    do {
						    	   System.out.print("Tarik Saldo (min 10k) :  ");tarik=sc.nextFloat();
						    	   if(R.getSaldo()<tarik) {
						    		   System.out.println("Maaf saldo anda tidak mencukupi");
						    		   System.out.println("Sisa Saldo Anda : Rp."+ R.getSaldo());
						    		   System.out.println("----------");
						    		   System.out.print("1.Lanjut/0.Batal: ");x=sc.nextInt();
						    		   if(x==0) {
							    		   batal=true;
						    		  }
						    	   }
			        		   }while(batal==false&&tarik<10000&&R.getSaldo()<tarik);
						    
				     		   while (batal==false && true) {
					        	   R = (Nasabah) curR; //inputstream -> objek customer
				        		   if(R.getNorek().contentEquals(norek)) {
				        			   saldoBaru=R.getSaldo()-tarik;
					        		   R=new Nasabah(R.getNorek(),R.getNama(),R.getPin(),saldoBaru);
					        		   System.out.println("Saldo berhasil ditarik");
					        		   System.out.println("Sisa Saldo Anda : Rp."+ R.getSaldo());
				        		   }else{
				        			   R=new Nasabah(R.getNorek(),R.getNama(),R.getPin(),R.getSaldo());				        			   
				        		   }
					               out.writeObject(R); 
					        	   curR = in.readObject(); // baca lagi...
				     		   }   
				     		   
				     		    while (batal==true && true) {
						        	   R = (Nasabah) curR; //inputstream -> objek customer
						        	   R=new Nasabah(R.getNorek(),R.getNama(),R.getPin(),R.getSaldo());
						               out.writeObject(R); 
						        	   curR = in.readObject(); // baca lagi...
					     		   } 
					     	   
					       } catch (EOFException e) {}
						try {
							// FILE TEMP DI PINDAHKAN KEMBALI KE FILE UTAMA					
						 	// 1. buka file untuk dibaca	
						     in=new ObjectInputStream(new FileInputStream
						    		   ("/Users/jamjam/Desktop/FileJava/Nasabah/Temp.dat"));
						    // 2. buka file untuk ditulis	
						    out=new ObjectOutputStream(new FileOutputStream
						    		   ("/Users/jamjam/Desktop/FileJava/Nasabah/NasabahKasihBunda.dat"+ ""));// nama direktori+file
						    Object curR = in.readObject();
						    // MEMINDAHKAN KEMBALI KE ARSIP NASABAH
					       while (true) {
				        	   R = (Nasabah) curR; //inputstream -> objek customer
				        	   R=new Nasabah(R.getNorek(),R.getNama(),R.getPin(),R.getSaldo());    
				               out.writeObject(R); 
				        	   curR = in.readObject(); // baca lagi...
				           }  
							  
						}catch (EOFException e) {}
				       }
				       // endif Batal=true
				       
				  	 System.out.println("");
				       } catch (ClassNotFoundException e) {
				             System.out.println("Class tidak ditemukan.");
				       } catch (IOException e) {
				             e.printStackTrace();
				      }  
				    }	
}
// end functions

