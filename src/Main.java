import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 1) {
                System.out.print(nums.get(i) + " ");
            }
        }
        System.out.println("");
    }

    private static void task2() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> evenUniques = new HashSet<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                evenUniques.add(nums.get(i));
            }
        }
        List<Integer> newNums = new ArrayList<>(evenUniques);
        Collections.sort(newNums);
        System.out.println(newNums.toString().replace("[", "")
                .replace("]", "")
                .replace(",", ""));
    }

    private static void task3() {
        Set<String> words = new HashSet<>(List.of("ветер", "с", "моря", "дул", "ветер", "с", "моря", "дул",
                "нагонял", "беду", "нагонял", "беду"));
        System.out.println(words.toString().replace("[", "")
                .replace("]", "")
                .replace(",", ""));
    }

    private static void task4() {
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Map<String, Integer> wordCounter = new HashMap<>();
        for (String word : strings) {
            if (!wordCounter.containsKey(word)) {
                wordCounter.put(word, 1);
            } else {
                wordCounter.put(word, wordCounter.get(word) + 1);
            }
        }
        System.out.println(wordCounter.values().toString().replace("[", "")
                .replace("]", "")
                .replace(",", ""));
    }

}