package MatrikBisnis;

import java.util.Scanner;

public class MatrikBisnis {
	int M=2; // baris semua matrik
	int N=5; // kolom semua matrik
	Bisnis [][]MB=new Bisnis[M][N];

	Scanner sc = new Scanner(System.in);

	void InitMatrikBisnis() {
		 Bisnis R;
		 String x;
		 int y=0, z=1;
		for (int i=0; i<M;i++) {
			for(int j=0; j<N;j++) {
				R=new Bisnis();
				x = Integer.toString(y);
				if(z>=6) {
					z=1;
				}
				
				R.Kode=x;
				R.Nama="Bisnis"+x;
				R.Jenis=z;
				R.Status=true;
				MB[i][j]=R;
				
				y++;z++;
			}
		}
	
	}
	
	void InputMatrikBisnis() {
		 Bisnis R;
		for (int i=0; i<M;i++) {
			for(int j=0; j<N;j++) {
				 R=new Bisnis();
				R.InputBisnis();
				MB[i][j]=R;
			}
		}
	
	}

	void OutputMatrikBisnis() {
		System.out.println("Menampilkan isi/element array");
		for (int i=0; i<M;i++) {
			for(int j=0; j<N;j++) {
				System.out.println("");
				MB[i][j].OutputBisnis();
			}
		}
	}
	
	void StatistikMatrikBisnis() {
		int bengkel=0, kafe=0, petshop=0, resto=0, tokosembako=0;
		System.out.println("Menampilkan Statistik");
		for (int i=0; i<M;i++) {
			for(int j=N-3; j<N;j++) {	
				switch(MB[i][j].Jenis) {
						case 1: bengkel=bengkel+1;
								break;
						case 2: kafe=kafe+1;
								break;
						case 3: petshop=petshop+1;
								break;
						case 4: resto=resto+1;
								break;
						case 5:	tokosembako=tokosembako+1;
								break;
				}
			}
		} 
		System.out.println("Jenis Bisnis");
		System.out.println("Bengkel: "+bengkel);
		System.out.println("Kafe: "+kafe);
		System.out.println("Pet Shop: "+petshop);
		System.out.println("Resto: "+resto);
		System.out.println("Toko Sembako: "+tokosembako);
	}
	
	void OutputStatistikMatrikBisnis() {
		int bengkel=0, kafe=0, petshop=0, resto=0, tokosembako=0;
		System.out.println("Menampilkan Statistik Matrik");
		for (int i=0; i<M;i++) {
			for(int j=N-3; j<N;j++) {
				System.out.print(MB[i][j].Jenis+" ");
			}
			System.out.println("");
		}

	}

	void SeqSearchMatriks(String x) {
		int i=0, j=0;
		Boolean ketemu= false;
		i=0;
		
		while(i<M && ketemu==false) {
			j=0;
			while(j<N && ketemu==false) {
				if(MB[i][j].Nama.equals(x)) {
					ketemu=true;
				}else {
					j++;
				}
			}
			
			if(ketemu == false) {
				i++;
			}
		}
		
//		kalo ketemu
		if(ketemu==true) {
			System.out.println("Ketemu di baris: "+i+" dan kolom: "+j);
		}else {
			System.out.println("Tidak Ketemu");
		}
	}

	public static void main(String[] args) {
		MatrikBisnis A=new MatrikBisnis(); // manggil class
		Scanner sc = new Scanner(System.in); // supaya bisa di inputkan

		A.InitMatrikBisnis();
		A.OutputMatrikBisnis();
		A.OutputStatistikMatrikBisnis();
		A.StatistikMatrikBisnis();
	
//		LOOPING CARI NAMA BISNIS
		int i=0;
		do{
			System.out.println("");
			System.out.println("Mencari");
			System.out.print("Nama Bisnis: ");String x=sc.next();
			A.SeqSearchMatriks(x);
			i++;
		}while(i<=5);
		System.out.println("Selesai");
		
//		mengubah status toko
		
		
	}

}
