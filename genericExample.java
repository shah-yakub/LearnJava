import java.util.ArrayList;
import java.util.List;

public class genericExample {
    public static void main(String[] args) {

        // Example without Generics
        List names = new ArrayList();
        names.add("Yakub Shah");
        names.add(7);
        String name = (String) names.get(0);

        System.out.println(name);

        // Example with Generics
        List<String> namesG = new ArrayList();
        namesG.add("Yakub Shah");

        String nameG = namesG.get(0); // no need to cast the type
        /* namesG.add(7); // Results in compile error */
        System.out.println(nameG);

    }
}