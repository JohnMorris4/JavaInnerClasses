package com.johnmorris;

public class Main {

    public static void main(String[] args) {



        Gearbox Allison_1000 = new Gearbox(6);

        Allison_1000.operateClutch(true);
        Allison_1000.changeGear(1);
        Allison_1000.operateClutch(false);
        System.out.println(Allison_1000.wheelSpeed(1200));
        Allison_1000.operateClutch(true);
        Allison_1000.changeGear(2);

        Allison_1000.operateClutch(false);
        System.out.println(Allison_1000.wheelSpeed(2000));
        //Gearbox Allison_HD4560P = new Gearbox(18);

    }
}
