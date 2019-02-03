/*
 * Developed by Sijar Ahmed on 28/1/19 5:34 PM
 * Last modified 28/1/19 5:34 PM.
 * Sijar Ahmed (sijar.ahmed@gmail.com)
 * Copyright (c) 2019. All rights reserved.
 *
 *
 * The Class / Interface ZshapedWalk is responsible for...
 * @author sijarahmed
 * 28/1/19 5:34 PM
 *
 */
package sijar.algo;

/**
 * author : sijar
 */
public class ZshapedWalk {

    //private static final int ORDER = 3;
    private static String[][] square_martix =
            new String[][]
                    {
                            {"1", "2", "3","4"},
                            {"5", "6", "7", "8"},
                            {"9","10", "11", "12"},
                            {"13", "14", "15","16"},
                    };
    //1,2,3,5,7,8,9
    //(0,0) (0,1) (0,2) (1,1) (2,0), (2,1) (2,2)
    public static void z_walk() {
        int x =0, y = 0;
        for (x = 0, y = 0; y < square_martix[0].length; ++y) {
            System.out.println( x + ":" + y + "("+  square_martix[x][y] + ") ");
        }
        for (x=x+1,y=y-2; y>= 0 && x < square_martix[0].length; --y, ++x) {
            System.out.println(x + ":" + y + "(" + square_martix[x][y] + ") ");
        }
        for (x=x-1,y=y+2; y < square_martix[0].length; ++y) {
            System.out.println(x + ":" + y + "(" + square_martix[x][y] + ") ");
        }
    }


    public static void main(String[] args) {
        ZshapedWalk.z_walk();
    }
}
