/*
 * Developed by Sijar Ahmed on 12/2/19 12:10 AM
 * Last modified 12/2/19 12:10 AM.
 * Sijar Ahmed (sijar.ahmed@gmail.com)
 * Copyright (c) 2019. All rights reserved.
 *
 *
 * The Class / Interface Prime is responsible for...
 * @author sijarahmed
 * 12/2/19 12:10 AM
 *
 */

package sijar.algo;

public class Prime {


    static boolean isPrime(long n){
        if(n<=2)return false;
        for(int i=2;i<n-1;++i){
            if(n%i==0) {
                //System.out.println(n + " is divisible by " + i);
                return false;
            }
        }
        return true;
    }
}
