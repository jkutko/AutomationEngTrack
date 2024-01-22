package org.example;

import java.util.Random;
import java.util.Scanner;

public class Zad1 {
    /*
     * Kod który ustali wartość zmiennej lokalnej typu int oraz sprawdzi czy liczba jest parzysta
     * kod w funkcji main
     * wczytanie kodu od użytkownika albo wylosowanie
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę ");
        int liczba = scanner.nextInt();

        if (liczba % 2 == 0) {
            System.out.println("Ta liczba jest parzysta ");
        } else {
            System.out.println(" To nie jest liczba parzysta !!!");
        }


//        {
//            Random liczba = new Random();
//
//            int losowaLiczba = liczba.nextInt(10);
//
//            if (losowaLiczba % 2 == 0) {
//                System.out.println("Jestem liczbą " + losowaLiczba + " i jestem podzielna przez 2");
//            } else
//                System.out.println(losowaLiczba + " To nie jest liczba parzysta !!!!");
//        }
    }
}
