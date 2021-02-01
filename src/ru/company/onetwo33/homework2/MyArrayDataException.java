package ru.company.onetwo33.homework2;

public class MyArrayDataException extends NumberFormatException {
    private int col;
    private int row;

    public MyArrayDataException(int col, int row) {
        this.col = col;
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    @Override
    public String getMessage() {
        return "В ячейке [" + this.getCol() + "][" + this.getRow() + "] неверное значение.";
    }
}
