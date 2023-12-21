import java.util.Scanner;

/**
 * RoomReservationBreach
 */
public class RoomReservationBreach {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            Boolean singUp = false; Boolean login = false; boolean penggunaGedung = false; boolean benar = true;
            String idAdmin = "admin"; String passAdmin = "admin"; String user = ""; String Pass = ""; String passRepeat = Pass;
            String pengguna = "Internal"; String pengguna2 = "Eksternal"; String penyewa = ""; String penggunaInternalTendik; String penggunaInternalPegawai;
            String namaPengguna; String alamatPengguna; String telfonPengguna; String emailPengguna; String tanggalAcara;


            int option; int GGraha = 5000000; int GPertamina = 4500000; int GAudit = 3000000;
            int GTheater =  2000000; int totalPembayaran; int jangkaPeminjaman;

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
        
        //Pemilihan Gedung

        System.out.println("Gedung mana Yang ingin disewa: ");
        System.out.println("1. Gedung Graha Polinema");
        System.out.println("2. Gedung Pertamina");
        System.out.println("3. Gedung Auditorium Teknik Sipil Lantai 8");
        System.out.println("4. Gedung Graha Teater");
        System.out.print("Gedung yang ingin di sewa: ");
        option = in.nextInt();

            switch (option) {
                case 1:
                 System.out.print("Sebagai pengguna Internal atau Umum: ");
                 penyewa = in.next();
                        
                    if (penyewa.equals(pengguna)) {
                            System.out.println("Lengkapi Data Berikut: ");
                            System.out.print("Nama : ");
                            namaPengguna = in.next();
                            System.out.print("Alamat Lengkap : ");
                            alamatPengguna = in.next();
                            System.out.print("Nomor Telepon : ");
                            telfonPengguna = in.next();
                            
                            System.out.println("============= Surat Pernyataan ============");
                            System.out.print("|| Nama           :" + namaPengguna+    "   || \n");
                            System.out.print("|| Alamat Lengkap :" + alamatPengguna + "   || \n");
                            System.out.print("|| Nomor Telepon  :" + telfonPengguna + "   || \n" );
                            System.out.print("=============================================");
                            break;
                        } 
                        System.out.println("Apakah anda Tenaga Kependidikan Polinema (y/t)");
                        penggunaInternalTendik = in.next();
                        penggunaInternalTendik = benar ? "y" : "t";
                        System.out.println("Apakah anda Pegawai Polinema? (y/t) ");
                        penggunaInternalPegawai = in.next();
                        penggunaInternalPegawai = benar ? "y" : "t";
                    
                          // Pemberian Diskon Jika penyewa dari pihak internal
                        if (penggunaInternalTendik.equalsIgnoreCase("y") || penggunaInternalPegawai.equalsIgnoreCase("y")) {
                                System.out.println("Lengkapi Data Berikut: ");
                                System.out.print("Nama              : ");
                                namaPengguna = in.next();
                                System.out.print("Alamat            : ");
                                alamatPengguna = in.nextLine();
                                System.out.print("No Telepon        : ");
                                telfonPengguna = in.nextLine();
                                System.out.print("Email             : ");
                                emailPengguna = in.nextLine();
                                System.out.print("Tanggal Acara     : ");
                                tanggalAcara = in.nextLine();
                                System.out.print("Jangka Peminjaman : ");
                                jangkaPeminjaman = in.nextInt();
                                totalPembayaran = jangkaPeminjaman * GGraha * 10 / 100;
                                System.out.println("Tarif: ");
                                System.out.println("1. DP 30%");
                                System.out.println("2. Lunas");
                                option = in.nextInt();
                                    switch (option) {
                                        case 1:
                                        totalPembayaran = totalPembayaran - 30 / 100;
                                            System.out.println("========================= Invoice ==========================");
                                            System.out.print("|| Nama               : " + namaPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Alamat             : " + alamatPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| No Telepon         : " + telfonPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Email              : " + emailPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Tanggal Acara      : "+ tanggalAcara + "\t\t\t\t || \n");
                                            System.out.print("|| Jangka Peminjaman  : "+ jangkaPeminjaman + "\t\t\t\t || \n");
                                            System.out.print("|| Pembayaran         : DP 30% \t\t\t\t || \n");
                                            System.out.print("|| Jumlah Pembayaran  : " + totalPembayaran + "\t\t\t\t || \n");
                                            System.out.println("===========================================================");
                                            break;
                                        case 2:
                                            System.out.println("========================= Invoice =========================");
                                            System.out.print("|| Nama               : " + namaPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Alamat             : " + alamatPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| No Telepon         : " + telfonPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Email              : " + emailPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Tanggal Acara      : "+ tanggalAcara + "\t\t\t\t || \n");
                                            System.out.print("|| Jangka Peminjaman  : "+ jangkaPeminjaman + "\t\t\t\t || \n");
                                            System.out.print("|| Pembayaran         : DP 30% \t\t\t\t || \n");
                                            System.out.print("|| Jumlah Pembayaran  : " + totalPembayaran + "\t\t\t\t || \n");
                                            System.out.println("==========================================================");
                                            break;
                                        default:
                                            while (option >=3) {
                                                System.out.println("Coba Lagi!");
                                            }
                                        }
                        }else{ 
                            System.out.println("Lengkapi Data Berikut: ");
                            System.out.print("Nama              : ");
                            namaPengguna = in.next();
                            System.out.print("Alamat            : ");
                            alamatPengguna = in.next();
                            System.out.print("No Telepon        : ");
                            telfonPengguna = in.next();
                            System.out.print("Email             : ");
                            emailPengguna = in.next();
                            System.out.print("Tanggal Acara     : ");
                            tanggalAcara = in.next();
                            System.out.print("Jangka Peminjaman : ");
                            jangkaPeminjaman = in.nextInt();
                            totalPembayaran = jangkaPeminjaman * GGraha;
                            System.out.println("Tarif: ");
                            System.out.println("1. DP 30%");
                            System.out.println("2. Lunas");
                                option = in.nextInt();
                                    switch (option) {
                                        case 1:
                                        totalPembayaran = totalPembayaran - 30 / 100;
                                            System.out.println("========================= Invoice ==========================");
                                            System.out.print("|| Nama               : " + namaPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Alamat             : " + alamatPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| No Telepon         : " + telfonPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Email              : " + emailPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Tanggal Acara      : "+ tanggalAcara + "\t\t\t\t || \n");
                                            System.out.print("|| Jangka Peminjaman  : "+ jangkaPeminjaman + "\t\t\t\t || \n");
                                            System.out.print("|| Pembayaran         : DP 30% \t\t\t\t || \n");
                                            System.out.print("|| Jumlah Pembayaran  : " + totalPembayaran + "\t\t\t\t || \n");
                                            System.out.println("===========================================================");
                                            break;
                                        case 2:
                                            System.out.println("========================= Invoice =========================");
                                            System.out.print("|| Nama               : " + namaPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Alamat             : " + alamatPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| No Telepon         : " + telfonPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Email              : " + emailPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Tanggal Acara      : "+ tanggalAcara + "\t\t\t\t || \n");
                                            System.out.print("|| Jangka Peminjaman  : "+ jangkaPeminjaman + "\t\t\t\t || \n");
                                            System.out.print("|| Pembayaran         : DP 30% \t\t\t\t || \n");
                                            System.out.print("|| Jumlah Pembayaran  : " + totalPembayaran + "\t\t\t\t || \n");
                                            System.out.println("==========================================================");
                                            break;
                                        default:
                                            
                                    }
                        }
                case 2: 
                    System.out.print("Sebagai pengguna Internal atau Umum: ");
                    penyewa = in.next();
                        
                    if (penyewa.equals(pengguna)) {
                            System.out.print("Pengisian Data");
                            penyewa = in.next();
                        } 
                        System.out.println("Apakah anda Tenaga Kependidikan Polinema (y/t)");
                        penggunaInternalTendik = in.next();
                        penggunaInternalTendik = benar ? "y" : "t";
                        System.out.println("Apakah anda Pegawai Polinema? (y/t)");
                        penggunaInternalPegawai = in.next();
                        penggunaInternalPegawai = benar ? "y" : "t";
                    
                          
                        if (penggunaInternalTendik.equalsIgnoreCase("y") || penggunaInternalPegawai.equalsIgnoreCase("y")) {
                                System.out.println("Lengkapi Data Berikut: ");
                                System.out.print("Nama              : ");
                                namaPengguna = in.next();
                                System.out.print("Alamat            : ");
                                alamatPengguna = in.next();
                                System.out.print("No Telepon        : ");
                                telfonPengguna = in.next();
                                System.out.print("Email             : ");
                                emailPengguna = in.next();
                                System.out.print("Tanggal Acara     : ");
                                tanggalAcara = in.next();
                                System.out.print("Jangka Peminjaman : ");
                                jangkaPeminjaman = in.nextInt();
                                totalPembayaran = jangkaPeminjaman * GPertamina * 10 / 100;
                                System.out.println("Tarif: ");
                                System.out.println("1. DP 30%");
                                System.out.println("2. Lunas");
                                option = in.nextInt();
                                    switch (option) {
                                        case 1:
                                        totalPembayaran = totalPembayaran - 30 / 100;
                                            System.out.println("========================= Invoice ==========================");
                                            System.out.print("|| Nama               : " + namaPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Alamat             : " + alamatPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| No Telepon         : " + telfonPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Email              : " + emailPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Tanggal Acara      : "+ tanggalAcara + "\t\t\t\t || \n");
                                            System.out.print("|| Jangka Peminjaman  : "+ jangkaPeminjaman + "\t\t\t\t || \n");
                                            System.out.print("|| Pembayaran         : DP 30% \t\t\t\t || \n");
                                            System.out.print("|| Jumlah Pembayaran  : " + totalPembayaran + "\t\t\t\t || \n");
                                            System.out.println("===========================================================");
                                            break;
                                        case 2:
                                            System.out.println("========================= Invoice =========================");
                                            System.out.print("|| Nama               : " + namaPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Alamat             : " + alamatPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| No Telepon         : " + telfonPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Email              : " + emailPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Tanggal Acara      : "+ tanggalAcara + "\t\t\t\t || \n");
                                            System.out.print("|| Jangka Peminjaman  : "+ jangkaPeminjaman + "\t\t\t\t || \n");
                                            System.out.print("|| Pembayaran         : DP 30% \t\t\t\t || \n");
                                            System.out.print("|| Jumlah Pembayaran  : " + totalPembayaran + "\t\t\t\t || \n");
                                            System.out.println("==========================================================");
                                            break;
                                        default:
                                            while (option >=3) {
                                                System.out.println("Coba Lagi!");
                                            }
                                        }
                        }else{ 
                                System.out.println("Lengkapi Data Berikut: ");
                                System.out.print("Nama              : ");
                                namaPengguna = in.next();
                                System.out.print("Alamat            : ");
                                alamatPengguna = in.next();
                                System.out.print("No Telepon        : ");
                                telfonPengguna = in.next();
                                System.out.print("Email             : ");
                                emailPengguna = in.next();
                                System.out.print("Tanggal Acara     : ");
                                tanggalAcara = in.next();
                                System.out.print("Jangka Peminjaman : ");
                                jangkaPeminjaman = in.nextInt();
                                totalPembayaran = jangkaPeminjaman * GPertamina;
                                System.out.println("Tarif: ");
                                System.out.println("1. DP 30%");
                                System.out.println("2. Lunas");
                                option = in.nextInt();
                                    switch (option) {
                                        case 1:
                                        totalPembayaran = totalPembayaran - 30 / 100;
                                            System.out.println("========================= Invoice ==========================");
                                            System.out.print("|| Nama               : " + namaPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Alamat             : " + alamatPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| No Telepon         : " + telfonPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Email              : " + emailPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Tanggal Acara      : "+ tanggalAcara + "\t\t\t\t || \n");
                                            System.out.print("|| Jangka Peminjaman  : "+ jangkaPeminjaman + "\t\t\t\t || \n");
                                            System.out.print("|| Pembayaran         : DP 30% \t\t\t\t || \n");
                                            System.out.print("|| Jumlah Pembayaran  : " + totalPembayaran + "\t\t\t\t || \n");
                                            System.out.println("===========================================================");
                                            break;
                                        case 2:
                                            System.out.println("========================= Invoice =========================");
                                            System.out.print("|| Nama               : " + namaPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Alamat             : " + alamatPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| No Telepon         : " + telfonPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Email              : " + emailPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Tanggal Acara      : "+ tanggalAcara + "\t\t\t\t || \n");
                                            System.out.print("|| Jangka Peminjaman  : "+ jangkaPeminjaman + "\t\t\t\t || \n");
                                            System.out.print("|| Pembayaran         : DP 30% \t\t\t\t || \n");
                                            System.out.print("|| Jumlah Pembayaran  : " + totalPembayaran + "\t\t\t\t || \n");
                                            System.out.println("==========================================================");
                                            break;
                                        default:
                                            while (option >=3) {
                                                System.out.println("Coba Lagi!");
                                            }
                                        }
                            }
                case 3: 
                    System.out.print("Sebagai pengguna Internal atau Umum: ");
                    penyewa = in.next();
                        
                    if (penyewa.equals(pengguna)) {
                            System.out.print("Pengisian Data");
                            penyewa = in.next();
                        } 
                        System.out.println("Apakah anda Tenaga Kependidikan Polinema (Y/N)");
                        penggunaInternalTendik = in.next();
                        penggunaInternalTendik = benar ? "Y" : "N";
                        System.out.println("Apakah anda Pegawai Polinema? (Y/N) ");
                        penggunaInternalPegawai = in.next();
                        penggunaInternalPegawai = benar ? "Y" : "N";
                    
                          
                        if (penggunaInternalTendik.equalsIgnoreCase("y") || penggunaInternalPegawai.equalsIgnoreCase("y")) {
                                System.out.println("Lengkapi Data Berikut: ");
                                System.out.print("Nama              : ");
                                namaPengguna = in.next();
                                System.out.print("Alamat            : ");
                                alamatPengguna = in.next();
                                System.out.print("No Telepon        : ");
                                telfonPengguna = in.next();
                                System.out.print("Email             : ");
                                emailPengguna = in.next();
                                System.out.print("Tanggal Acara     : ");
                                tanggalAcara = in.next();
                                System.out.print("Jangka Peminjaman : ");
                                jangkaPeminjaman = in.nextInt();
                                totalPembayaran = jangkaPeminjaman * GAudit* 10 / 100;
                                System.out.println("Tarif: ");
                                System.out.println("1. DP 30%");
                                System.out.println("2. Lunas");
                                option = in.nextInt();
                                    switch (option) {
                                        case 1:
                                        totalPembayaran = totalPembayaran - 30 / 100;
                                            System.out.println("========================= Invoice ==========================");
                                            System.out.print("|| Nama               : " + namaPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Alamat             : " + alamatPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| No Telepon         : " + telfonPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Email              : " + emailPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Tanggal Acara      : "+ tanggalAcara + "\t\t\t\t || \n");
                                            System.out.print("|| Jangka Peminjaman  : "+ jangkaPeminjaman + "\t\t\t\t || \n");
                                            System.out.print("|| Pembayaran         : DP 30% \t\t\t\t || \n");
                                            System.out.print("|| Jumlah Pembayaran  : " + totalPembayaran + "\t\t\t\t || \n");
                                            System.out.println("===========================================================");
                                            break;
                                        case 2:
                                            System.out.println("========================= Invoice =========================");
                                            System.out.print("|| Nama               : " + namaPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Alamat             : " + alamatPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| No Telepon         : " + telfonPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Email              : " + emailPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Tanggal Acara      : "+ tanggalAcara + "\t\t\t\t || \n");
                                            System.out.print("|| Jangka Peminjaman  : "+ jangkaPeminjaman + "\t\t\t\t || \n");
                                            System.out.print("|| Pembayaran         : DP 30% \t\t\t\t || \n");
                                            System.out.print("|| Jumlah Pembayaran  : " + totalPembayaran + "\t\t\t\t || \n");
                                            System.out.println("==========================================================");
                                            break;
                                        default:
                                            while (option >=3) {
                                                System.out.println("Coba Lagi!");
                                            }
                                        }
                        }else{ 
                                System.out.println("Lengkapi Data Berikut: ");
                                System.out.print("Nama              : ");
                                namaPengguna = in.next();
                                System.out.print("Alamat            : ");
                                alamatPengguna = in.next();
                                System.out.print("No Telepon        : ");
                                telfonPengguna = in.next();
                                System.out.print("Email             : ");
                                emailPengguna = in.next();
                                System.out.print("Tanggal Acara     : ");
                                tanggalAcara = in.next();
                                System.out.print("Jangka Peminjaman : ");
                                jangkaPeminjaman = in.nextInt();
                                totalPembayaran = jangkaPeminjaman * GAudit;
                                System.out.println("Tarif: ");
                                System.out.println("1. DP 30%");
                                System.out.println("2. Lunas");
                                option = in.nextInt();
                                    switch (option) {
                                        case 1:
                                        totalPembayaran = totalPembayaran - 30 / 100;
                                            System.out.println("========================= Invoice ==========================");
                                            System.out.print("|| Nama               : " + namaPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Alamat             : " + alamatPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| No Telepon         : " + telfonPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Email              : " + emailPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Tanggal Acara      : "+ tanggalAcara + "\t\t\t\t || \n");
                                            System.out.print("|| Jangka Peminjaman  : "+ jangkaPeminjaman + "\t\t\t\t || \n");
                                            System.out.print("|| Pembayaran         : DP 30% \t\t\t\t || \n");
                                            System.out.print("|| Jumlah Pembayaran  : " + totalPembayaran + "\t\t\t\t || \n");
                                            System.out.println("===========================================================");
                                            break;
                                        case 2:
                                            System.out.println("========================= Invoice =========================");
                                            System.out.print("|| Nama               : " + namaPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Alamat             : " + alamatPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| No Telepon         : " + telfonPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Email              : " + emailPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Tanggal Acara      : "+ tanggalAcara + "\t\t\t\t || \n");
                                            System.out.print("|| Jangka Peminjaman  : "+ jangkaPeminjaman + "\t\t\t\t || \n");
                                            System.out.print("|| Pembayaran         : DP 30% \t\t\t\t || \n");
                                            System.out.print("|| Jumlah Pembayaran  : " + totalPembayaran + "\t\t\t\t || \n");
                                            System.out.println("==========================================================");
                                            break;
                                        default:
                                            while (option >=3) {
                                                System.out.println("Coba Lagi!");
                                            }
                                        }
                            }
                case 4: 
                    System.out.print("Sebagai pengguna Internal atau Umum: ");
                    penyewa = in.next();
                        
                    if (penyewa.equals(pengguna)) {
                            System.out.print("Pengisian Data");
                            penyewa = in.next();
                        } 
                        System.out.println("Apakah anda Tenaga Kependidikan Polinema (y/n)");
                        penggunaInternalTendik = in.next();
                        penggunaInternalTendik = benar ? "Y" : "N";
                        System.out.println("Apakah anda Pegawai Polinema? (y/n) ");
                        penggunaInternalPegawai = in.next();
                        penggunaInternalPegawai = benar ? "y" : "n";
                    
                          
                        if (penggunaInternalTendik.equalsIgnoreCase("y") || penggunaInternalPegawai.equalsIgnoreCase("y")) {
                                System.out.println("Lengkapi Data Berikut: ");
                                System.out.println();
                                System.out.print("Nama              : ");
                                namaPengguna = in.next();
                                System.out.print("Alamat            : ");
                                alamatPengguna = in.next();
                                System.out.print("No Telepon        : ");
                                telfonPengguna = in.next();
                                System.out.print("Email             : ");
                                emailPengguna = in.next();
                                System.out.print("Tanggal Acara     : ");
                                tanggalAcara = in.next();
                                System.out.print("Jangka Peminjaman : ");
                                jangkaPeminjaman = in.nextInt();
                                totalPembayaran = jangkaPeminjaman * GTheater * 10 / 100;
                                System.out.println("Tarif: ");
                                System.out.println("1. DP 30%");
                                System.out.println("2. Lunas");
                                option = in.nextInt();
                                    switch (option) {
                                        case 1:
                                        totalPembayaran = totalPembayaran - 30 / 100;
                                            System.out.println("========================= Invoice ==========================");
                                            System.out.print("|| Nama               : " + namaPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Alamat             : " + alamatPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| No Telepon         : " + telfonPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Email              : " + emailPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Tanggal Acara      : "+ tanggalAcara + "\t\t\t\t || \n");
                                            System.out.print("|| Jangka Peminjaman  : "+ jangkaPeminjaman + "\t\t\t\t || \n");
                                            System.out.print("|| Pembayaran         : DP 30% \t\t\t\t || \n");
                                            System.out.print("|| Jumlah Pembayaran  : " + totalPembayaran + "\t\t\t\t || \n");
                                            System.out.println("===========================================================");
                                            break;
                                        case 2:
                                            System.out.println("========================= Invoice =========================");
                                            System.out.print("|| Nama               : " + namaPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Alamat             : " + alamatPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| No Telepon         : " + telfonPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Email              : " + emailPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Tanggal Acara      : "+ tanggalAcara + "\t\t\t\t || \n");
                                            System.out.print("|| Jangka Peminjaman  : "+ jangkaPeminjaman + "\t\t\t\t || \n");
                                            System.out.print("|| Pembayaran         : DP 30% \t\t\t\t || \n");
                                            System.out.print("|| Jumlah Pembayaran  : " + totalPembayaran + "\t\t\t\t || \n");
                                            System.out.println("==========================================================");
                                            break;
                                        default:
                                            while (option >=3) {
                                                System.out.println("Coba Lagi!");
                                            }
                                        }
                        }else{ 
                                System.out.println("Lengkapi Data Berikut: ");
                                System.out.print("Nama              : ");
                                namaPengguna = in.next();
                                System.out.print("Alamat            : ");
                                alamatPengguna = in.next();
                                System.out.print("No Telepon        : ");
                                telfonPengguna = in.next();
                                System.out.print("Email             : ");
                                emailPengguna = in.next();
                                System.out.print("Tanggal Acara     : ");
                                tanggalAcara = in.next();
                                System.out.print("Jangka Peminjaman : ");
                                jangkaPeminjaman = in.nextInt();
                                totalPembayaran = jangkaPeminjaman * GTheater;
                                System.out.println("Tarif: ");
                                System.out.println("1. DP 30%");
                                System.out.println("2. Lunas");
                                option = in.nextInt();
                                    switch (option) {
                                        case 1:
                                        totalPembayaran = totalPembayaran - 30 / 100;
                                            System.out.println("========================= Invoice ==========================");
                                            System.out.print("|| Nama               : " + namaPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Alamat             : " + alamatPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| No Telepon         : " + telfonPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Email              : " + emailPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Tanggal Acara      : "+ tanggalAcara + "\t\t\t\t || \n");
                                            System.out.print("|| Jangka Peminjaman  : "+ jangkaPeminjaman + "\t\t\t\t || \n");
                                            System.out.print("|| Pembayaran         : DP 30% \t\t\t\t || \n");
                                            System.out.print("|| Jumlah Pembayaran  : " + totalPembayaran + "\t\t\t\t || \n");
                                            System.out.println("===========================================================");
                                            break;
                                        case 2:
                                            System.out.println("========================= Invoice =========================");
                                            System.out.print("|| Nama               : " + namaPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Alamat             : " + alamatPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| No Telepon         : " + telfonPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Email              : " + emailPengguna + "\t\t\t\t || \n");
                                            System.out.print("|| Tanggal Acara      : "+ tanggalAcara + "\t\t\t\t || \n");
                                            System.out.print("|| Jangka Peminjaman  : "+ jangkaPeminjaman + "\t\t\t\t || \n");
                                            System.out.print("|| Pembayaran         : DP 30% \t\t\t\t || \n");
                                            System.out.print("|| Jumlah Pembayaran  : " + totalPembayaran + "\t\t\t\t || \n");
                                            System.out.println("==========================================================");
                                            break;
                                        default:
                                            while (option >=3) {
                                                System.out.println("Coba Lagi!");
                                            }
                                        }
                            }
 
            }
    }   
}