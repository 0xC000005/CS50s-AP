import java.util.ArrayList;
import java.util.List;

public class Sentence {
    /** The sentence to manipulate */
    private String sentence;

    /**
     * @return an ArrayList of integer positions containing a * blank in this
     *         sentence. If there are no blanks in the * sentence, returns an empty
     *         list.
     */

    Sentence(String sentence) {
        this.sentence = sentence;
    }

    public List<Integer> getBlankPositions() {
        /* to be implemented in part (a) */
        List<Integer> intList = new ArrayList<Integer>();
        String copySentence = sentence;
        int shiftValue = 0;
        while (copySentence.length() > 0 && copySentence.indexOf(" ") != -1) {
            intList.add(copySentence.indexOf(" ") + shiftValue); // boxing
            shiftValue += copySentence.indexOf(" ") + 1;
            copySentence = copySentence.substring(copySentence.indexOf(" ") + 1);
        }
        return intList;
    }

    /**
     * @return the number of words in this sentence * Precondition: Sentence
     *         contains at least one word.
     */
    public int countWords() {
        /* to be implemented in part (b) */
        // 所有单词都是空格结尾，除了最后一个单词
        List<Integer> intList = getBlankPositions();
        return intList.size() + 1;
    }

    /**
     * @return the array of words in this sentence * Precondition: * - Any two words
     *         in the sentence are separated by one blank. * - The sentence contains
     *         at least one word. * Postcondition: String[] returned containing the
     *         words in * this sentence.
     */
    public String[] getWords() {
        /* to be implemented in part (c) */
        String copySentence = sentence;
        int count = 0;
        String[] ans = new String[countWords()];
        while (true) {
            if (copySentence.indexOf(" ") == -1) {
                ans[count] = copySentence;
                break;
            }

            String word = copySentence.substring(0, copySentence.indexOf(" "));
            ans[count++] = word;
            copySentence = copySentence.substring(copySentence.indexOf(" ") + 1);

        }
        return ans;
    }
    // Constructor and other methods are not shown.

    public static void main(String[] args) {
        Sentence s = new Sentence("Hi! How are you?");
        for (String item : s.getWords()) {
            System.out.print(item + " ");
        }
    }
}