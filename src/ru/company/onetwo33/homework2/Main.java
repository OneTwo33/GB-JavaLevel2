package ru.company.onetwo33.homework2;

public class Main {
    public static void main(String[] args) {
        String[][] arrStrings = {{"1","1","kkk","1"}, {"2","2","2","2"}, {"3","3","3","3"}, {"4","4","4","4"}};

        try {
            foo(new String[3][2]);
            foo(arrStrings);
        } catch (MyArraySizeException e) {
            try {
                foo(arrStrings);
            } catch (MyArrayDataException ex) {
                arrStrings[ex.getCol()][ex.getRow()] = "3";
                foo(arrStrings);
            }
        } catch (MyArrayDataException e) {
            arrStrings[e.getCol()][e.getRow()] = "5";
            foo(arrStrings);
        }
    }

    private static void foo(String[][] arrStrings) throws MyArraySizeException, MyArrayDataException {
        int num = 0;
        for (int i = 0; i < arrStrings.length; i++) {
            for (int j = 0; j < arrStrings[i].length; j++) {
                if (arrStrings.length != 4 || arrStrings[i].length != 4)
                    throw new MyArraySizeException();
                try {
                    num += Integer.parseInt(arrStrings[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        System.out.println(num);
    }
}
