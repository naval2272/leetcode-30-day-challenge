package week_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class day6 {
  public List<List<String>> groupAnagrams(String[] strs) {

    /*  - Create map of string and list
        - Iterate through the list of strings
            - sort the string and use it as key
            - if resultset contains this key
                - add string to respective map
            - else
                - create new key
    */

    Map<String, List> mapAnagram = new HashMap();
    for(String str : strs) {
      char[] charArr = str.toCharArray();
      Arrays.sort(charArr);

      String key = String.valueOf(charArr);

      if(!mapAnagram.containsKey(key)) {
        mapAnagram.put(key, new ArrayList());
      }
      mapAnagram.get(key).add(str);
    }
    return new ArrayList(mapAnagram.values());
  }
}
