package pl.podstawyjavy;

import java.util.Scanner;

/**
 * Created by RENT on 2016-12-06.
 */
public class KolkoIKrzyzykGra {
    public static void main(String[] args) {
        char[][] poleGry = new char[][]{{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ',' '}};

        boolean czyRuchKrzyzyk = true;

        while (true) {
            System.out.println("Podaj wspolrzedna X:");
            int x = new Scanner(System.in).nextInt();
            System.out.println("Podaj wspolrzedna Y:");
            int y = new Scanner(System.in).nextInt();

            if(poleGry[x][y] != ' '){
                System.out.println("ZAJĘTE POLE!!!");
                continue;
            }

            if(czyRuchKrzyzyk) {
                poleGry[x][y] = 'X';
            }else {
                poleGry[x][y] = 'O';
            }

            // NEGACJA
            // !true = false
            // !false = true
            czyRuchKrzyzyk = !czyRuchKrzyzyk;

            // wypisanie pola gry
            for (int i = 0; i < poleGry.length; i++) {
                for (int j = 0; j < poleGry.length; j++) {
                    System.out.print("[" + poleGry[j][i] + "] ");
                }
                System.out.println();
            }
        }
    }
}
