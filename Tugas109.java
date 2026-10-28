import java.util.Scanner;

public class Tugas109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        int total = 0;

        for (int i = 1; i <= n; i++) {
            
            char h = '1';
            int j = 0;

            while (j < i) { 
                System.out.print(h + " ");
                h++;
                j++;
            }
            System.out.println();

            total = total + j;
        }
        System.out.println("Total angka yang tercetak: " + total);
        
        
    }
}
