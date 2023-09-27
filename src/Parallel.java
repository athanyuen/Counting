import java.util.ArrayList;

public class Parallel {
    private String [] wordList;
    private int [] counter;

    public Parallel(String [] wordList, int [] counter){
        this.wordList = wordList;
        this.counter = counter;
    }

    public int[] getCounter() {
        return counter;
    }

    public String[] getWordList() {
        return wordList;
    }
}
