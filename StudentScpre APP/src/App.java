import java.io.IOException;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        SchoolAccount account = new SchoolAccount("KabarondoB", "1234");

        System.out.println("====================================");
        System.out.println("Welcome to School Management System");
        System.out.println("====================================");

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter 'School Name'");
            String school = scan.nextLine();
            System.out.println("Please enter 'Password'");
            String pass = scan.nextLine();

            if (school.equals(account.getSchoolName()) &&
                    pass.equals(account.getPassword())) {
                System.out.println("Welcome, " + school);
                break;
            } else {
                clrscr();
                System.out.println("Wrong School Name or password.\nTry again.");
            }
        }
        clrscr();
        Menu.showMenu(); //listofteachers
        scan.close();
    }


    public static void clrscr(){
		//Clears Screen in java
		try {
			if (System.getProperty("os.name").contains("Windows"))
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			else
				Runtime.getRuntime().exec("clear");
				System.out.print("\033\143");
		} catch (IOException | InterruptedException ex) {}
	}

}