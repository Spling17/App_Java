import java.util.*;

public class Booking {

    private static int seats = 30;
    private static ArrayList<ArrayList<String>> allBookingData = new ArrayList<>();
    private ArrayList<String> bookingTmp = new ArrayList<>();
    
    String[] times = {"5:00pm","6:00pm","7:00pm"};
    String imputTime;

    
    
    public static ArrayList<ArrayList<String>> getAllBookingData() {
      return allBookingData;
    }

    private String reserTime(){
      for(int i = 0 ; i < times.length; i++){
        System.out.println("[" + (i + 1) + "]" + times[i]);
      }
      int imputNum = scan.nextInt()-1;
      imputTime = times[imputNum];
      return imputTime;
    }

    Scanner scan = new Scanner(System.in);

    public void makeReservation() {
      try {
        System.out.println("--------------------------------------------------------");
        System.out.println("Thank you for your Reservation!");
        System.out.println("Please enter the Number of People in your Reservation");
        System.out.println("--------------------------------------------------------");
        Integer resevNum = scan.nextInt();

        if (resevNum <= seats) {
            System.out.println(resevNum + " people");
            seats -= resevNum;
            System.out.println("(* Remaining seats: " + seats + "/30)");

            System.out.println("--------------------------------------------------------");
            System.out.println("What time would you like to make Reservstion?");
            reserTime();
            System.out.println("--------------------------------------------------------");

            System.out.println("--------------------------------------------------------");
            System.out.println("Please enter your Name");
            System.out.println("--------------------------------------------------------");
            String name = scan.next();

            System.out.println("Is it correct to make a Reservation?\n" +
                                imputTime + "," + resevNum + "people, " + name);

            bookingTmp.add(name);
            String resevNumToStr = resevNum.toString();
            bookingTmp.add(resevNumToStr);
            bookingTmp.add(imputTime);

            allBookingData.add(bookingTmp);
            System.out.println("\nThank you for your Reservation!");

            System.out.println(allBookingData);
        } else {
          System.out.println("********************** Oh! Sorry! **********************\n Only " +
                            "[" + seats + "]" + " seats available left...");
        }
      } catch (Exception e) {
        System.out.println("******************! An Error occurred !******************\n" +
                           "Please enter the Correct Number");
      }
    }
    
    public void checkReservation() {
      if (allBookingData.size() > 0) {
        for (int i = 0; i < allBookingData.size(); i++) {
          System.out.println("========================================================");
          System.out.println("Reservation Number:" + "[" + (i + 1) + "]");
          System.out.println("Name: " + allBookingData.get(i).get(0) + "\n" +
          "Number of People: " + allBookingData.get(i).get(1) + "\n" +
          "Time: " + allBookingData.get(i).get(2));
          System.out.println("========================================================");
        }
        } else {
          System.out.println("There are currently NO Reservations");
          /////
        }
      }
      
      public void cancelReservation(){
        try {
          if(allBookingData.size() > 0){
          checkReservation();
          System.out.println("--------------------------------------------------------");
          System.out.println("Please enter your 'Reservation Number'\n which you would like to Cancell");
          System.out.println("--------------------------------------------------------");
          
          int cancelNum = scan.nextInt()-1;
          int retNum = Integer.parseInt(allBookingData.get(cancelNum).get(1));
          
          seats += retNum;
          allBookingData.remove(allBookingData.get(cancelNum));
          System.out.println("**************** Cancel your Reservation ***************");
          }else{
            System.out.println("There are currently NO Reservations");
            /////

          }
        
        } catch (Exception e) {
          System.out.println("******************! An Error occurred !*****************\n" +
          "Please enter the Correct Reservation Number");
    }
  }
}
