package tugasprogram;
import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //deklarasi variabel
        int barang, jumlah;
        double harga = 0, diskon, total = 0, uangMasuk, uangKembalian,totalbelanja = 0;
        //proses
        System.out.println("==========================================");
        System.out.println("TOKO BERKAH");
        System.out.println("Produk Tersedia");
        System.out.println("1. TAS    Rp.100.000,-");
        System.out.println("2. Sepatu RP.150.000,-");
        System.out.println("3. Sandal Rp.50.000,-");
        System.out.println("==========================================");
        System.out.print("Pilih barang (1/2/3/) : ");
        barang = sc.nextInt();
        System.out.print("jumlah barang : ");
        jumlah = sc.nextInt();
        System.out.println("==========================================");
        
        //total belanja
        if (barang <= 1) {
            harga = 100000; 
        } else if (barang <= 2) {
            harga = 150000; 
        } else if (barang <= 3) {
            harga = 50000; 
        }
        total = harga*jumlah;
        System.out.println("Total Belanja Rp "+total);
        
        //hitung diskon
        if (total <= 100000) {
            diskon = 0.00*total; 
            System.out.println("Mendapatkan Diskon Rp "+diskon);
            totalbelanja = total-diskon;
            System.out.println("Total Belanja Akhir Rp "+totalbelanja);
        } else if (total <= 200000) {
            diskon = 0.05*total; 
            System.out.println("Mendapatkan Diskon Rp "+diskon);
            totalbelanja = total-diskon;
            System.out.println("Total Belanja Akhir Rp "+totalbelanja);
        } else if (total <= 300000) {
            diskon = 0.10*total; 
            System.out.println("Mendapatkan Diskon Rp "+diskon);
            totalbelanja = total-diskon;
            System.out.println("Total Belanja Akhir Rp "+totalbelanja);
        } else if (total <= 400000) {
            diskon = 0.15*total; 
            System.out.println("Mendapatkan Diskon Rp "+diskon);
            totalbelanja = total-diskon;
            System.out.println("Total Belanja Akhir Rp "+totalbelanja);
        } else if (total <= 500000) {
            diskon = 0.20*total;
            System.out.println("Mendapatkan Diskon Rp "+diskon);
            totalbelanja = total-diskon;
            System.out.println("Total Belanja Akhir Rp "+totalbelanja);
        } else {
            diskon = 0.25*total;
            System.out.println("Mendapatkan Diskon Rp "+diskon);
            totalbelanja = total-diskon;
            System.out.println("Total Belanja Akhir Rp "+totalbelanja);
        }
        System.out.println("==========================================");
        
        //uang pembayaran
        System.out.print("Masukkan nominal pembayaran : ");
        uangMasuk = sc.nextDouble();
     
        if(uangMasuk > totalbelanja){
            uangKembalian = uangMasuk-totalbelanja;
            System.out.println("Uang Kembalian : Rp " +uangKembalian); 
        }
        else if(uangMasuk == totalbelanja){
            System.out.println("Uang Pas");
        }
        else{
            uangKembalian = uangMasuk-totalbelanja;
            System.out.println("Maaf Uang anda kurang : Rp " +uangKembalian); 
        }
        System.out.println("Terimakasih Sudah Berbelanja");
        System.out.println("==========================================");
    }
}
