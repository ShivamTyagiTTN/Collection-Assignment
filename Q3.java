//Q.3 Write a method that takes a string and print the number of occurrence of each character characters in the string.

import java.util.LinkedHashMap;
import java.util.Map;

class CharCount{
    public static void countOccurrences(String str)
    {
        String str1 = str.replaceAll("\\s", "");
        Map<Character,Integer> hm=new LinkedHashMap<>();

        for (int j = 0 ; j < str1.length(); j++) {
            char c = str1.charAt(j);

            if (hm.containsKey(c))
                hm.put(c, hm.get(c) + 1);
            else
                hm.put(c, 1);
        }
        for(Map.Entry<Character,Integer> val : hm.entrySet())
            System.out.println(val.getKey()+" "+"occurs "+val.getValue() +" times");
    }
}

public class Q3
{
    public static void main(String[] args) {
        String str = "aaabb cddddd";
        CharCount.countOccurrences(str);
    }
}
//
//Output:
//        a occurs 3 times
//        b occurs 2 times
//        c occurs 1 times
//        d occurs 5 times