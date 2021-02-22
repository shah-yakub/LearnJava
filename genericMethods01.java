import java.util.ArrayList;
import java.util.List;

public class genericMethods01 {

    public static Character[] charArray = { 'a', 'e', 'i', 'o', 'u' };
    public static Integer[] intArray = { 1, 2, 3, 4, 5 };
    public static Boolean[] boolArray = { true, false, true, false };

    // T will be a local type and will depend on the parameter passed
    public static <T> List<T> listToArray(T[] array) {

        List<T> list = new ArrayList<T>();

        for (T objectEach : array) {
            list.add(objectEach);
        }
        return list;
    }

    public static void main(String[] args) {

        List<Character> charList = listToArray(charArray);
        List<Integer> intList = listToArray(intArray);

        System.out.println(charList);
        System.out.println(intList);

    }
}
