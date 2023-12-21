import java.util.Scanner;

/**
 * RoomReservation
 */
public class RoomReservation {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String ID = "Kelompok 4";
        String Password = "1234";
        String Pengguna = "Internal";
        String Pengguna2 = "Eksternal";
        
        

        //Mulai

        // Login ID PASSWORD 
        System.out.println("____________________________________________________________________");
        System.out.println("Selamat Datang Di Aplikasi Penyewaan Gedung Politeknik Negeri Malang");
        System.out.println("____________________________________________________________________");

        //
        boolean Login = false;

        while (!Login) {
            System.out.println("Masukan Nama Pengguna: ");
            String inputPengguna = in.nextLine();
            System.out.println("Masukan Password: ");
            String inputPassword = in.nextLine();
        if (inputPengguna.equals(ID) && inputPassword.equals(Password)) {
            System.out.println("Login Berhasil!");
            Login = true;
        } else {
            System.out.println("Pengguna Dan Password Salah. Coba Lagi!");
        }
            
        }
        //Pemilihan Gedung Yang Ingin Di sewa
        System.out.println("Gedung Tersedia : ");
        System.out.println("A. Gedung Graha Polinema");
        System.out.println("B. Gedung Pertamina Polinema");
        System.out.println("C. Gedung Auditorium Teknik Sipil Polinema");
        System.out.println("D. Gedung Graha Teater Polinema");
        System.out.print("Gedung Yang Ingin Di sewa: ");
        String inputGedung = in.nextLine();

        if (inputGedung.equals("Gedung Graha Polinema")) {
            
        }
        // Pemilihan Pengguna Eksternal Atau Internal
        boolean penyewa = false;

        while (!penyewa) {
            System.out.print("Sebagai Eksternal Atau Internal :");
            String Penyewa = in.nextLine();
            if (Penyewa.equals(Pengguna) || Penyewa.equals(Pengguna2)) {
                penyewa = true;
            } else {
                System.out.println("Silahkan Masukan Pengguna!");
            }
            if (Penyewa.equals(Pengguna)) {
                System.out.println("Masukan NIM Mahasiswa: ");
                String input = in.nextLine();
                
            } else {
                System.out.println("Masukan Foto KTP: ");
                String input = in.nextLine();
            }
        
        boolean date = true;
        while (!date) {
            System.out.println("Silahkan Pilih tanggal yang ingin ");
            String Date = in.nextLine();
        
        }
        }
    }    
} 
