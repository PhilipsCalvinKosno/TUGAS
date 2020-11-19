import java.util.Scanner;
public class proses{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int total,bayar,harga = 0; 
		int M,K,L,m,k,l = 0;
		int kembalian,jumlah;
		char merek,tipe;
		String nama;
		boolean loop = true;
		
		Barang S = new Barang();
		Scanner SC = new Scanner(System.in);
		
		bayar=0;	
		System.out.print("Masukkan Nama Anda = ");
		nama = SC.nextLine();
		System.out.println("-------------------------------------");
	    System.out.println("Merk :      Tipe  :      Harga ");
		System.out.println("G           Meja(M)      Rp.  95.000 ");
		System.out.println("            Kursi(K)     Rp. 125.000 ");
		System.out.println("            Lemari(L)    Rp. 450.000 ");
		System.out.println();
		System.out.println("O           Meja(M)      Rp. 115.000 ");
		System.out.println("            Kursi(K)     Rp. 135.000 ");
		System.out.println("            Lemari(L)    Rp. 550.000 ");
		System.out.println("-------------------------------------");
		System.out.print("Masukkan Merek = ");
		merek = SC.next().charAt(0);
		while(loop){
		System.out.print("Masukkan tipe = ");
        tipe = SC.next().charAt(0);
		

		 switch(tipe)
		 {
		 	case 'm':case 'M'  :
               if (merek =='G')
               {harga = 95000;
               }
               else {harga = 115000;
               }
                loop = false;
                break;
                
           case 'k': case 'K' :
               if (merek =='G')
               {harga = 125000;
               }
               else {harga = 135000;
               }
                loop = false;
                break;
                
		   case 'l':case 'L'  :
               if (merek =='G')
               {harga = 450000;
               }
               else {harga = 550000;
               }
                loop = false;
                break;
                        
           
               default :
                System.out.println("Inputan salah,harap coba lagi");
               
                
        }
        
	  
	}
	System.out.print("Masukkan Jumlah Pesanan = ");
       jumlah = input.nextInt();
       total = harga*jumlah;
       
        
		while(bayar<total){
		System.out.print("Masukkan Pembayaran = Rp "); 
		bayar = input.nextInt();
			if (bayar > total){
				kembalian=bayar-total;
			}
			else if (bayar<total){
				System.out.println("Uang tidak cukup, jangan boros");
				}
			}
       kembalian = bayar - total;
       
       
	S.sub (nama,total,bayar,kembalian);
	}
}