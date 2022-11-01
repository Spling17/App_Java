import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    public static void showMenu() {
        char option;
        Scanner scan = new Scanner(System.in);
        Information info = new Information();

        do {
            System.out.println
                    ("*********************************\n" +
                    "Select the option from below.\n" +
                    "[A]Teachers Information\n" +
                    "[B]Indivisual Teachers Information\n" +
                    "[C]\n" +
                    // "[D]\n" +
                    "[E]Exit\n" +
                    "*********************************");
            option = scan.next().charAt(0);

            switch (Character.toLowerCase(option)) {
                case 'a':
                    info.info();
                    break;
                case 'b':
                    while(true){
                        info.info();
                        System.out.println("==============================\n" + "Enter the Teacher's name\n");
                        System.out.println("==============================");
                        String teacherName = scan.next();

                        Map.Entry<Teacher,ArrayList<Subject>> sensei = info.eachTeacher(teacherName);
                        if (teacherName.equals(sensei.getKey().getFirstName())){
                            System.out.println(sensei);
                            break;
                        } else {
                            System.out.println("Wrong Name or spelling.\nTKry again.");
                        }
                    System.out.println("Do you want to see another Teachers Infomarion?");
                    }
                    break;
                case 'c':

                    break;
                case 'd':

                    break;
                case 'e':

                    break;
                default:
                    App.clrscr();
                    System.out.println("Please input an alphabet from [A] to [E]");
                    break;
            }
        } while (Character.toLowerCase(option) != 'e');
        scan.close();
    }
}

