/*
 * Developed by Sijar Ahmed on 12/2/19 12:06 AM
 * Last modified 12/2/19 12:06 AM.
 * Sijar Ahmed (sijar.ahmed@gmail.com)
 * Copyright (c) 2019. All rights reserved.
 *
 *
 * The Class / Interface UniversalHashing is responsible for...
 * @author sijarahmed
 * 12/2/19 12:06 AM
 *
 */

package sijar.algo;

import java.util.Random;

public class UniversalHashing {

    private


    /**
     * Universal hashing
     * @param key
     * @return
     */
    static int UniversalHashfunction(int key, int inbound) {
        int a = new Random().nextInt();
        int b = new Random().nextInt();

        int large_prime = new Random().nextInt();
        while(!Prime.isPrime(large_prime)){
            large_prime = new Random().nextInt();
        }
        return ((a*key + b) % large_prime)% inbound;
    }


    public static void main(String[] args) {
        UniversalHashing uhash = new UniversalHashing();
        System.out.println(uhash.UniversalHashfunction(19, 1293));
        System.out.println(uhash.UniversalHashfunction(17, 1293));
        System.out.println(uhash.UniversalHashfunction(5, 1293));
        System.out.println(uhash.UniversalHashfunction(129, 1293));
        System.out.println(uhash.UniversalHashfunction(9, 1293));

    }


}
