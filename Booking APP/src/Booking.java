import java.util.*;

public class Booking {
    // 席数（staticをつけることで毎回リセットされずに計算ができるようになる.）
    private static int seats = 30;

    // 最終的な配列をこの中に二次元配列として入れている。これを使って予約確認の表示をしている。(これを使えばキャンセルもできる。resevNum分のseatsの席数を戻す必要あり)
    private static ArrayList<ArrayList<String>> allBookingData = new ArrayList<>();

    // makeReservationメソッドに入力したデータをここに一時保存し、上の二次元配列に最終的に保存している。
    //staticをつけないことで毎回中身がリセットされ新しい配列を保存することができるようになる。
    private ArrayList<String> bookingTmp = new ArrayList<>();
    
    String[] times = {"5:00pm-","6:00pm-","7:00pm-"};
    String timeTime;
    
    //配列の呼び出し方
    private String reserTime(){
      for(int i = 0 ; i < times.length; i++){
        System.out.println("[" + (i + 1) + "]" + times[i]);
      }
      int imputNum = scan.nextInt()-1;
      timeTime = times[imputNum];
      return timeTime;
    }

    Scanner scan = new Scanner(System.in);

    // 予約用 メソッド
    public void makeReservation() {
      try {
        System.out.println("Thank you for your reservation!");
        System.out.println("--------------------------------------------------------");
        System.out.println("Please enter the number of people in your reservation");
        System.out.println("--------------------------------------------------------");
        Integer resevNum = scan.nextInt();

        if (resevNum <= seats) {
            System.out.println(resevNum + " people");
            seats -= resevNum;
            System.out.println("(* Remaining seats: " + seats + "/30)");

            System.out.println("--------------------------------------------------------");
            System.out.println("What time would you like to make reservstion?");
            reserTime();
            System.out.println("--------------------------------------------------------");

            System.out.println("--------------------------------------------------------");
            System.out.println("Please enter your Name");
            System.out.println("--------------------------------------------------------");
            String name = scan.next();

            System.out.println("Is it correct to make a reservation for\n" +
                                timeTime + "," + resevNum + "people" + name + ", right?");


            // テンポラリーの配列にここで入れている
            bookingTmp.add(name);
            String resevNumToStr = resevNum.toString();
            bookingTmp.add(resevNumToStr);
            bookingTmp.add(timeTime);

            // 二次元配列に保存している
            allBookingData.add(bookingTmp);
            System.out.println("Thank you for your reservation!");

            System.out.println(allBookingData);
        } else {
            // 席数の足りなかった時の処理
            System.out.println("Sorry! only " + seats + " seats available left...");
        }
      } catch (Exception e) {
        System.out.println("Error!!");
        // TODO: handle exception
      }
    }

    // ==========================
    // 予約確認 メソッド
    // ==========================
    public void checkReservation() {
        // データがあるか確認
        if (allBookingData.size() > 0) {
            // データの数だけ表示
            for (int i = 0; i < allBookingData.size(); i++) {
                System.out.println("===============================");
                System.out.println("Reservation Number:" + "[" + (i + 1) + "]");
                System.out.println("Name: " + allBookingData.get(i).get(0) + "\n" +
                        "Number of People: " + allBookingData.get(i).get(1) + "\n" +
                        "Time: " + allBookingData.get(i).get(2));
                System.out.println("===============================");
            }
        } else {
            System.out.println("There are currently no reservations");
        }
    }
    public void cancelReservation(){
    try {
      checkReservation();
      System.out.println("Please enter your Reservation number which want to cancell");
      int cancelNum = scan.nextInt()-1;
      int retNum = Integer.parseInt(allBookingData.get(cancelNum).get(1));
      seats += retNum;
      allBookingData.remove(allBookingData.get(cancelNum));
      System.out.println("cancel your Reservation");
    } catch (Exception e) {
      System.out.println("Error!!");
    }
    }
}
