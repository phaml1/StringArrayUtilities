package com.zipcodewilmington;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String s : array) {
            if (s.equals(value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] arrays) {
        for(int i = 0; i < arrays.length/2; i++){
            String temp = arrays[i];
            arrays[i] = arrays[arrays.length - i - 1];
            arrays[arrays.length - i - 1] = temp;
        }
        return arrays;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] reverse = reverse(array.clone());
        return Arrays.toString(array).equals(Arrays.toString(reverse));
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
       /* String alphabet = "abcdefghijklmnopqurstuvwxyz";
        char[] alpha = alphabet.toCharArray();
        for(int i = 0; i < array.length; i++){
            char[] arrayChars = array[i].toCharArray();
            for (int j = 0; j < 26; j++) {
                /*if (arrayChars.length == 1){
                    return arrayChars[0] == alpha[j];
                }
                if (arrayChars[i] == alpha[j] || ){
                    return true;
                }
            }
        }
        return false;*/
        boolean[] alpha = new boolean[26];
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < 26; j++) {
                int letter = array[i].charAt(j) - 'a';
                alpha[letter] = true;
            }
        }

        for(int i = 0; i < 26; i++){
            if(!alpha[i]){
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        //loop through array for value at i index
        for(int i = 0; i < array.length; i++){
            if(array[i].equals(value)){
                count++;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int numberOfOccurences = getNumberOfOccurrences(array, valueToRemove);
        String[] newArr = new String[array.length - numberOfOccurences];
        //loop to initialize and declare new values to newArr;
        for(int i = 0, j = 0; i < array.length; i++){
            if(!array[i].equals(valueToRemove)){
                newArr[j] = array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(newArr));
        return newArr;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
