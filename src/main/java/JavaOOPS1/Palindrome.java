package JavaOOPS1;
/*
Check if a String is StringCount: Determine whether a given string is
a palindrome, which means it reads the same forwards and
backward. For example, "madam" is a palindrome.
 */
public class Palindrome {

    public static boolean isPalindrome(String word){
        StringBuilder reverse = new StringBuilder(word).reverse();

        return word.equals(reverse.toString());
    }

    public static void main(String[] args) {
        String word = "madam";

        if (isPalindrome(word)){
            System.out.println(word+" Is a StringCount");
        }else{
            System.out.println(word+" Is a StringCount");
        }
    }

}
