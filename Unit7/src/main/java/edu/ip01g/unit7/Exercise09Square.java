package edu.ip01g.unit7; 

import java.util.Scanner;

public class Exercise09Square {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter square size: ");
        int n = scanner.nextInt();

        for (int linea = 1; linea <=n ; linea++) {
            for (int col = 1; col <=n ; col++) {
                if (linea > 1 && linea < n) {
                    if ( (col == 1 ) || (col == n) ) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

}