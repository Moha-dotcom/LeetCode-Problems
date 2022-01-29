package Com.LeetCode.String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstring {

    public static void main(String[] args) {


        String s = "pwwkew";


//        for(int i =0; i< s.length(); i++){
//            System.out.println(s.charAt(i));
//        }


        System.out.println(lengthOfLongestSubstring(s));
        System.out.println(lengthOfLongestSubstring2(s));


    }

    public static int lengthOfLongestSubstring(String str) {
        if (str == null || str.length() == 0) return 0;

        int i = 0, j = 0, max = 0;
        Set<Character> CharSet = new HashSet<>();

        while (i < str.length()) {
            char c = str.charAt(i);

            while (CharSet.contains(c)) {

                CharSet.remove(str.charAt(j));
                j++;
            }

            CharSet.add(c);
            max = Math.max(max, i - j + 1);
            i++;
        }

        return max;
    }


    public static int lengthOfLongestSubstring2(String str) {
        if (str == null || str.length() == 0) return 0;

        int i = 0, j = 0, max = 0;
        Set<Character> CharSet = new HashSet<>();

        while (i < str.length()) {
            char c = str.charAt(i);


            if (CharSet.contains(c)) {
                CharSet.remove(str.charAt(j));
                j++;
            } else {
                CharSet.add(c);
                max = Math.max(max, i - j + 1);

                i++;
            }

        }
        return max;
    }
}


