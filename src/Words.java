import java.util.*;

public class Words {

    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "grape", "kiwi", "banana", "apple", "orange", "strawberry"};

        Map<String, Integer> wordCount = new HashMap<>();
        Set<String> uniqueWords = new HashSet<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            uniqueWords.add(word);
        }

        System.out.println("Уникальные слова: " + uniqueWords);
        System.out.println("Количество повторений каждого слова:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}