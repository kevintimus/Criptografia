package Algoritmes;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int opcio;

        do {
            System.out.println("\n========================================");
            System.out.println("     MENÚ D'OPERACIONS AMB FITXERS");
            System.out.println("========================================");
            System.out.println("1. ");
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("4. Xifrat César        → Xifra o desxifra un fitxer");
            System.out.println("5. Persones RAF        → Desa/llegeix persones amb RandomAccessFile");
            System.out.println("6. Persones OIS        → Desa/llegeix persones amb ObjectStream");
            System.out.println("0. Sortir");
            System.out.println("========================================");
            System.out.print("Tria una opció: ");
            opcio = sc.nextInt();
            sc.nextLine();

            switch (opcio) {
                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                default:
                    System.out.println("Opció no vàlida!");
            }
        } while (opcio != 0);
        sc.close();
    }
}