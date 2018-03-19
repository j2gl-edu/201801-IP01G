package edu.ip01g.unit5.objects;

public class ChessPiece {

    private String color;
    private String name;
    private char column;
    private int row;

    public ChessPiece(final String color, final String name, final char column, final int row) {
        this.color = color;
        this.name = name;
        this.row = row;
        this.column = column;
    }

    public String getName() {
        return name;
    }

    public int getRow() {
        return row;
    }

    public void setRow(final int row) {
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public void setColumn(final char column) {
        this.column = column;
    }

    @Override
    public String toString() {
        return "ChessPiece{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", column=" + column +
                ", row=" + row +
                '}';
    }
}
