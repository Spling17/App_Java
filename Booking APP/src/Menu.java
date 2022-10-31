import java.util.Scanner;

public class Menu {
  
  void showMenu(){
    char option;
    try (Scanner input = new Scanner(System.in)) {

        Booking bk = new Booking();
        
        do{
            System.out.println("\n" + 
                "=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n"+
                "Select an Option from the Menu\n"+ "\n" +
                "A: Make a Reservation\n"+
                "B: Check your Reservation\n"+
                "C: Cansell your Reservation\n"+
                "D: Quit\n"+
                "=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*"
            );
            option = input.next().charAt(0); // [a]sdasdads sgasgagsasf

            Booking booking = new Booking();
            
            APP.clrscr();
            switch (Character.toLowerCase(option)) {

                case 'a':
                booking.makeReservation();
                break;
                
                case 'b':
                // if(bk.getAllBookingData().size() > 0) {
                    System.out.println("Check");
                    booking.checkReservation();
                // } else {
                    // System.out.println("There are currently NO Reservations");
                // }
                break;
                
                case 'c':

                // if(bk.getAllBookingData().size() > 0) {
                    System.out.println("Cancel");
                    booking.cancelReservation();
                // } else {
                //     System.out.println("There are currently NO Reservations");
                // }
                break;
                
                case 'd':
                System.out.println("========================================================");
                System.out.println("Thank you!!");
                System.out.println("========================================================");
                break;
                
                default:
                System.out.println("*******************! Invalid option !*******************" +
                                   "\n Please Enter an alphabet from [A] to [D]");
                break;
                }
        } while (Character.toLowerCase(option) != 'd');

            System.exit(0);
            input.close();
        }
 }
}


