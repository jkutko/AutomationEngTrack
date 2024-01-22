package org.example;

import java.util.Scanner;

public class Zad2c {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ile ma być liczb ");
        int ileLiczb = scanner.nextInt();

        int[] mojaTablicaLiczb = new int[ileLiczb];

        //wypełnienie tablicy
        for (int i= 0; i< ileLiczb; i++) {
            int j = i + 1;
            System.out.println("Podaj liczbę " + j);
            int liczba = scanner.nextInt();

            //System.out.println("Moja wpisana liczba " + liczba);

            mojaTablicaLiczb[i] = liczba;
        }
        for (int pokazLiczby : mojaTablicaLiczb) {
            System.out.println("Wprowadzone liczby to " +pokazLiczby);
        }

    }
}
