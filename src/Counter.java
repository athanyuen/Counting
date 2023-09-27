import java.util.ArrayList;
public class Counter {
    public Counter(){
    }
    public Parallel mostOccurences(String [] array){
        String [] wordListWithoutDuplicates = duplicates(array);
        int [] counter = new int[wordListWithoutDuplicates.length];
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < wordListWithoutDuplicates.length; j++){
                if(array[i].equals(wordListWithoutDuplicates[j])){
                    counter[j]++;
                }
            }
        }
        Parallel parallel = new Parallel(wordListWithoutDuplicates, counter);
        return parallel;
    }
    // Method to remove duplicate words
    public String [] duplicates(String [] array){
        ArrayList<String> arrayList = new ArrayList();
        for(int i = 0; i < array.length; i++){
            int count = 0;
            for(int j = 0; j < arrayList.size(); j++){
                if(!array[i].equals(arrayList.get(j))){
                    count++;
                }
            }
            if(count == arrayList.size()){
                arrayList.add(array[i]);
            }
        }
        return arrayList.toArray(new String[0]);
    }
}
