import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        WordProcessor wordProcessor1 = new WordProcessor();
        WordProcessor wordProcessor2 = new WordProcessor();
        wordProcessor1.readFile("C:\\Users\\hp\\Desktop\\file1.txt");
        wordProcessor2.readFile("C:\\Users\\hp\\Desktop\\file2.txt");

        Set<String> distinctWords1 = wordProcessor1.getDistinctWords();
        Set<String> distinctWords2 = wordProcessor2.getDistinctWords();
        System.out.println("Distinct Words: " + distinctWords1);
        System.out.println("Distinct Words: " + distinctWords2);


        SimilarityCalculator similarityCalculator = new SimilarityCalculator();
        double jaccardSimilarity = similarityCalculator.calculateSimilarity(distinctWords1, distinctWords2);

        System.out.println("Jaccard Similarity between file1 and file2: " + jaccardSimilarity);
    }
}