package main;

import serviceUtil.Service;
import util.Util;

import java.util.LinkedList;
import java.util.Scanner;

//MAIN PROCESSES NOT FOR CODES
public class Main {
    public static void main(String[] args) throws Exception{
        System.out.println("Welcome to Trip Application\n\tYour Ride and Your Choice");
        String nationality = Util.enterString("Please tell us, are u a foreign or native?");

        Scanner scanner = new Scanner(System.in);

        //We create our options
        String services = "1:Find Ride\n" +
                "2:Offer Ride\n" +
                "3:About Us\n" +
                "0:Quit";


        while(true) {

            String information = "";

            if (nationality.equalsIgnoreCase("foreign")) {  //equalsIgnoreCase ignore the Caps or not
                information = Util.enterString("Enter your passport id: ");
                System.out.println("checking passport id for: " + information);
                Thread.sleep(2000);
                System.out.println("Process completed successfully");
            } else if (nationality.equalsIgnoreCase("native")) {
            } else {
                System.out.println("Invalid operation");
                break;
            }
            System.out.println(services);
            int menu = scanner.nextInt();

            if (menu == 1) {
                Service.menu1();
                break;
            } else if (menu == 2) {
                Service.menu2();
                break;
            } else if (menu == 3) {
                Service.menu3();
                break;
            } else if (menu == 0) {
                System.out.println("Quiting from system/application");
                break;
            } else {
                System.out.println("Invalid operation");
                break;
            }
        }
    }
}
