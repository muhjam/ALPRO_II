package Matrik;

import java.util.Scanner;

import latihan1.ArrayMahasiswa;

public class MatrikChar {
	int m=2;
	int n=2;
	char x;
	char [][]a=new char[m][n];

	Scanner sc = new Scanner(System.in);
	
void InitMatrik() {
	for (int i=0; i<n;i++) {
		for(int j=0; j<m;j++) {
			a[i][j]=0;
		}
	}
}
	

//void InputMatrik() {
//	for (int i=0; i<n;i++) {
//		for(int j=0; j<m;j++) {
//			System.out.print("Data ke-"+i+":");int x=sc.nextInt();
//			a[i][j]=x;
//		}
//	}
//	
//}

void InputMatrik2() {
	for (int i=0; i<m;i++) {
		for(int j=0; j<n;j++) {
			x='+';
			if(i==2 && j==2) {
				x='x';
			}
			a[i][j]=x;
		}
	}
}

void TampilMatrik() {
	System.out.println("Menampilkan isi/element array");
	for (int i=0; i<m;i++) {
		for(int j=0; j<n;j++) {
			System.out.print(a[i][j]+"");
		}
		System.out.println();
	}
}

void Frekuensi() {
	int f=0;
	System.out.println("Menampilkan isi/element array");
	for (int i=0; i<m;i++) {
		for(int j=0; j<n;j++) {
			if(a[i][j]==0) {
				f=f+1;
			}
		}
		System.out.println();
	}
}
	
	public static void main(String[] args) {
		MatrikChar A=new MatrikChar(); // manggil class
		MatrikChar B=new MatrikChar(); 
		MatrikChar C=new MatrikChar(); 
		Scanner sc = new Scanner(System.in); // supaya bisa di inputkan
		
		A.InitMatrik();
		A.InputMatrik2();
		A.TampilMatrik();
		
	}

}
