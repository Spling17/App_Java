import java.io.IOException;
import java.util.Scanner;

public class APP {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            //assumption that a user has already been created
            Menu login = new Menu();
            ID loginId = new ID("haru", "1234");

            System.out.println("=================================");
            System.out.println("Welcome to ABC reservation system");
            System.out.println("=================================");
            
            while(true){
                clrscr();
                System.out.println("Please enter your ID");
                String id = input.nextLine();
                System.out.println("Please enter your password");
                String pass = input.nextLine();

                if(id.equals(loginId.getId()) && pass.equals(loginId.getPass())){
                    System.out.println("Welcome, " + id);
                    break;
                }

                System.out.println("Invalid credentials\nPress [enter] key to try again or press [Q] to quit");

                if(input.nextLine().toLowerCase().equals("q")){
                    System.out.println("Thank you!");
                    System.exit(0);
                }
            }

            // call show menu
            clrscr(); //x
            login.showMenu();
        }
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
