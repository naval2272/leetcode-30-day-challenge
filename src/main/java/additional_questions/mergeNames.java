package additional_questions;

/*
Implement the uniqueNames method. When passed two arrays of names, it will return an array containing the names that appear
 in either or both arrays. The returned array should have no duplicates.

For example, calling MergeNames.uniqueNames(new String[]{'Ava', 'Emma', 'Olivia'}, new String[]{'Olivia', 'Sophia', 'Emma'})
 should return an array containing Ava, Emma, Olivia, and Sophia in any order.
*/

import java.util.HashSet;
import java.util.Set;

public class mergeNames {
  public static String[] uniqueNames(String[] names1, String[] names2) {
    //throw new UnsupportedOperationException("Waiting to be implemented.");
    Set<String> unique = new HashSet<String>();
    for(String str: names1) {
      unique.add(str);
    }

    for(String str: names2) {
      unique.add(str);
    }

    String[] arrayOfString = new String[unique.size()];

    // Copy elements from set to string array
    // using advanced for loop
    int index = 0;
    for (String str : unique)
      arrayOfString[index++] = str;

    // return the formed String[]
    return arrayOfString;
  }

  public static void main(String[] args) {
    String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
    String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
    System.out.println(String.join(", ", mergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
  }
}
