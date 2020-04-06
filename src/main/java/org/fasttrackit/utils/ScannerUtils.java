package org.fasttrackit.utils;

import java.util.Scanner;

public class ScannerUtils {

    private static final Scanner scanner = new Scanner(System.in);


    public static String nextLine(){
        return scanner.nextLine();
    }

    public static int nextIntAndMoveToNextLine(){
        try {
            return scanner.nextInt();
        } finally {
            scanner.nextLine();
        }
    }

    public static double nextSingleDouble() {
        try {
            return scanner.nextDouble();
        } finally {
            scanner.nextLine();
        }
    }
}
