package classes;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class UniqueWordCounter {

    public static int countUniqueWords(String filePath) {
        try {
            File file = new File(filePath);
            String content = FileUtils.readFileToString(file, "UTF-8");

            String[] words = StringUtils.split(content, " ,.;!?");

            Set<String> uniqueWords = new HashSet<>();
            for (String word : words) {
                uniqueWords.add(word.toLowerCase());
            }

            return uniqueWords.size();
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
