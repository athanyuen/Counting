import java.io.FileNotFoundException;
import java.util.ArrayList;

public class TopFive {
    public TopFive(){
    }
    public void topFiveWords(String textFile, String commonWordsFile) throws FileNotFoundException {
        Sifter sifter = new Sifter();
        Counter counter = new Counter();
        String [] sifted = sifter.siftText(textFile, commonWordsFile);
        Parallel parallel = counter.mostOccurences(sifted);
        String [] wordList = parallel.getWordList(); //Word list of each word
        int [] occurences = parallel.getCounter(); //Occurence of each word with index corresponding to the word list array
        int [] fiveHighestNums = new int[5]; //Final array of number of highest occurences
        String [] topFiveStrings = new String[5]; // Final array for top 5 words
        ArrayList<String> wordsArrayList = new ArrayList<>(); //An array list of each word
        ArrayList<Integer> occurenceArrayList = new ArrayList<>(); //An array list of the occurence
        for(int i = 0; i < occurences.length; i++){
            occurenceArrayList.add(occurences[i]);
            wordsArrayList.add(wordList[i]);
        }
        for(int i = 0; i < 5; i++){
            int index = 0;
            for(int j = 0; j < occurenceArrayList.size(); j++){
                if(fiveHighestNums[i] < occurenceArrayList.get(j)){
                    fiveHighestNums[i] = occurenceArrayList.get(j);
                    topFiveStrings[i] = wordsArrayList.get(j);
                    index = j;
                }
            }
            wordsArrayList.remove(index);
            occurenceArrayList.remove(index);
        }
        for(int i = 0; i < 5; i++){
            System.out.println(topFiveStrings[i] + ": " + fiveHighestNums[i]);
        }
    }
}
