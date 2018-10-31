import java.util.Arrays;

public class Unique {

    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example

        System.out.println(unique(new int[] {8, 1,10, 8, 0, 1, 11, 8, 1, 22,8, 61,8}));
        //  should print: `[1, 11, 34, 52, 61]`

    }
    //THE SOLUTION STARTS FROM HERE:
    public static String unique(int[] array){                    // we create the function/method as a String type

        int counter =0;                                          // counter for duplicates in the given array
        for (int i = 0; i <array.length ; i++) {                //iterating through the given array

            for (int j = i+1; j <array.length ; j++) {          // one more iteration needed as we compare 2 numbers with diff indexes ie. is array[2] == array[3]?
                if(array[i]==array[j]){                          // that's why j starts from i+1 - we don't compare the number to itself

                    counter++;                                          // if there is a duplication, counter increments by 1
                    break;                                              //jumps to outer loop in case of duplication - by this we can handle cases when an element occurs 3,4,5..times in the array
                }
            }

        }
        int [] newArray = new int[array.length- counter];   // once we know how many duplicates are in the given array, we can declare the newArray containing only single values and its size will be given array's length - counter (duplicates)
        int m = 0;                                          // m will be the index number in the newArray
        for (int i = 0; i <array.length ; i++){             //iterating through the given array to pick its element one by one

            if (!itContains(newArray,array[i], m)){  //calling a method here - check below // in the condition we are checking if the given array's element is already in the newArray or not - but considering it only until the m index which is the fist element in the beginning
                newArray[m]= array[i];          // if the condition is true (so the newArray does NOT contain yet the given array's element) we set this value as the [0]index element of our newArray and so on
                m++;                            // we incrementing the newArrays index - as the [0] index is taken already and so on
            }

        }
        return Arrays.toString(newArray);                       //returns the newArray with single values, as the return value is string type, the method's type must be string too
    }

    //this method decides whether the array contains a value or not
    public static boolean itContains (int[] array, int b, int m) { // has 3 parameters - an array, an element, m - index number
        boolean contains = false;                                  // first we set the boolean false

        for (int i = 0; i <m; i++) {                                //we are iterating through the array BUT always until the given m index - we don't check the whole array
            // ie. in array[1, 6, 2, 13, 0, 0 , 0] we are iterating until the [3] index (value 13) so that we can handle 0 value - if 0 isn't between 1 and 13 , then we can add to it in later steps
            if (array[i] == b) {                                    //if the number equals to an array element, we set the boolean true
                contains = true;
            }
        }
        return contains;                                            // returning the boolean value - it is true when contains, false when not containing

    }



}
