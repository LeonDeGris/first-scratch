package com.sample;


import com.sample.entity.Matrix;

public class MatrixMultiplication {
    public static Matrix multiplyMatrix(Matrix first, Matrix second) {
        int firstLength = first.getWidth();
        int firstWidth = second.getLength();
        Matrix res = new Matrix(firstLength, firstWidth);

        for (int i = 0; i < firstLength; i++) {
            for (int y = 0; y < firstWidth; y++) {
                for (int j = 0; j < second.getWidth(); j++) {
                    res.setElement(i, y, res.getElement(i, y) + first.getElement(i, j) * second.getElement(j, y));
                }
            }
            System.out.println("Your result: \n");
        }

        return res;
    }
}
