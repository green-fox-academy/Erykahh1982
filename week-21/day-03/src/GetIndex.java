import java.util.ArrayList;
import java.util.List;

public class GetIndex {

//  Create a function that takes a list and a value, and returns the index of that value in the list. If the value is not in the list, the function should return -1.

  public int findIndex(List list, int value) {
    if(list == null){
      return 0;
    }
    if (list.contains(value)) {
      return list.indexOf(value);
    } else {
      return -1;
    }
  }

}
