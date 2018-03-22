package application;

/**
 * Program by Lisvan comp. Reg Tulp
 */

//--------------------------Import----------------------------------------------

import java.util.ArrayList;

//--------------------------Main Program----------------------------------------


public class Application {
    
    public static void main(String[] args) {
        //main class
        int x1;
        int x2;
        int c;
        x1 = 5;
        x2 = 4;
        c = x1 + x2;
        //System.out.println("Это число: " + c + " |А ты знал?");
        System.out.println("Первое число: " + x1 + " | " + "Второе число: " + x2);
        System.out.println("Ответ: " + c);
        //----------------------------------------------------------------------------
        boolean equals;
        boolean equals1;
        int noname;
        int noname1;
        noname = 1;
        noname1 = 1;
        
        equals = x1 == x2;
        equals1 = noname == noname1;
        System.out.println("Первое и второе число равны? - " + equals);
        System.out.println("=====00000000000000-----------------------===");
        System.out.println("Noname и noname1 равны? " + equals1);
        //
        
    }
}
