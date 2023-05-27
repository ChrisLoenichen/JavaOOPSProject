package JavaOOPS1;
/*
Find the First Non-Repeating Character in a String: Given a string,
find and return the first non-repeating character. For example, in the
string "abracadabra", the first non-repeating character is 'c'.

 */

public class NonRepeatingChar {
    public static void main(String[] args) {
        String word = "abracadabra";

        int[] count = new int[26];
        word = word.toLowerCase();


        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            count[ character - 'a']++;
        }

        char firstChar = '\0';
        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            if (count[character - 'a'] == 1) {
                firstChar = character;
                break;
            }
        }

        System.out.println("First non-repeating character is " + firstChar);
    }
}
