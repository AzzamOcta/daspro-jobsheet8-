import java.util.Scanner;

public class Tugas309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int toko = sc.nextInt();

        System.out.println("============================");
        
        if (toko < 0) {
            System.out.println("Jumlah toko harus > 0.");
        } else {
            int tokoTerbanyak = 0;
            int nomorToko = 1;
            double totalSeluruh = 0;

            while (nomorToko <= toko) { 
                System.out.println("Toko: " + nomorToko);
                double total = 0;
                int pelanggan;
                

                    do { 
                        System.out.print("Pelanggan: ");
                        pelanggan = sc.nextInt();

                        if (pelanggan < 0) {
                            System.out.println("Jumlah pelanggan harus lebih dari 0");
                        }

                        for (int i = 1; i <= pelanggan; i++) {
                        int barang;

                        do { 
                            System.out.print("Masukan barang: ");
                            barang = sc.nextInt();
    
                            if (barang < 0) {
                                System.out.println("Jumlah barang harus lebih dari 0");
                            }
                        } while (barang < 0);
                        total = total + barang;
    
                    }
                    } while (pelanggan < 0);
                
                    System.out.println("total barang: " + total);
                    System.out.println("===================================");

                totalSeluruh = totalSeluruh + total;

                if (total > tokoTerbanyak) {
                    tokoTerbanyak = nomorToko;
                }
                nomorToko++;
            }
            
            System.out.println("Total barang seluruh toko: " + (int)totalSeluruh);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
            

            

            // int nomorToko = 1;
            // int tokoTerbanyak = 0;
            // int totalSeluruh;
        }
    }
}
