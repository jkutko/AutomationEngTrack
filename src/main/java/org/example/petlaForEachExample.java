package org.example;

public class petlaForEachExample {
    public static void main(String[] args) {

            String[] planety = {"Merkury", "Wenus", "Ziemia"};
            String tekst = "Planety naszego układu to: ";

            for (String planeta : planety) {
                tekst = tekst + "\n" + planeta;
            }
            System.out.println(tekst);

        }
    }