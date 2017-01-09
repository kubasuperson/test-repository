package pl.podstawyjavy.KolkoIKrzyzyk;

import java.io.File;

/**
 * Created by RENT on 2016-12-08.
 */
public class Main {
    public static void main(String[] args) {
        File file = new File("C://");
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File file1 : files) {
                System.out.println(file1.getName());
            }
        }
    }
}

