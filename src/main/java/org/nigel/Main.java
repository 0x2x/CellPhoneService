package org.nigel;

import java.util.Scanner;

public class Main {
    static void main2() {
        CellPhone phone = new CellPhone();
        Scanner scan = new Scanner(System.in);

        System.out.print("What is the serial number? ");
        phone.setSerialNumber(scan.nextLine());

        System.out.print("What model number? ");
        phone.setModel(scan.nextLine());

        System.out.print("Who is the carrier? ");
        phone.setCarrier(scan.nextLine());

        System.out.print("What is the phone number? ");
        phone.setPhoneNumber(scan.nextLine());

        System.out.print("Who is the owner ");
        phone.setOwner(scan.nextLine());

        System.out.println("==Output==");
        System.out.println("Phone number: " + phone.getPhoneNumber());
        System.out.println("Model Phone: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Owner: " + phone.getOwner());

    }

    static void main() {
        CellPhone phone1 = new CellPhone();

        phone1.setSerialNumber("123123123123123");
        phone1.setModel("Iphone 16");
        phone1.setCarrier("T-mobile");
        phone1.setPhoneNumber("3_852_319_54");
        phone1.setOwner("Nigel Davey");
        phone1.dial("206-231-54545");

        CellPhone phone2 = new CellPhone();

        phone2.setSerialNumber("9999999999");
        phone2.setModel("Iphone 15");
        phone2.setCarrier("T-mobile");
        phone2.setPhoneNumber("231_252_232");
        phone2.setOwner("rando");
        phone2.dial("2323131231231");

        display(phone1);
        display(phone2);
        phone1.dial(phone2.getPhoneNumber());
        phone2.dial(phone1.getPhoneNumber());

    }

    public static void display(CellPhone phone) {
        System.out.println();

        System.out.printf("PhoneNumber: %s", phone.getPhoneNumber());
        System.out.println();
        System.out.printf("SerialNumber: %s", phone.getSerialNumber());
        System.out.println();
        System.out.printf("Model: %s", phone.getModel());
        System.out.println();
        System.out.printf("Owner: %s", phone.getOwner());
        System.out.println();


    }
}
