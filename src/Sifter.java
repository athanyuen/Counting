import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Sifter {
    public Sifter(){
    }
    public String [] siftText(String textFile, String commonWordsFile) throws FileNotFoundException {
        ReadTextFiles reader = new ReadTextFiles();
        String [] commonWordsArr = reader.readEachWord(commonWordsFile);
        String [] textArr = reader.readEachWord(textFile);
        ArrayList<String> wordsArrayList = new ArrayList<>();
        for(int i = 0; i < textArr.length; i++){
            if(!textArr[i].contains("’")){
                wordsArrayList.add(textArr[i]);
            }
        }
        for(int i = 0; i < wordsArrayList.size(); i++){
            wordsArrayList.set(i, wordsArrayList.get(i).toLowerCase());
            wordsArrayList.set(i, wordsArrayList.get(i).replaceAll("[^a-zA-Z0-9]", ""));
            
        } // works up to here
        String[] array = wordsArrayList.toArray(new String[0]);
        ArrayList<String> last= new ArrayList();
        for(int i = 0; i < array.length; i++) {
            int count = 0;
            for(int j = 0; j < commonWordsArr.length; j++){
                if(!array[i].equals(commonWordsArr[j].toLowerCase())){
                    count++;
                }
            }
            if(count == commonWordsArr.length){
                last.add(array[i]);
            }
        }
        return last.toArray(new String[0]);
    }
}
