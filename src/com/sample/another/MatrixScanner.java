package com.sample.another;

import com.sample.entity.Matrix;

import java.util.Scanner;

public class MatrixScanner {

    public static Matrix makeMatrix() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter matrix length: ");

        int size1 = scan.nextInt();
        int size2 = scan.nextInt();
        Matrix matrix = new Matrix(size1, size2);
        System.out.println("Insert your nums:");
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                matrix.setElement(i, j, scan.nextInt());
            }
        }
        return matrix;
    }
}