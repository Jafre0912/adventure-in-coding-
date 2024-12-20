import java.util.*;

public class RepeatedWordFinder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s = sc.nextLine();
        
        s = s.toLowerCase().replaceAll("[^a-zA-Z ]", "");
        String[] w = s.split("\\s+");
        
        Map<String, Integer> wc = new HashMap<>();
        
        for (String word : w) {
            wc.put(word, wc.getOrDefault(word, 0) + 1);
        }
        
        System.out.println("Repeated words and their occurrences:");
        boolean f = false;
        for (Map.Entry<String, Integer> e : wc.entrySet()) {
            if (e.getValue() > 1) {
                System.out.println(e.getKey() + ": " + e.getValue());
                f = true;
            }
        }
        
        if (!f) {
            System.out.println("No repeated words found.");
        }

        sc.close();
    }
}