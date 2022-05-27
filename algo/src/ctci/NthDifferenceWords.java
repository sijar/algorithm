/*
 * Developed by Sijar Ahmed on 27/05/22, 7:06 PM
 * Last modified 06/02/19, 10:24 PM.
 * Sijar Ahmed (sijar.ahmed@gmail.com)
 * Copyright (c) 2022. All rights reserved.
 *
 *
 * The Class / Interface NthDifferenceWords is responsible for...
 * @author sijarahmed
 * 27/05/22, 7:06 PM
 *
 */

package ctci;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NthDifferenceWords {


    public static void main(String[] args) {
        int nth_difference = 1;
        String pattern = "mert";
        String[] data = new String[]{"aert", "ert", "meat", "mmert", "merst", "merts","meritos"};
        System.out.println(getNthDifferenceWords(pattern,data,nth_difference));

        nth_difference = 2;
        pattern = "merit";
        data = new String[]{"aert", "ert", "meat", "mmert", "merst", "merts","demerit","merito", "meritos"};
        System.out.println(getNthDifferenceWords(pattern,data,nth_difference));
    }

    /**
     * Then function will return list of the words matched with nth_difference
     *
     * @param pattern search pattern
     * @param data input data
     * @param nth_difference difference
     * @return
     */
    static List<String> getNthDifferenceWords(String pattern, String[] data, int nth_difference) {
        Map<Character, Integer> frequencyTable = new HashMap<>();
        List<String> matchedWords = new ArrayList<>();
        //Code complexity : O(n)
        for (int i = 0; i < pattern.length(); ++i) {
            frequencyTable.put(pattern.charAt(i), 1);
        }
        //Code complexity : O(m) where m is size of entire input;
        for (String input : data) {
            int matchCounter = 0;
            for (int j=0; j<input.length(); ++j){
                if(frequencyTable.containsKey(input.charAt(j))){
                    ++matchCounter;
                }
            }
            //System.out.println("matched=" + matchCounter);
            if(input.length() <= pattern.length() && (matchCounter == pattern.length() - nth_difference)){
                    matchedWords.add(input);
            }
            if((input.length() - pattern.length() == 1) && (matchCounter >= input.length() - nth_difference)){
                matchedWords.add(input);
            }
       }
        return matchedWords;
    }

}
