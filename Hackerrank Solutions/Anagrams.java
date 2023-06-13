import java.util.Scanner;
// using hashmap time complexity is O(n)
// using sort method complexity is O(nlogn)
public class Anagrams
{
    static boolean isAnagram(String a, String b) {
        // Complete the function
        java.util.HashMap<Character, Integer> aMap = new java.util.HashMap<Character, Integer>();
        java.util.HashMap<Character, Integer> bMap = new java.util.HashMap<Character, Integer>();

        if (a.length() != b.length())
            return false;

        a = a.toLowerCase();
        b = b.toLowerCase();

        for (int i = 0; i < a.length(); i++) {
            char key = a.charAt(i);
            if (!aMap.containsKey(a.charAt(i)))
                aMap.put(key, 1);
            else
                aMap.put(key, aMap.get(key) + 1);
        }

        for (int i = 0; i < b.length(); i++) {
            char key = b.charAt(i);
            if (!bMap.containsKey(b.charAt(i)))
                bMap.put(key, 1);
            else
                bMap.put(key, bMap.get(key) + 1);
        }

        if (aMap.equals(bMap))
            return true;
        else
            return false;
    }
}

// review the code.
