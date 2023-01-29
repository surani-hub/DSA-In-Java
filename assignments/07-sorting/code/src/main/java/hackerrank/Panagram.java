package hackerrank;

import java.util.HashSet;

public class Panagram {
    public static void main(String[] args) {
        String s = "The five boxing wizards jumps quickly";
        System.out.println(pangrams(s));
    }

    public static String pangrams(String s) {
        s = s.toLowerCase().replaceAll(" ", "");
        HashSet<Character> set = new HashSet<>();
        for(char c: s.toCharArray()){
            set.add(c);
        }
        if(set.size() == 26){
            return "pangram";
        }
        return "not pangram";
        // Write your code here
//        boolean[] status = new boolean[26];
//        int i = 0;
//        for (char ch = 'a'; ch <= 'z'; ch++) {
//            if (s.indexOf(ch) != -1) {
//                status[s.charAt(i++) - 'a'] = true;
//            }
//        }
//
//        for (int k = 0; k < status.length; k++) {
//            if (!status[k]) {
//                return "pangram";
//            }
//        }
//        return "not pangram";
    }
}
