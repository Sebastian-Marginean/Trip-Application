package serviceUtil;

import main.Cities;
import util.Util;

import java.util.LinkedList;

public class Service {
    public static void menu1() throws Exception{
        //We use our method we create in the Util Package
        String info = Util.fillUserInfo();
        System.out.println(info);
        System.out.println("\nWelcome....");
        String city = Util.enterString("Where do you want to go?");//City == CITY
        //We upper string here
        String toUpperCity = city.toUpperCase();
        System.out.println("Checking destinations for " + toUpperCity);
        Thread.sleep(5000);
        Cities cities = new Cities();
        LinkedList<String> list = cities.getList();

        if(list.contains(toUpperCity)){
            System.out.println("There are available trips for " + toUpperCity + " ...");
            String tripInfo = Util.fillTripInfo();
            System.out.println(tripInfo);

        }else{ //We print our available trips if your city are not in the list
            System.out.println("There are no available trips\n\t Here are the active trips:");
            Cities cities2 = new Cities();
            LinkedList<String> list1 = cities2.getList();
            for(String s : list1){
                System.out.println("\t\t"+s);
            }
        }

    }

    public static void menu2(){
        String info = Util.fillUserInfo();
        System.out.println(info);
        String carType = Util.enterString("\nPlease enter your car type: ");
        String placeTo = Util.enterString("Where do you ride?");
        String placeFrom = Util.enterString("Your current location?");
        int capacity = Util.enterInteger("How many passengers you can carry?");
        String requires = Util.enterString("Enter requires: For example: (SMOKING - NO,"+"PET-YES, LUGGAGE-NO");
        System.out.println("Car type: " + carType + " from " +placeFrom + " to " + placeTo + " with " +
                capacity + " passengers and with these requires: " + requires);
    }

    public static void menu3(){
        System.out.println("Application information - Application information\n" +
                "Application information - Application information\n" +
                "Application information - Application information\n" +
                "Application information - Application information\n");
    }
}
