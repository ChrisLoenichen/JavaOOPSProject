package JavaOOPS1;
/*
Reversal a String: Write a function to reverse a given string. For
example, given the input "Hello", the output should be "olleH"
 */
public class Reversal {

    public static String stringReverser(String word){
        StringBuilder reverse = new StringBuilder();
        for (int i = word.length() -1; i >=0 ; i--) {
            reverse.append(word.charAt(i));
        }
        return reverse.toString();
    }


    public static void main(String[] args) {
        String word = "Hello";
        String reverse = stringReverser(word);
        System.out.println(reverse);


    }
}
