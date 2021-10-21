package com.sample.entity;

public class Matrix {

    private int [][] matrix;

    public Matrix(int width, int length) {
        this.matrix = new int[width][length];
    }

    public int getElement(int indexWidth, int indexLength) {
        return matrix[indexWidth][indexLength];
    }

    public void setElement(int indexWidth, int indexLength, int value) {
        matrix[indexWidth][indexLength] = value;
    }

    public int[] getRow(int index) {
        return matrix[index];
    }

    public int getWidth() {
        return matrix.length;
    }

    public int getLength() {
        return matrix[0].length;
    }

    public boolean isEmpty() { // &&
        return matrix == null || matrix.length == 0;
    }

    public void selfPrint() {
        System.out.print("Our matrix:\n");
        for (int j = 0; j < matrix.length; j++) {
            for (int y = 0; y < matrix[0].length; y++) {
                System.out.print(matrix[j][y] + "\t");
            }
            System.out.println();
        }
    }
}
