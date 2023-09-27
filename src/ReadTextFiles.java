import java.io.*;
import java.util.Scanner;

public class ReadTextFiles {
    public ReadTextFiles(){
    }
    public String [] readEachWord(String fileName) throws FileNotFoundException {
        File myFile = new File(fileName);
        Scanner sc = new Scanner(myFile);
        Scanner sc2 = new Scanner(myFile);
        int count = 0;
        while (sc.hasNext()) {
            count++;
            sc.next();
        }
        String[] arr = new String[count];
        int i = 0;
        while(sc2.hasNext()){
            arr[i] = sc2.next();
            i++;
        }
        return arr;

    }

}
