import java.util.Scanner;

class proses extends Barang{
		Scanner input = new Scanner(System.in);
		private int total,bayar,harga = 0; 
		private int M,K,L,m,k,l = 0;
		private int kembalian,jumlah;
		private char merek,tipe;
		boolean loop = true;
		
		public proses(String nama){
		super(nama);
		}	
		
		protected void pilihan(){
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
		merek = input.next().charAt(0);
		while(loop){
		System.out.print("Masukkan tipe = ");
        tipe = input.next().charAt(0);
		

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
	}
	
		protected void pembayaran(){
       System.out.print("Masukkan Jumlah Pesanan = ");
       jumlah = input.nextInt();
       total = harga*jumlah;
       System.out.println("Total Harga = Rp "+total);
      
       
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
		}
		protected void cetak(){
	   System.out.println("Nama        : "+getNama ());
	   System.out.println("Total Harga : Rp."+total);
	   System.out.println("Bayar       : Rp."+bayar);
	   System.out.println("-------------------------------------------");
	   System.out.println("Kembalian   : Rp."+kembalian);
	    
	   
	    }	
		
				
	}
