/*
 * Developed by Sijar Ahmed on 28/1/19 5:34 PM
 * Last modified 28/1/19 5:34 PM.
 * Sijar Ahmed (sijar.ahmed@gmail.com)
 * Copyright (c) 2019. All rights reserved.
 *
 *
 * The Class / Interface MultiDimensionArrays is responsible for...
 * @author sijarahmed
 * 28/1/19 5:34 PM
 *
 */

package sijar.algo;

public class MultiDimensionArrays {


    private static int[][] array_2D = {
        {1,2,3},
        {4,5,6},
        {7,8,9},
    };

    private static int[][] twoD_array = new int[3][];
    static {
        twoD_array[0] = new int[5];
        twoD_array[1] = new int[3];
        twoD_array[2] = new int[4];
    }


    public static void main(String[] args) {
        for(int i=0; i < array_2D.length; ++i){
            for (int j = 0; j < array_2D[0].length; j++) {
                System.out.print(array_2D[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("====================");
        for(int i=0; i < twoD_array.length; ++i){
            for (int j = 0; j < twoD_array[i].length; j++) {
                twoD_array[i][j] = i*j;
            }
        }
        for(int i=0; i < twoD_array.length; ++i){
            for (int j = 0; j < twoD_array[i].length; j++) {
                System.out.print(twoD_array[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
