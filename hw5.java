import java.util.*;

public class hw5 {
}
public static void author() {
        System.out.println("//**********************************\\\\");
        System.out.println("//*********  Created by:  **********\\\\");
        System.out.println("//*Fisher \"jeensy\" Evgenya *\\\\");
        System.out.println("//***** 79113333333@mail.ru ******\\\\");
        System.out.println("//**********************************\\\\");

    }

    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>();
        HashMap<String, List<String>> phoneBook = new HashMap<>();

        numbers.add("1111111111");
        numbers.add("1111111112");
        numbers.add("1111111113");
        numbers.add("1111111114");
        phoneBook.put("John Doe", numbers);

        numbers = new ArrayList<>();
        numbers.add("2221111111");
        numbers.add("2221111112");
        phoneBook.put("Joe Doe", numbers);

        numbers = new ArrayList<>();
        numbers.add("3331111111");
        numbers.add("3331111112");
        numbers.add("3331111113");
        numbers.add("3331111114");
        phoneBook.put("Phil Spancer", numbers);

        numbers = new ArrayList<>();
        numbers.add("4441111111");
        numbers.add("4441111112");
        numbers.add("4441111113");
        phoneBook.put("Jason Shraer", numbers);

        numbers = new ArrayList<>();
        numbers.add("5551111111");
        numbers.add("5551111112");
        numbers.add("5551111113");
        phoneBook.put("Bobbi Cotick", numbers);

        List<Map.Entry<String, List<String>>> list = new ArrayList<>(phoneBook.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, List<String>>>() {
            @Override
            public int compare(Map.Entry<String, List<String>> o1, Map.Entry<String, List<String>> o2) {
                return o2.getValue().size() - o1.getValue().size();
            }
        });

        for (Map.Entry<String, List<String>> iter : list) {
            System.out.println(iter.getKey() + ": " + iter.getValue());
        }

        author();
    }
}