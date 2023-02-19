package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CamelCase4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.nextLine();
            String[] parts = input.split(";");

            char op = parts[0].charAt(0);
            char type = parts[1].charAt(0);
            String word = parts[2];

            switch (op) {
                case 'S':
                    String[] words = splitOperation(word);
                    System.out.println(String.join(" ", words));
                    break;
                case 'C':
                    String str = combineOperation(word.split(" "), type);
                    System.out.println(str);
                    break;
                default:
                    break;
            }
        }
        sc.close();
    }

    public static String combineOperation(String[] words, char type) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (type == 'M' && i == words.length - 1) {
                sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append("()");
            } else {
                if (i == 0) {
                    if (type == 'C') {
                        sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1));
                    } else {
                        sb.append(word);
                    }
                } else {
                    sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1));
                }
            }
        }
        return sb.toString();
    }

    public static String[] splitOperation(String word) {
        List<String> words = new ArrayList<>();
        int start = 0;
        for (int i = 1; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                words.add(word.substring(start, i).toLowerCase());
                start = i;
            }
        }
        if(word.substring(word.length()-2).equals("()")){
            words.add(word.substring(start, word.length()-2).toLowerCase());
        }else{
            words.add(word.substring(start).toLowerCase());
        }
        return words.toArray(new String[0]);
    }
}