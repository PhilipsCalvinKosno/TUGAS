import java.util.Scanner;

class main {
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	
	String nama;
	
	System.out.print("masukkan nama anda : ");
    nama = input.nextLine();

	proses p = new proses(nama);
	Barang l = new proses(nama);
	
	p.pilihan();
	p.pembayaran();
	p.cetak();
	
	
		
	}
}