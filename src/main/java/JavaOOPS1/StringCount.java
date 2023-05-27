package JavaOOPS1;
/*
Count the Number of Words in a String: Write a function to count the
number of words in a given string. Words are separated by spaces or
punctuation. For example, the input "Hello, world!" should return 2.

 */
public class StringCount {
    public static int counter(String word){
        String [] words = word.trim().split("\\s+");
        return words.length;
        }

    public static void main(String[] args) {
        String word = "Hello World!";
        int countWord = counter(word);
        System.out.println(countWord);
    }
    }

