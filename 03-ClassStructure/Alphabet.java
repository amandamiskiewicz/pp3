/*14.	Define a class Alphabet that contains a static method isAlphabet(String t) 
that returns true if the letters in the text t are in alphabetical order or false otherwise. Sample result:
Alphabet.isAlphabet("abegsw") returns true
Alphabet.isAlphabet("abcmhsw") returns false
 */

 public class Alphabet {
    static boolean isAlphabet(String t) {
        for (int i = 1; i < t.length(); i++) {
            if (t.charAt(i) <= t.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Alphabet.isAlphabet("abegsw"));   // should return true
        System.out.println(Alphabet.isAlphabet("abcmhsw"));  // should return false
    }
}