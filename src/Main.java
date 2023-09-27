import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        TopFive topFive = new TopFive();
        topFive.topFiveWords("textOne.txt", "commonWords.txt");
    }
}