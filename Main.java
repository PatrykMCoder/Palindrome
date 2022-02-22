import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String word = args[0];

        if (isPalindrome(word.toLowerCase())) 
            System.out.println("Is Palindrome");
        else
            System.out.println("Is Not Palindrome");
    }

    private static boolean isPalindrome(String word) {
        ArrayList<String> tmpArray = new ArrayList<String>();
    
        for (int i = word.length() - 1; i >= 0; i--) {
            tmpArray.add(String.valueOf(word.charAt(i)));
        }

        for (int i = 0; i < word.length(); i++) {
            if (!tmpArray.get(i).equals(String.valueOf(word.charAt(i))))
                return false;
        }

        return true;
    }
}
