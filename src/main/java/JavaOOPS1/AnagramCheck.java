package JavaOOPS1;

import java.util.Arrays;

/*
Check if Two Strings are Anagrams: Given two strings, determine if
they are anagrams, meaning they contain the same characters in a
different order. For example, "listen" and "silent" are anagrams
 */
public class AnagramCheck {

    public static boolean isAnagram(String word1, String word2){
        char[] array1 = word1.toCharArray();
        char[] array2 = word2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1,array2);
    }

    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "silent";

        if(isAnagram(word1,word2)){
            System.out.println("is an anagram");
        }else{
            System.out.println("is not an anagram");
        }
    }
}
