package com.sample;

import com.sample.another.MatrixScanner;
import com.sample.entity.Matrix;

public class Main {

    public static void main(String[] args) {
        Matrix matrix = MatrixScanner.makeMatrix();
        matrix.selfPrint();

        Matrix matrix2 = MatrixScanner.makeMatrix();
        matrix2.selfPrint();

        Matrix res = MatrixMultiplication.multiplyMatrix(matrix, matrix2);
        res.selfPrint();
    }
}