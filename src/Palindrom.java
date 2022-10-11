public class Palindrom {
    public static boolean isPalindrom(String word){
        String newWord = "";
        for (int i = word.length() - 1; i > -1; i--) {
            newWord += word.charAt(i);
        }
        System.out.println(word + " " + newWord);
        if (!(newWord.matches(word))) {
            return false;
        }
        return true;
    }

    public static String PalindromValue(String word){
        String newWord = "";
        for (int i = word.length() - 1; i > -1; i--) {
            newWord += word.charAt(i);
        }
        return newWord;
    }

    public static void main(String[] args) throws Exception {
        String word1 = "hallah";
        String word2 = "hallaha";
        System.out.println(word1 + " " + PalindromValue(word1) + " " + isPalindrom(word1));
        System.out.println(word2 + " " + PalindromValue(word2) + " " + isPalindrom(word2));
    }
}
