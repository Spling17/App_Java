import java.util.Scanner;

public class Menu {
  
  void showMenu(){
    char option;
    try (Scanner input = new Scanner(System.in)) {

        do{
            System.out.println(
                "=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=\n"+
                "Select an option from the menu\n"+
                "A: Make a Reservation\n"+
                "B: Check your Reservation\n"+
                "C: Cansell your Reservation\n"+
                "E: Quit\n"+
                "=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*="
            );
            option = input.next().charAt(0); // [a]sdasdads sgasgagsasf

            Booking booking = new Booking();

                // APP.clrscr();

                switch (Character.toLowerCase(option)) {
                    case 'a':
                        booking.makeReservation();
                        break;
                    case 'b':
                        booking.checkReservation();

                        break;
                    case 'c':
                        // キャンセル用のメソッド
                        booking.cancelReservation();
                        break;
                    default:
                        System.out.println("Invalid option. Please try again");
                        break;
                }

            } while (Character.toLowerCase(option) != 'e');

            System.out.println("Thank you for banking with us! See you again....");
            System.exit(0);
    }
 }
}


