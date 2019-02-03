/*
 * Developed by Sijar Ahmed on 28/1/19 5:34 PM
 * Last modified 28/1/19 5:34 PM.
 * Sijar Ahmed (sijar.ahmed@gmail.com)
 * Copyright (c) 2019. All rights reserved.
 *
 *
 * The Class / Interface MyStringBuilder is responsible for...
 * @author sijarahmed
 * 28/1/19 5:34 PM
 *
 */

package sijar.algo;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * My String builder
 *
 */
public class MyStringBuilder {

    private char[] characters;

    /**
     *
     */
    public MyStringBuilder() {
    }

    /**
     *
     * @param _string_
     */
    public MyStringBuilder(String _string_) {
        this();
        characters = _string_.toCharArray();
    }

    @Override
    public String toString() {
        return "MyStringBuilder :" +
                Arrays.toString(characters);
    }

    /**
     *
     * @param str_chars
     * @return
     */
    public MyStringBuilder append(String str_chars) {
        if(characters == null){
            characters = str_chars.toCharArray();
        }else {
            int _new_length = characters.length + str_chars.length();
            char[] _temp = Arrays.copyOf(characters, _new_length);
            for (int i = characters.length, j = 0; j < str_chars.length(); ++i, ++j) {
                _temp[i] = str_chars.charAt(j);
            }
            characters = _temp;
        }
        //System.out.println(characters);
        return this;
    }


    /**
     *
     * @param args
     */
    public static void main(String[] args) throws Exception {

        MyStringBuilder sb = new MyStringBuilder();

//        sb.append("abc").append("def");
//        System.out.println("sb :" + sb);
//        MyStringBuilder sb2 = new MyStringBuilder("pqr");
//        sb2.append("xyz").append("ijk");
//        System.out.println("sb2:" + sb2);

        long t0 = System.currentTimeMillis();
        try (Stream<String> stream = Files.lines(Paths.get("C:\\sa\\test_db-master\\load_salaries2.dump"))) {
            stream.forEach(sb::append);
        }
        System.out.println("Size :" + sb.characters.length);
        System.out.println("Total Time taken :" + (System.currentTimeMillis() - t0));
    }

}
