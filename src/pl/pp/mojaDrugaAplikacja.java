package pl.pp;

import java.util.Scanner;

public class mojaDrugaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Proszę podaj swoje imię:") ;
        String forename = scanner.nextLine() ;
        System.out.println("Ile masz lat?:") ;
        String age = scanner.nextLine() ;
        scanner.close();
        System.out.println("Witaj " + forename + "Twój wiek w sekundach: " + Integer.parseInt(age)*60*60*24*365 + 's') ;

//        double x = 10;
//        double y = 2;
//        var result = x*x + y;
//        System.out.println("x + y = " + result);
//
//        result = x*x - y;
//        System.out.println("x - y = " + result);
//
//        result = x*x * y;
//        System.out.println("x * y = " + result);
//
//        result = x*x / y;
//        System.out.println("x / y = " + result);
//
//        result = x*x % y;
//        System.out.println("x % y = " + result);
//
//        System.out.println("Wpisz dwie liczby rozdzielone klawiszem Enter:");
//        double first = scanner.nextDouble(); //prośba o wpisanie wartości typu double
//        double second = scanner.nextDouble();
//
//        System.out.println("x + y = " + (first + second));

    }
}