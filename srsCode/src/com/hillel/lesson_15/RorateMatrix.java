package com.hillel.lesson_15;

/*
   1  2              1   2   3

1  1x 2x         1  1x  3x  5x
        ---->
2  3x 4x         2  2x  4x  6x

3  5x 6x

 */

import java.util.Arrays;

public class RorateMatrix {

    public static void main(String[] args) {

        String[][] strMass = {{"1x", "3x", "5x"}, {"2x", "4x", "6x"}};

        String [][] rezMatrix = new String[strMass[0].length][strMass.length];

        System.out.println(Arrays.deepToString(strMass));

        for (int i = 0; i < strMass.length; i++){
            for (int j = 0; j < strMass[i].length; j++){
                rezMatrix[j][i] = strMass[i][j];
            }
        }
        System.out.println(Arrays.deepToString(rezMatrix));



        Arrays.stream(strMass).flatMap(Arrays::stream).forEachOrdered(System.out::println);


    }

}
