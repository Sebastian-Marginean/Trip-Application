package main;

import java.util.LinkedList;

public class Cities {
    LinkedList<String> list = new LinkedList<>(); //We create a list for cities to add or delete them more easily

    public Cities(){  //Constructor

    }

    //Here is the list
    public LinkedList<String> getList(){
        list.add("CLUJ-NAPOCA");
        list.add("ALBA IULIA");
        list.add("BUCURESTI");
        list.add("BLAJ");
        list.add("TIMISOARA");
        list.add("ARAD");
        list.add("ORADEA");
        list.add("PLOIESTI");
        list.add("PITESTI");
        list.add("ZALAU");
        list.add("SCUEAVA");
        list.add("BAIA MARE");
        return list;
    }
}
