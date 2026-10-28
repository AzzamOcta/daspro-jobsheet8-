import java.util.Scanner;

public class Tugas209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {                
                System.out.printf("%4d", i * j);
                total = total + i * j;
            }

            System.out.println();
        }

        System.out.println("Total seluruh angka: " + total);
    }
}