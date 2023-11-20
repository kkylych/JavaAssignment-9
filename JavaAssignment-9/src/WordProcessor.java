import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
public class WordProcessor {
    private final Set<String> distinctWords;
    public WordProcessor() {
        distinctWords = new HashSet<>();
    }
    public void readFile(String filePath){
        try (Scanner myReader = new Scanner(new File(filePath))) {
            while (myReader.hasNext()){
                String word = myReader.next();
                distinctWords.add(word);
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    public Set<String> getDistinctWords() {
        return distinctWords;
    }
}
