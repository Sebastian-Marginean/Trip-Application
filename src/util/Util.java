package util;

import java.util.Scanner;

//Side Class
public class Util {
    //we create a method for easier reading for strings
                                     //enter name
    public static String enterString(String title){
        System.out.println(title);
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        return answer;
    }

    //we create a method for easier reading for integer
    public static int enterInteger(String title){
        System.out.println(title);
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        return answer;
    }

    //we create a method for easier writing of informations
    public static String fillUserInfo(){
        String nameSurname = enterString("Enter your Name and Surname: ");
        String email = enterString("Enter your E-mail: ");
        String phone = enterString("Enter your phone number: ");
        return "\nName: " + nameSurname + "\nEmail: " + email + "\nPhone: " + phone;
    }

    public static String fillTripInfo(){
        String location = Util.enterString("What is your current location? ");
        int passenger = Util.enterInteger("How many passengers will travel?");
        String time = enterString("Enter time(DD/MM/YYYY): ");
        String requires = Util.enterString("Enter requires: For example: (SMOKING - NO,"+"PET-YES, LUGGAGE-NO");
        return "Your destination from " + location + " with " + passenger +
                " passengers and with these requires:" + " " + requires + " in " + time;
    }

}
