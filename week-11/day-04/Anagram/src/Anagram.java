import java.util.Arrays;

public class Anagram {

  public boolean checkAnagram(String s1, String s2) {

    if((s1 == null) && (s2 == null)){
      return false;
    }

    if ((s1 == "") && (s2 == "")){
      return false;
    }

    char[] s1Array = s1.toCharArray();
    char[] s2Array = s2.toCharArray();

    for (int i = 0; i < s1Array.length - 1; i++) {
      for (int j = i + 1; j < s1Array.length; j++) {
        if (s1Array[i] > s1Array[j]) {
          char Sort1 = s1Array[j];
          s1Array[j] = s1Array[i];
          s1Array[i] = Sort1;
        }
      }
    }
    for (int k = 0; k < s2Array.length - 1; k++) {
      for (int l = k + 1; l < s2Array.length; l++) {
        if (s2Array[k] > s2Array[l]) {
          char Sort2 = s2Array[l];
          s2Array[l] = s2Array[k];
          s2Array[k] = Sort2;
        }
      }
    }
    boolean equal = Arrays.equals(s1Array, s2Array);
    return equal;
  }
}
