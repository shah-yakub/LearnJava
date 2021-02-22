import java.util.ArrayList;
import java.util.List;

import javax.print.PrintService;

public class genericMethods01 {

    public static Character[] charArray = { "a", "e", "i", "o", "u" };
    public static int[] intArray = { 1, 2, 3, 4, 5 };
    public static Boolean[] boolArray = { true, false, true, false };

    public static<T> List<T> listToArray(T[] array, List<T> list) {

        for (T objectEach : array) {
            list.add(objectEach);
        }
        return list;
    }

    public static void main(String[] args) {

        List<Character> charList = listToArray(charArray, new ArrayList<>());

        // System.out.println(charList);

    }
}
