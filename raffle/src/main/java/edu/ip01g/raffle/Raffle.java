package edu.ip01g.raffle;

import java.util.Random;
import java.util.Scanner;

public class Raffle {

    int maxRandomNumber;
    String color;

    public int getNumber(int participants) throws InterruptedException {
        final Random random = new Random();
        int number = 0;
        for (int i = 1; i <= participants; i++) {
            number = random.nextInt() % participants + 1;
            number = Math.abs(number);
            Thread.sleep(300);
            System.out.println(i + " - " + number);
        }
        return number;
    }

    public static void main(String[] args) throws Exception {
        int main;
        Raffle myRaffle = new Raffle();
        final Scanner scanner = new Scanner(System.in);

        System.out.print("Number of participants: ");
        int participants = scanner.nextInt();

        int winner = myRaffle.getNumber(participants);
        System.out.println("Winner: " + winner);
    }

}
