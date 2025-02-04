package coding_problems;

import java.util.HashMap;
import java.util.Map;

public class Q15_PrintDuplicateWords {

    public static void main(String[] args) {

        String input = "Java is great and Java is powerful";
        //String input = "Java is great";

        String[] words = input.toLowerCase().split("\\W+");

        Map<String, Integer> wordCountmap = new HashMap<>();

        for(String word : words){
            wordCountmap.put(word, wordCountmap.getOrDefault(word,0)+1);
        }

        System.out.println("Duplicate words: ");
        boolean hasDuplicates = false;
        for (Map.Entry<String, Integer> entry : wordCountmap.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey()+ " ");
                hasDuplicates = true;
            }
        }

        if(!hasDuplicates){
            System.out.println("No Duplicates Found.");
        }

    }
}
