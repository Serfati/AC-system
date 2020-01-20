import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String B = "\u001B[0;1m";
    public static final String R = "\u001B[0m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static AirConditioner airConditioner;

    public static void main(String[] args) {
        airConditioner = new AirConditioner();
        do {
            int choice = startUpMenu();
            switch(choice) {
                case 1:
                    turnPower();
                    continue;
                case 2:
                    changeRTemp();
                    continue;
                case 3:
                    changeCTemp();
                    continue;
                default:
                    System.out.println(ANSI_RED+"\ninvalid choice, try again!\n"+R);
            }
        } while(true);
    }

    static int startUpMenu() {
        System.out.println(B+"==============================="+R);
        System.out.println(B+ANSI_YELLOW_BACKGROUND+"       Tornado AC remote       "+R);
        System.out.println(B+"==============================="+R);
        System.out.println("["+B+"1"+R+"] ON/OFF");
        System.out.println("["+B+"2"+R+"] + - Room Temp");
        System.out.println("["+B+"3"+R+"] + - AC Temp");
        System.out.println(B+"-------------------------------");
        System.out.println("Please select an option from 1-3"+R);
        try {
            return new Scanner(System.in).nextInt();
        } catch(Exception ignored) {
        }
        return -1;
    }

    static void turnPower() {
        if (airConditioner.getCurrentState() == airConditioner.on) {
            airConditioner.off.entry();
            exit(0);
        }
        airConditioner.powerOn();
    }

    static void changeCTemp() {
        if (airConditioner.getCurrentState() == airConditioner.on) {
            System.out.print(B+"Set AC temperature: "+R);
            int cTemp = new Scanner(System.in).nextInt();
            airConditioner.setCTemp(cTemp);
        } else
            System.out.println(ANSI_RED+"\n turn ON before\n"+R);
    }

    static void changeRTemp() {
        if (airConditioner.getCurrentState() == airConditioner.on) {
            System.out.print(B+"Set room temperature: "+R);
            int rTemp = new Scanner(System.in).nextInt();
            airConditioner.setRTemp(rTemp);
        } else
            System.out.println(ANSI_RED+"\n turn ON before\n"+R);
    }
}