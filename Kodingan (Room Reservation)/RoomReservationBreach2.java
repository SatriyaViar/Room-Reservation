import java.util.Scanner;

/**
 * RoomReservationBreach2
 */
public class RoomReservationBreach2 {
static void mainmenu (){
    System.out.println("============================================");
    System.out.println("Selamat Datang Di Platfrom Penyewaan Ruangan");
    System.out.println("                 JTI POLINEMA               ");
    System.out.println("============================================");
    System.out.println("Menu Penyewaan Ruangan Polinema");
    System.out.println("1. List Gedung dan Ruangan Yang Dapat Disewa Di Polinema");
    System.out.println("2. Formulir Penyewaan Ruangan");
    System.out.println("3. Metode Pembayaran");
    System.out.println("4. Syarat Dan Ketentuan");
    System.out.println();
    System.out.print("Choise Menu: ");
}
static String formulir (String formulirInternal){
    Scanner in = new Scanner(System.in);

    String namaPengguna; String alamatPengguna; String telfonPengguna; String emailPengguna; String tanggalAcara;
        
    System.out.println("Lengkapi Data Berikut: ");
    System.out.println("Nama: ");
    namaPengguna = in.nextLine();
    System.out.println("Alamat Lengkap: ");
    alamatPengguna = in.nextLine();
    System.out.println("Nomor Telefon: ");
    telfonPengguna = in.nextLine();
    
    return formulirInternal;
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            Boolean singUp = false; Boolean login = false; boolean penggunaGedung = false; boolean benar = true;
            String idAdmin = "admin"; String passAdmin = "admin"; String user = ""; String Pass = ""; String passRepeat = Pass;
            String pengguna = "Internal" ; String pengguna2 = "Eksternal"; String penyewa = ""; String penggunaInternalTendik; String penggunaInternalPegawai;
            String namaPengguna; String alamatPengguna; String telfonPengguna; String emailPengguna; String tanggalAcara;


            int option; int GGraha = 5000000; int GPertamina = 4500000; int GAudit = 3000000; int optionMenu;
            int GTheater =  2000000; int totalPembayaran; int jangkaPeminjaman; int i;

        System.out.println("Selamat datang di aplikasi penyewaan ruangan");
        System.out.println("Ketik ( 1 ) untuk SingUp jika belum memiliki akun");
        System.out.println("Ketik ( 2 ) untuk Login  Jika sudah memiliki akun");
        option = in.nextInt();
        
        // Login SingUp ID Password
        switch (option) {
            case 1:
                do{
                    System.out.print("Masukan Username : ");
                    user = in.next();
                    System.out.print("Masukan Password : ");
                    Pass = in.next();
                    System.out.print("Ulangi Password  : ");
                    passRepeat = in.next();
                        
                        if (Pass.equals(passRepeat)) {
                            singUp = true;
                            break;
                        } else {
                            System.out.println("Password Tidak Sama. Coba Lagi!!");
                        }
                    }while (!singUp); {
                        System.out.println("SingUp Berhasil ");  
                } 

                do {
                    System.out.print("Masukan Username : ");
                    user = in.next();
                    System.out.print("Masukan Password : ");
                    Pass = in.next();
                        
                        if (user.equals(user) && Pass.equals(passRepeat)) {
                            login = true;
                        } else {
                            System.out.println("Username dan Password Salah");
                            System.out.println("Coba Lagi!!");
                            }
                    } while (!login); {
                        System.out.println("Login Berhasil");
                        
                }
                break;  

            case 2: 
                    do {
                        System.out.print("Masukan Username : ");
                        user = in.next();
                        System.out.print("Masukan Password : ");
                        Pass = in.next();
                        
                            if (user.equals(idAdmin) && Pass.equals(passAdmin)) {
                                login = true;
                            } else {
                                System.out.println("Username dan Password Salah");
                                System.out.println("Coba Lagi!!");
                            }
                    } while (!login); {
                        System.out.println("Login Berhasil");
                    }
                    break;
        }
        while (true) {  
        System.out.println("============================================");
        System.out.println("Selamat Datang Di Platfrom Penyewaan Ruangan");
        System.out.println("                 JTI POLINEMA               ");
        System.out.println("============================================");
        System.out.println("Menu Penyewaan Ruangan Polinema");
        System.out.println("1. List Gedung dan Ruangan Yang Dapat Disewa Di Polinema");
        System.out.println("2. Syarat Dan Ketentuan");
        System.out.println("3. Formulir");
        System.out.println("4. Metode Pembayaran");
        System.out.println("5. Keluar");
        System.out.println();
        System.out.print("Choise Menu: ");
        optionMenu = in.nextInt();
        System.out.println();
        switch (optionMenu) {
            case 1:
            do{
            System.out.println("1. Gedung Graha Polinema");
            System.out.println("2. Gedung Pertamina");
            System.out.println("3. Gedung Auditorium Teknik Sipil Lantai 8");
            System.out.println("4. Gedung Graha Teater");
            System.out.println("5. Kembali Ke Menu Utama");
            option = in.nextInt();
                switch (option) {
                    case 1:
                        do{
                        System.out.println("Deskripsi Gedung Graha polinema");
                        System.out.println();
                        System.out.println("1. Kembali ke list gedung");
                        System.out.println("2. Keluar");
                        option = in.nextInt();
                         if (option == 1) {
                                continue;
                            } else if (option == 2) {
                                System.exit(0);
                            }else {
                               System.out.println("Anda salah memasukan Angka, Coba Lagi!"); 
                               System.out.println();
                            }
                        } while (option != 1);
                        break;
                    case 2: 
                        do{
                        System.out.println("Deskripsi Gedung Pertamina");
                        System.out.println();
                        System.out.println("1. Kembali ke list gedung");
                        System.out.println("2. Keluar");
                        option = in.nextInt();
                         if (option == 1) {
                                continue;
                            }else if (option == 2) {
                                System.exit(0);
                            } else {
                               System.out.println("Anda salah memasukan Angka, Coba Lagi!"); 
                               System.out.println();
                            }
                        }while (option != 1);
                        break;
                        
                    case 3:
                        
                        do{
                        System.out.println("Deskripsi Gedung Auditorium");
                        System.out.println();
                        System.out.println("1. Kembali ke list gedung");
                        System.out.println("2. Keluar");
                        option = in.nextInt();
                            if (option == 1) {
                                continue;
                            }else if (option == 2) {
                                System.exit(0);
                            } else {
                               System.out.println("Anda salah memasukan Angka, Coba Lagi!"); 
                               System.out.println();
                            }
                        }while (option != 1);
                        break;
                    case 4:
                        do{
                        System.out.println("Deskripsi Gedung Graha Teater");
                        System.out.println();
                        System.out.println("1. Kembali ke list gedung");
                        System.out.println("2. Keluar");
                        option = in.nextInt();
                         if (option == 1) {
                                continue;
                            }else if (option == 2) {
                                System.exit(0);
                            } else {
                               System.out.println("Anda salah memasukan Angka, Coba Lagi!"); 
                               System.out.println();
                            }
                        }while (option != 1);
                        break;
                    default:
                        System.out.println("Angka yang anda masukan salah Coba Lagi!");
                        System.out.println();
                }
            }while (option != 5);
            break;
            case 2:
                do {
                System.out.println("Syarat dan Ketentuan");
                System.out.println();
                System.out.println("1. Kembali Ke Menu Utama");
                System.out.println("2. Keluar");
                option = in.nextInt();
                if (option == 1) {
                    continue;
                } if (option == 2) {
                    System.exit(0);
                }else{
                    System.out.println("Angka Yang Anda Masukan Salah Coba Lagi !!");
                    System.out.println();
                }
                } while (option != 1);
                break;
            case 3: 
                // do {
                    System.out.println("Sebagai Pengguna Internal Atau Eksternal");
                    penyewa = in.nextLine();

                        if (penyewa.equals(penyewa)) {

                            System.out.println("Lengkapi Data Berikut: ");
                            System.out.println("Nama: ");
                            namaPengguna = in.nextLine();
                            System.out.println("Alamat Lengkap: ");
                            alamatPengguna = in.nextLine();
                            System.out.println("Nomor Telefon: ");
                            telfonPengguna = in.nextLine();
                        }
                // } while ();
                break;
            
            
            
            }
        }
    }
}
