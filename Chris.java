import java.util.*;

class Tiket {
    private String username;
    private String password;
    private double hargaTiketPesawat;
    private double hargaKamarHotel;

    public Tiket(String username, String password) {
        this.username = username;
        this.password = password;
        this.hargaTiketPesawat = 500000;
        this.hargaKamarHotel = 450000; 
    }

    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public double hitungHargaTiket(int jumlahPenumpang) {
        double asuransi = jumlahPenumpang * 29000;
        return (hargaTiketPesawat * jumlahPenumpang) + asuransi;
    }

    public double hitungBiayaHotel(int jumlahKamar) {
        double diskon = 0.45 * hargaKamarHotel;
        return (hargaKamarHotel - diskon) * jumlahKamar;
    }
}

public class Chris {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  
        Tiket tiket = new Tiket("admin", "123");

        System.out.println("-------Aplikasi Tiket Pesawat dan Hotel-------");
        System.out.print("Username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Password: ");
        String inputPassword = scanner.nextLine();

   
        if (tiket.login(inputUsername, inputPassword)) {
            int menu;
            do {
                System.out.println("------Menu------");
                System.out.println("1. Input Data Transaksi");
                System.out.println("2. Lihat Data Tiket");
                System.out.println("3. Keluar");
                System.out.print("Pilih menu (1/2/3): ");
                menu = scanner.nextInt();

                switch (menu) {
                    case 1:
						String NamaHotel = new String();
                        System.out.print("Nama Hotel: ");
						NamaHotel = scanner.nextLine();
						System.out.print("Jumlah penumpang: ");
                        int jumlahPenumpang = scanner.nextInt();
                        System.out.print("Jumlah kamar hotel: ");
                        int jumlahKamar = scanner.nextInt();

                        double totalHargaTiket = tiket.hitungHargaTiket(jumlahPenumpang);
                        double totalBiayaHotel = tiket.hitungBiayaHotel(jumlahKamar);

                        System.out.println("Total Harga Tiket Pesawat: " + totalHargaTiket);
                        System.out.println("Total Biaya Hotel: " + totalBiayaHotel);
                        break;
                    case 2:
 
                        break;
                    case 3:
                        System.out.println("Terima kasih. Sampai jumpa!");
                        break;
                    default:
                        System.out.println("Menu tidak valid.");
                }
            } while (menu != 3);
        } else {
            System.out.println("Login gagal. Username atau password salah.");
        }
    }
}
