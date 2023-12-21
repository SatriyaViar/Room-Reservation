import java.util.Scanner;

public class SistemLoginID {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Boolean singUp = false; Boolean login = false; boolean penggunaGedung = false; boolean benar = true;
        String idAdmin = "admin"; String passAdmin = "admin"; String user = null; String Pass = null; String passRepeat = Pass;
        String pengguna = "Internal"; String pengguna2 = "Eksternal"; String penyewa = ""; String penggunaInternal; 
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
                System.out.print("Masukan Username : ");
                user = in.next();
                System.out.print("Masukan Password : ");
                Pass = in.next();
                    
                    if (user.equals(user) && Pass.equals(passRepeat)) {
                        login = true;
                    } else {
                        System.out.println("Username dan Password Salah");
                        System.out.println("Coba Lagi!!");
                        }break;

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
                        }break;
                } while (!login); {
                    System.out.println("Login Berhasil");
                }
                break;
            }
        }
    }  
