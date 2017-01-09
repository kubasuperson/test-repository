package pl.podstawyjavy;

/**
 * Created by RENT on 2016-12-06.
 */
public class TabliceDwuwymiarowe {
    public static void main(String[] args) {
        double[][] tab1 = new double[][]{{1, 2}, {3, 4}};
        double[][] tab2 = new double[][]{{3, 4}, {5, 6}};
        double[][] wynikowa = new double[2][2];

        System.out.println("Macierz tab1");
        for (int i = 0; i < tab1.length; i++) {
            double[] tablicaWewnetrzna = tab1[i];
            for (int j = 0; j < tablicaWewnetrzna.length; j++) {
                System.out.print(tablicaWewnetrzna[j] + " ");
            }
            System.out.println();
        }

        System.out.println("Macierz tab2");
        for (int i = 0; i < tab2.length; i++) {
            double[] tablicaWewnetrzna = tab2[i];
            for (int j = 0; j < tablicaWewnetrzna.length; j++) {
                System.out.print(tablicaWewnetrzna[j] + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------");


        for (int i = 0; i < wynikowa.length; i++) {
            for (int j = 0; j < wynikowa[i].length; j++) {
                System.out.println("I: " + i + " J: " + j);

                double[] wierszTablicy1 = tab1[i];

                double[] kolumnaTablicy2 = new double[2];


                kolumnaTablicy2[0] = tab2[0][j];
                kolumnaTablicy2[1] = tab2[1][j];

                double wartosc = wierszTablicy1[0] * kolumnaTablicy2[0]
                        + wierszTablicy1[1] * kolumnaTablicy2[1];

                wynikowa[i][j] = wartosc;
            }
        }

        System.out.println("-------------------");


        System.out.println("Macierz wynikowa");
        for (int i = 0; i < wynikowa.length; i++) {
            double[] tablicaWewnetrzna = wynikowa[i];
            for (int j = 0; j < tablicaWewnetrzna.length; j++) {
                System.out.print(tablicaWewnetrzna[j] + " ");
            }
            System.out.println();
        }

    }
}
