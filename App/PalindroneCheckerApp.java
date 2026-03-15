package App;

public class PalindroneCheckerApp {
    public static void main(String[] args) 
    {
        String word = "madam";
        boolean isPalindrome = isPalindrome(word);
        System.out.println(word + " is a palindrome: " + isPalindrome);
    }

    public static boolean isPalindrome(String str) 
    {
        String cleanedStr = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();
        return cleanedStr.equals(reversedStr);
    }

}
