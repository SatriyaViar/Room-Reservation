import java.time.Month;
import java.util.Scanner;

import javax.swing.text.html.Option;

/**
 * RoomReservationBreach2
 */
public class RoomReservationBreach2 {
    static Scanner in = new Scanner(System.in);

    // FOR FORM INPUT AND OUTPUT
    static String userName = "";
    static String userAddress = "";
    static Long phoneUser;
    static String emailUser = "";
    static String borrowDate = "";
    static int loamTerm = 0;
    static String resultForm[] = { userName, userAddress, emailUser, borrowDate };

    // Available
    static String[] January = { "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "10", "16", "17", "18", "19", "20" };
    static boolean isJanuary = true;

    static String[] Febuary = { "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", };
    static boolean isFebuary = true;

    static String[] March = { "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "10", "11", "12", "13", "14", "15" };
    static boolean isMarch = true;

    static String[] April = { "20", "21", "23", "24", "25", "26", "27", "28", "29", "30", "31", };
    static boolean isApril = true;

    static String[] May = { "20", "21", "23", "24", "25", "26", "27", "28", "29", "30", "31", };
    static boolean isMay = true;

    static String[] June = { "17", "18", "19", "20", "21", "23", "24", "25", "26", "27", "28", "29", "30", "31", };
    static boolean isJune = true;

    static String[] July = { "26", "27", "28", "29", "30", "31", };
    static boolean isJuly = true;

    static String[] August = { "16", "17", "18", "19", "20", "21", "23", "24", "25", "26", "27", "28", "29", "30",
            "31", };
    static boolean isAugust = true;

    static String[] September = { "25", "26", "27", "28", "29", "30", "31", };
    static boolean isSeptember = true;

    static String[] October = { "21", "23", "24", "25", "26", "27", "28", "29", "30", "31", };
    static boolean isOctober = true;

    static String[] November = { "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", };
    static boolean isNovember = true;

    static String[] December = { "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "23", "24" };
    static boolean isDesember = true;

    // FOR INPUT PERSONAL DATA
    public static String[] dataPersonal(Scanner input) {
        System.out.println("====================================");
        System.out.println("| Complete The Following Data       |");
        System.out.print("| Name: ");
        userName = in.next();
        System.out.print("| Address: ");
        userAddress = in.next();

        // THE PHONE NUMBER LENGTH MUST 11 or 13
        String convertPhoneuser;
        do {
            System.out.print("| Phone Number : ");
            phoneUser = in.nextLong();
            convertPhoneuser = String.valueOf(phoneUser);
            if (convertPhoneuser.length() <= 10 || convertPhoneuser.length() >= 14) {
                System.out.println("Your Phone Number Invalid!");
            } else {
                break;
            }
        } while (convertPhoneuser.length() <= 11 || convertPhoneuser.length() >= 13);

        // THE INPUT GMAIL MUST WITH @GMAIL.COM
        do {
            System.out.print("| Email : ");
            emailUser = in.next();
            if (emailUser.endsWith("@gmail.com")) {
                continue;
            } else {
                System.out.println("| Format email must *youremail@gmail.com");
            }
        } while (!emailUser.endsWith("@gmail.com"));
        System.out.print("| Loam Term: ");
        loamTerm = in.nextInt();

        String resultForm[] = { userName, userAddress, emailUser, borrowDate };
        return resultForm;
    }

    // FOR INPUT FORM
    public static String[] FormInternal(Scanner input) {
        System.out.println("====================================");
        System.out.println("| Complete The Following Data       |");
        System.out.print("| Name: ");
        userName = in.next();
        System.out.print("| Address: ");
        userAddress = in.next();

        // THE PHONE NUMBER LENGTH MUST 11 or 13
        String convertPhoneuser;
        do {
            System.out.print("| Phone Number : ");
            phoneUser = in.nextLong();
            convertPhoneuser = String.valueOf(phoneUser);
            if (convertPhoneuser.length() <= 10 || convertPhoneuser.length() >= 14) {
                System.out.println("Your Phone Number Invalid!");
            } else {
                break;
            }
        } while (convertPhoneuser.length() <= 10 || convertPhoneuser.length() >= 14);

        // THE INPUT GMAIL MUST WITH @GMAIL.COM
        do {
            System.out.print("| Email : ");
            emailUser = in.next();
            if (emailUser.endsWith("@gmail.com")) {
                continue;
            } else {
                System.out.println("| Format email must *youremail@gmail.com");
            }
        } while (!emailUser.endsWith("@gmail.com"));
        System.out.print("| Room Borrowing date: ");
        borrowDate = in.nextLine();
        in.nextLine();
        rulesDate(borrowDate);
        System.out.print("| Loam Term: ");
        loamTerm = in.nextInt();

        String resultForm[] = { userName, userAddress, emailUser, /* borrowDate */ };
        return resultForm;
    }

    public static void PrintForm(String[] resultForm) {
        String[] label = { "| Name: ", "| Alamat: ", "| Email: ", "| Tanggal Acara: " };
        System.out.println("============================================");
        System.out.println("||            Form Room Reservation       ||");
        System.out.println("============================================");
        for (int i = 0; i < label.length; i++) {
            if (i == 2) {
                System.out.println("| Phone Number: " + phoneUser);
            }
            System.out.println(label[i] + resultForm[i]);
            System.out.println("============================================");
        }
        System.out.println("| Loam Term:  " + loamTerm + " Days");
        System.out.println();
        System.out.println();
    }

    // BUILDING GRAHA POLINEMA *
    public static void grahaPolinema() {
        System.out.println(
                "============================================================================================");
        System.out.println(
                "|| Open Space (Indoor) is very suitable for activities during the day and night\n Such as: \n *Concerts\n *Wedding Receptions\n *Socialization\n *Tasyakuran\n *etc.");
        System.out.println(
                "============================================================================================");
        System.out.println(
                "|| Facilities:                                                                            ||");
        System.out.println(
                "============================================================================================");
        System.out.println(
                "|| * Load 400 People.                                                                     ||");
        System.out.println(
                "|| * 200 Pieces Chair Without Cover.                                                      ||");
        System.out.println(
                "|| * Sound System (Stand)                                                                 ||");
        System.out.println(
                "|| * Parking Lot.                                                                         ||");
        System.out.println(
                "|| * 50,000 watts of electricity.                                                         ||");
        System.out.println(
                "|| * Floor Carpet                                                                         ||");
        System.out.println(
                "|| * Security                                                                             ||");
        System.out.println(
                "============================================================================================");
        System.out.println("                       Price: IDR Rp 5.000.000,00 / day                          ");
        System.out.println(
                "============================================================================================");
    }

    // BUILDING AULA PERTAMINA *
    public static void buildingAulaPertamina() {
        System.out.println(
                "=============================================================================================");
        System.out.println(
                "|| Open Space (Indoor) is very suitable for activities that are performances during the day \n|| such as: \n|| *Theater\n|| *Bazaar\n|| *Outdoor Receptions\n|| *Socialization\n|| *Celebrations\n|| *Etc.");
        System.out.println(
                "=============================================================================================");
        System.out.println(
                "|| Facilities:                                                                             ||");
        System.out.println(
                "|| * Load until 300 or more People.                                                        ||");
        System.out.println(
                "|| * 300 Pieces Chair Without Cover.                                                       ||");
        System.out.println(
                "|| * Permanent Stage (14m x 4m).                                                           ||");
        System.out.println(
                "|| * Sound System (2 Speaker Stand and Mixer).                                             ||");
        System.out.println(
                "|| * Generator set 500 Kva                                                                 ||");
        System.out.println(
                "|| * Floor Carpet                                                                          ||");
        System.out.println(
                "|| * Slide Proyektor                                                                       ||");
        System.out.println(
                "|| * Parking Lot                                                                           ||");
        System.out.println(
                "|| * Change Room                                                                           ||");
        System.out.println(
                "|| * Security                                                                              ||");
        System.out.println(
                "=============================================================================================");
        System.out.println(
                "                            Price: IDR Rp 4.500.000,00 / day                                 ");
        System.out.println(
                "=============================================================================================");
    }

    // buildingGrahaTeather *
    public static void buildingAuditorium() {
        System.out.println(
                "=============================================================================================");
        System.out.println(
                "|| Indoor is very suitable for activities that are performances during the day \n|| such as: \n|| *Theater\n|| *Socialization\n|| *Celebrations\n || Awarding \n|| *Etc.");
        System.out.println(
                "=============================================================================================");
        System.out.println(
                "|| Facilities:                                                                             ||");
        System.out.println(
                "|| * Load 320 People.                                                                      ||");
        System.out.println(
                "|| * Permanent Seating With Portable Table.                                                ||");
        System.out.println(
                "|| * Permanent Stage.                                                                      ||");
        System.out.println(
                "|| * Sound System.                                                                         ||");
        System.out.println(
                "|| * Indoor Room With AC                                                                       ||");
        System.out.println(
                "|| * 2 WallScreen                                                                              ||");
        System.out.println(
                "|| * Slide Proyektor                                                            |              |");
        System.out.println(
                "=============================================================================================");
        System.out.println(
                "                            Price: IDR Rp 4.000.000,00 / day                                 ");
        System.out.println(
                "=============================================================================================");
    }

    // BUILDING GRAHA TEATER *
    public static void buildingGrahaTeather() {
        System.out.println(
                "=============================================================================================");
        System.out.println(
                "|| Open Space (outdoor) is very suitable for activities that are performances during the day \n|| such as: \n|| *Theater\n|| *Socialization\n|| *Celebrations\n || Awarding \n|| *Etc.");
        System.out.println(
                "=============================================================================================");
        System.out.println(
                "|| Facilities:                                                                             ||");
        System.out.println(
                "|| * Permanent Seating.                                                                    ||");
        System.out.println(
                "|| * Permanent Stage.                                                                      ||");
        System.out.println(
                "|| * Sound System.                                                                         ||");
        System.out.println(
                "=============================================================================================");
        System.out.println(
                "                            Price: IDR Rp 3.000.000,00 / day                                 ");
        System.out.println(
                "=============================================================================================");
    }
    public static void termAndCondition(){
        System.out.println("============================================================================================================================================================");
        System.out.println("|| Terms and conditions:\n" + //
                "|| 1. Fill out the form/statement provided.\n" + //
                "|| 2. Follow all regulations set by the management. \n" + //                
                "|| 3. Make rental payments by transfer to the appointed bank.\n" + //              
                "|| 4. The deposit must be paid at least 30% of the total rental fee no later than 3 days after booking.\n" + //               
                "|| 5. Repayment of 70% of the rental fee no later than H-7 before the event.\n" + //               
                "|| 6. If there is a cancellation by the Tenant, the money that has been deposited cannot be withdrawn for any reason\n"+"||    But if there is a cancellation by the Service Provider (Politeknik Negeri Malang) The money that has been deposited will be returned 100%.\n" + //               
                "|| 7. Attach a photocopy of identity card (KTP / SIM) as much as 1 (one) sheet.");
        System.out.println("============================================================================================================================================================");
    }

    public static String BorrowingDate() {
        System.out.print("| Room Borrowing Month: ");
        borrowDate = in.nextLine();
        if (borrowDate.equalsIgnoreCase("January")) {
            System.out.println("The Building Available :");
            for (int i = 0; i < January.length; i++) {
                System.out.print("[" + January[i] + "]");
            }
        } else if (borrowDate.equalsIgnoreCase("Febuary")) {
            System.out.println("The Building Available :");
            for (int i = 0; i < Febuary.length; i++) {
                System.out.print("[" + Febuary[i] + "]");
            }
        } else if (borrowDate.equalsIgnoreCase("March")) {
            System.out.println("The Building Available :");
            for (int i = 0; i < March.length; i++) {
                System.out.print("[" + March[i] + "]");
            }
        } else if (borrowDate.equalsIgnoreCase("April")) {
            System.out.println("The Building Available :");
            for (int i = 0; i < April.length; i++) {
                System.out.print("[" + April[i] + "]");
            }
        } else if (borrowDate.equalsIgnoreCase("May")) {
            System.out.println("The Building Available :");
            for (int i = 0; i < May.length; i++) {
                System.out.print("[" + May[i] + "]");
            }
        } else if (borrowDate.equalsIgnoreCase("June")) {
            System.out.println("The Building Available :");
            for (int i = 0; i < June.length; i++) {
                System.out.print("[" + June[i] + "]");
            }
        } else if (borrowDate.equalsIgnoreCase("July")) {
            System.out.println("The Building Available :");
            for (int i = 0; i < July.length; i++) {
                System.out.print("[" + July[i] + "]");
            }
        } else if (borrowDate.equalsIgnoreCase("August")) {
            System.out.println("The Building Available :");
            for (int i = 0; i < August.length; i++) {
                System.out.print("[" + August[i] + "]");
            }
        } else if (borrowDate.equalsIgnoreCase("September")) {
            System.out.println("The Building Available :");
            for (int i = 0; i < September.length; i++) {
                System.out.print("[" + September[i] + "]");
            }
        } else if (borrowDate.equalsIgnoreCase("October")) {
            System.out.println("The Building Available :");
            for (int i = 0; i < October.length; i++) {
                System.out.print("[" + October[i] + "]");
            }
        } else if (borrowDate.equalsIgnoreCase("November")) {
            System.out.println("The Building Available :");
            for (int i = 0; i < November.length; i++) {
                System.out.print("[" + November[i] + "]");
            }
        } else if (borrowDate.equalsIgnoreCase("Desember")) {
            System.out.println("The Building Available :");
            for (int i = 0; i < December.length; i++) {
                System.out.print("[" + December[i] + "]");
            }
        }

        return borrowDate;
    }

    public static String rulesDate(String borrowDate) {
        if (borrowDate.equalsIgnoreCase("january")) {
        for (int i = 0; i < January.length; i++) {
            if (January.equals(January[i])) {
                isJanuary = true;
                break;
            }
        }
        if (isJanuary) {
            System.out.println("Building Available");  
        } else {
            System.out.println("Room not available or your selection is invalid");
            System.out.println("TRY AGAIN!");
        }
        }

        for (int J = 0; J < Febuary.length; J++) {
            if (Febuary.equals((Febuary[J]))) {
                isFebuary = true;
                break;
            }
        }
        if (isFebuary) {
            System.out.println("Building Available");
        }else {
            System.out.println("Room not available or your selection is invalid");
            System.out.println("TRY AGAIN!");
        }
        return borrowDate;
    }

    public static String seeOtherMonth(){
        System.out.println("want To see Another Month? (y/n)");
        String optionMonth = in.nextLine();
            do {
                BorrowingDate();
            } while (optionMonth.equalsIgnoreCase("y"));
        return optionMonth;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Sing Up / Login
        Boolean singUp = false;
        Boolean login = false;
        String idAdmin = "admin";
        String passAdmin = "admin";
        String user = "";
        String Pass = "";
        String passRepeat = Pass;
        int tenant;

        // for recipt
        int GGraha = 5000000;
        int discGraha = 0;
        int GPertamina = 4500000;
        int discPertamina = 0;
        int GAudit = 4000000;
        int discAudit = 0;
        int GTheater = 3000000;
        int discTheater = 0;
        int chair = 1000;

        // Pemilihan
        int option;
        int optionMenu;
        String optionTendik;

        // Start
        System.out.println("======================================================");
        System.out.println("    Welcome to Polinema Room Reservation Platform     ");
        System.out.println("======================================================");
        System.out.println();
        System.out.println();
        System.out.println("Type ( 1 ) To SingUp If don't Have an Account");
        System.out.println("Type ( 2 ) To Login If already Have an Account");
        System.out.println();
        System.out.print("Chosse: ");
        option = in.nextInt();

        // Login SingUp ID Password
        switch (option) {
            case 1:
                do {
                    System.out.println("------------------");
                    System.out.print("Username : ");
                    user = in.next();
                    System.out.print("Password : ");
                    Pass = in.next();
                    System.out.print("Repeat Password  : ");
                    passRepeat = in.next();
                    System.out.println("---------------------");

                    if (Pass.equals(passRepeat)) {
                        singUp = true;
                        break;
                    } else {
                        System.out.println("Password is not same. Try Again!");
                    }
                } while (!singUp); {
                System.out.println("SingUp Success ");
            }

                do {
                    System.out.print("Username : ");
                    user = in.next();
                    System.out.print("Password : ");
                    Pass = in.next();

                    if (user.equals(user) && Pass.equals(passRepeat)) {
                        login = true;
                    } else {
                        System.out.println("Incorrect Username and Password");
                        System.out.println("Try Again!");
                    }
                } while (!login); {
                System.out.println("Login Success");
            }
                break;

            case 2:
                do {
                    System.out.println("------------------");
                    System.out.print("Username : ");
                    user = in.next();
                    System.out.print("Password : ");
                    Pass = in.next();
                    System.out.println("------------------");

                    if (user.equals(idAdmin) && Pass.equals(passAdmin)) {
                        login = true;
                    } else {
                        System.out.println("Incorrect Username and Password");
                        System.out.println("Try Again!");
                    }
                } while (!login); {
                System.out.println("Login Success");
            }
                break;
        }

        while (true) {
            System.out.println("=================================================================");
            System.out.println("||          Welcome to the Room Reservation Platform           ||");
            System.out.println("||                        JTI POLINEMA                         ||");
            System.out.println("=================================================================");
            System.out.println("|               Polinema Room Reservation Menu                  |");
            System.out.println("|_______________________________________________________________|");
            System.out.println("|1. List of Buildings and Rooms that can be rented at Polinema  |");
            System.out.println("|2. Terms and Conditions                                        |");
            System.out.println("|3. Input Personal Data                                         |");
            System.out.println("|4. Print Recipt                                                |");
            System.out.println("|5. Exit                                                        |");
            System.out.println("=================================================================");
            System.out.println();
            System.out.print("Choose Menu: ");
            optionMenu = in.nextInt();

            switch (optionMenu) {
                case 1:
                    do {
                        System.out.println("======================================================");
                        System.out.println("              List Building On Polinema               ");
                        System.out.println("======================================================");
                        System.out.println("|1. Building Graha Polinema                          |");
                        System.out.println("|2. Building Aula Pertamina                          |");
                        System.out.println("|3. buildingGrahaTeather Civil Engineering 8th Floor |");
                        System.out.println("|4. Building Graha Teater                            |");
                        System.out.println("|5. Return to Main Menu                              |");
                        System.out.println("======================================================");
                        System.out.print("Choose: ");
                        option = in.nextInt();
                        switch (option) {
                            case 1:
                                do {
                                    grahaPolinema();
                                    System.out.println();
                                    System.out.println("====================================");
                                    System.out.println("|| 1. Back To List Building       ||");
                                    System.out.println("|| 2. Exit                        ||");
                                    System.out.println("====================================");
                                    System.out.print("  || Choose: ");
                                    option = in.nextInt();
                                    if (option == 1) {
                                        continue;
                                    } else if (option == 2) {
                                        System.exit(0);
                                    } else {
                                        System.out.println("You entered the wrong number, Try Again!");
                                        System.out.println();
                                    }
                                } while (option != 1);
                                break;

                            case 2:
                                do {
                                    buildingAulaPertamina();
                                    System.out.println();
                                    System.out.println("====================================");
                                    System.out.println("|| 1. Back To List Building       ||");
                                    System.out.println("|| 2. Exit                        ||");
                                    System.out.println("====================================");
                                    System.out.print("  || Choose: ");
                                    option = in.nextInt();
                                    if (option == 1) {
                                        continue;
                                    } else if (option == 2) {
                                        System.exit(0);
                                    } else {
                                        System.out.println("You entered the wrong number, Try Again!");
                                        System.out.println();
                                    }
                                } while (option != 1);
                                break;

                            case 3:
                                do {
                                    System.out.println();
                                    System.out.println("====================================");
                                    System.out.println("|| 1. Back To List Building       ||");

                                    System.out.println("|| 2. Exit                        ||");
                                    System.out.println("====================================");
                                    System.out.print("  || Choose: ");
                                    option = in.nextInt();
                                    if (option == 1) {
                                        continue;
                                    } else if (option == 2) {
                                        System.exit(0);
                                    } else {
                                        System.out.println("You entered the wrong number, Try Again!");
                                        System.out.println();
                                    }
                                } while (option != 1);
                                break;
                            case 4:
                                do {
                                    buildingGrahaTeather();
                                    System.out.println();
                                    System.out.println("====================================");
                                    System.out.println("|| 1. Back To List Building       ||");

                                    System.out.println("|| 2. Exit                        ||");
                                    System.out.println("====================================");
                                    System.out.print("  || Choose: ");
                                    option = in.nextInt();
                                    if (option == 1) {
                                        continue;
                                    } else if (option == 2) {
                                        System.exit(0);
                                    } else {
                                        System.out.println("You entered the wrong number, Try Again!");
                                        System.out.println();
                                    }
                                } while (option != 1);
                                break;
                            case 5:
                                continue;
                            default:
                                System.out.println("The number you entered is wrong Try Again!");
                                System.out.println();
                        }
                    } while (option != 5);
                    break;
                case 2:
                    do {
                        termAndCondition();
                        System.out.println();
                        System.out.println("1. Return to Main Menu");
                        System.out.println("2. Exit");
                        System.out.println("==========================");
                        System.out.print("Choose: ");
                        option = in.nextInt();
                        if (option == 1) {
                            continue;
                        }
                        if (option == 2) {
                            System.exit(0);
                        } else {
                            System.out.println("The number you entered is wrong Try Again!");
                            System.out.println();
                        }
                    } while (option != 1);
                    break;
                case 3:
                    do {
                        System.out.println("======================================================");
                        System.out.println("|1. Building Graha Polinema                          |");
                        System.out.println("|2. Building Aula Pertamina                          |");
                        System.out.println("|3. buildingGrahaTeather Civil Engineering 8th Floor |");
                        System.out.println("|4. Building Graha Teater                            |");
                        System.out.println("|5. Return to Main Menu                              |");
                        System.out.println("======================================================");
                        System.out.println("What You What To Reservation? ");
                        System.out.print("Choose: ");
                        option = in.nextInt();
                        switch (option) {
                            case 1:
                                BorrowingDate();
                                seeOtherMonth();
                                // String optionMonth = in.nextLine();

                                // do {
                                // BorrowingDate();
                                // System.out.println();
                                // }while (optionMonth.equalsIgnoreCase("y")); 
                                    
                                System.out.println("User: ");
                                System.out.println("1. Internal");
                                System.out.println("2. General");
                                System.out.println("3. Return To The Main Menu");
                                System.out.println();
                                System.out.print("Choose: ");
                                tenant = in.nextInt();
                                if (tenant == 1) {
                                    resultForm = FormInternal(in);
                                    
                                    System.out.print("| Loam Term: ");
                                    loamTerm = in.nextInt();
                                    break;
                                } else if (tenant == 2) {
                                    resultForm = FormInternal(in);
                                    do {
                                        System.out.println("Are you a Polinemaa employee or educator? (y/n)");
                                        optionTendik = in.next();
                                        if (optionTendik.equalsIgnoreCase("y")) {
                                            System.out.println("Enter your NIP : ");

                                            // lENGTH *NIP* MUST 18
                                            String convertNIP;
                                            do {
                                                long NIP = in.nextLong();
                                                convertNIP = String.valueOf(NIP);
                                                if (convertNIP.length() == 18) {
                                                    System.out.println("You Have A Discount 30% ");
                                                    discGraha = GGraha - 30*100;

                                                } else {
                                                    System.out.println(
                                                            "The NIP You Entered Is Wrong Or Missing Try Again!");
                                                    System.out.println("Enter your NIP: ");
                                                }
                                            } while (convertNIP.length() != 18);
                                            System.out.println("");
                                            break;
                                        } else {
                                            System.out.println();
                                            System.out.println("Thank You for Filling Out the Form ");
                                            System.out.println("Back To Print The Recipt");
                                            System.out.println();
                                            continue;
                                        }
                                    } while (!optionTendik.equalsIgnoreCase("y")
                                            && !optionTendik.equalsIgnoreCase("n"));
                                    System.exit(0);
                                }
                                break;
                            case 2:
                                BorrowingDate();
                                System.out.println();
                                System.out.println("User: ");
                                System.out.println("1. Internal");
                                System.out.println("2. General");
                                System.out.println("3. Return To The Main Menu");
                                System.out.println();
                                System.out.print("Choose: ");
                                tenant = in.nextInt();
                                if (tenant == 1) {
                                    resultForm = FormInternal(in);
                            
                                    System.out.print("| Loam Term: ");
                                    loamTerm = in.nextInt();
                                    break;
                                } else if (tenant == 2) {
                                    resultForm = FormInternal(in);
                                    do {
                                        System.out.println("Are you a Polinemaa employee or educator? (y/n)");
                                        optionTendik = in.next();
                                        if (optionTendik.equalsIgnoreCase("y")) {
                                            System.out.println("Enter your NIP : ");

                                            // lENGTH *NIP* MUST 18
                                            String convertNIP;
                                            do {
                                                long NIP = in.nextLong();
                                                convertNIP = String.valueOf(NIP);
                                                if (convertNIP.length() == 18) {
                                                    System.out.println("You Have A Discount 30% ");
                                                    discPertamina = GPertamina - (30 * 100);
                                                } else {
                                                    System.out.println(
                                                            "The NIP You Entered Is Wrong Or Missing Try Again!");
                                                    System.out.println("Enter your NIP: ");
                                                }
                                            } while (convertNIP.length() != 18);
                                            System.out.println("");
                                            break;
                                        } else {
                                            System.out.println();
                                            System.out.println("TThank You for Filling Out the Form ");
                                            System.out.println("Back To Print The Recipt");
                                            System.out.println();
                                            continue;
                                        }
                                    } while (!optionTendik.equalsIgnoreCase("y")
                                            && !optionTendik.equalsIgnoreCase("n"));
                                    System.exit(0);
                                }
                            case 3:
                            BorrowingDate();
                                System.out.println();
                                System.out.println("User: ");
                                System.out.println("1. Internal");
                                System.out.println("2. General");
                                System.out.println("3. Return To The Main Menu");
                                System.out.println();
                                System.out.print("Choose: ");
                                tenant = in.nextInt();
                                if (tenant == 1) {
                                    resultForm = FormInternal(in);
                                    
                                    System.out.print("| Loam Term: ");
                                    loamTerm = in.nextInt();
                                    break;
                                } else if (tenant == 2) {
                                    resultForm = FormInternal(in);
                                    do {
                                        System.out.println("Are you a Polinemaa employee or educator? (y/n)");
                                        optionTendik = in.next();
                                        if (optionTendik.equalsIgnoreCase("y")) {
                                            System.out.println("Enter your NIP : ");

                                            // lENGTH *NIP* MUST 18
                                            String convertNIP;
                                            do {
                                                long NIP = in.nextLong();
                                                convertNIP = String.valueOf(NIP);
                                                if (convertNIP.length() == 18) {
                                                    System.out.println("You Have A Discount 30% ");
                                                    discAudit = GAudit - (30 * 100);
                                                } else {
                                                    System.out.println(
                                                            "The NIP You Entered Is Wrong Or Missing Try Again!");
                                                    System.out.println("Enter your NIP: ");
                                                }
                                            } while (convertNIP.length() != 18);
                                            System.out.println("");
                                            break;
                                        } else {
                                            System.out.println();
                                            System.out.println("TThank You for Filling Out the Form ");
                                            System.out.println("Back To Print The Recipt");
                                            System.out.println();
                                            continue;
                                        }
                                    } while (!optionTendik.equalsIgnoreCase("y")
                                            && !optionTendik.equalsIgnoreCase("n"));
                                    System.exit(0);
                                }
                            case 4: 
                            BorrowingDate();
                            
                                System.out.println();
                                System.out.println("User: ");
                                System.out.println("1. Internal");
                                System.out.println("2. General");
                                System.out.println("3. Return To The Main Menu");
                                System.out.println();
                                System.out.print("Choose: ");
                                tenant = in.nextInt();
                                if (tenant == 1) {
                                    resultForm = FormInternal(in);
                                    
                                    System.out.print("| Loam Term: ");
                                    loamTerm = in.nextInt();
                                    break;
                                } else if (tenant == 2) {
                                    resultForm = FormInternal(in);
                                    do {
                                        System.out.println("Are you a Polinemaa employee or educator? (y/n)");
                                        optionTendik = in.next();
                                        if (optionTendik.equalsIgnoreCase("y")) {
                                            System.out.println("Enter your NIP : ");

                                            // lENGTH *NIP* MUST 18
                                            String convertNIP;
                                            do {
                                                long NIP = in.nextLong();
                                                convertNIP = String.valueOf(NIP);
                                                if (convertNIP.length() == 18) {
                                                    System.out.println("You Have A Discount 30% ");
                                                    discTheater = GTheater - (30 * 100);
                                                } else {
                                                    System.out.println(
                                                            "The NIP You Entered Is Wrong Or Missing Try Again!");
                                                    System.out.println("Enter your NIP: ");
                                                }
                                            } while (convertNIP.length() != 18);
                                            System.out.println("");
                                            break;
                                        } else {
                                            System.out.println();
                                            System.out.println("Thank You for Filling Out the Form ");
                                            System.out.println("Back To Print The Recipt");
                                            System.out.println();
                                            continue;
                                        }
                                    } while (!optionTendik.equalsIgnoreCase("y")
                                            && !optionTendik.equalsIgnoreCase("n"));
                                    System.exit(0);
                                }
                            default:
                                break;
                        }
                        // System.out.println("User: ");
                        // System.out.println("1. Internal");
                        // System.out.println("2. General");
                        // System.out.println("3. Return To The Main Menu");
                        // System.out.println();
                        // System.out.print("Choose: ");
                        // tenant = in.nextInt();
                        // if (tenant == 1) {
                        // resultForm = FormInternal(in);
                        // break;
                        // } else if (tenant == 2) {
                        // resultForm = FormInternal(in);
                        // do {
                        // System.out.println("Are you a Polinemaa employee or educator? (y/n)");
                        // optionTendik = in.next();
                        // if (optionTendik.equalsIgnoreCase("y")) {
                        // System.out.println("Enter your NIP : ");

                        // // lENGTH *NIP* MUST 18
                        // String convertNIP;
                        // do {
                        // long NIP = in.nextLong();
                        // convertNIP = String.valueOf(NIP);
                        // if (convertNIP.length() == 18) {
                        // System.out.println("You Have A Discount 30% ");
                        // } else {
                        // System.out.println("The NIP You Entered Is Wrong Or Missing Try Again!");
                        // System.out.println("Enter your NIP: ");
                        // }
                        // } while (convertNIP.length() != 18);
                        // System.out.println("");
                        // break;
                        // } else {
                        // System.out.println();
                        // System.out.println("TThank You for Filling Out the Form ");
                        // System.out.println("Back To Print The Recipt");
                        // System.out.println();
                        // continue;
                        // }
                        // } while (!optionTendik.equalsIgnoreCase("y") &&
                        // !optionTendik.equalsIgnoreCase("n"));
                        // System.exit(0);
                        // }
                    } while (option != 5);
                    break;
                case 4:
                    PrintForm(resultForm);
                    // 6resultForm = FormInternal(in);
                    break;
                case 5:
                    PrintForm(resultForm);
                    break;
            }
        }
    }
}
