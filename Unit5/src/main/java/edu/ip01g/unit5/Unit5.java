package edu.ip01g.unit5;

import edu.ip01g.unit5.objects.ChessPiece;
import edu.ip01g.unit5.objects.Runner;
import edu.ip01g.unit5.objects.TextMessage;

public final class Unit5 {

    public static void main(String args[]) {
        Runner runner = new Runner("Usain Bolt", "100 meters");
        System.out.println(runner);

        System.out.println("\n\n---------------------------");

        ChessPiece whiteKing = new ChessPiece("White","King", 'E', 1);
        System.out.println(whiteKing.getName());

        ChessPiece whiteBishop1 = new ChessPiece("White","Bishop", 'C', 1);

        ChessPiece blackKing = new ChessPiece("Black","King", 'E', 8);
        ChessPiece BlackQueen = new ChessPiece("Black", "Queen", 'D', 8);

        System.out.println(whiteKing.toString());
        System.out.println(whiteBishop1.toString());
        System.out.println(blackKing.toString());
        System.out.println(BlackQueen.toString());

        System.out.println("\n\n---------------------------");

        TextMessage textMessage = new TextMessage("5555-5555", "Que ondas!");

        System.out.println(textMessage.toString());

    }
}
