public class varArgs {

    public static void main(String[] args) {

        String item1 = new String("Apple");
        String item2 = new String("Jam");
        String item3 = new String("Cooking Oil");

        String[] shoppingList = { item1, item2, item3 };

        printListString(item1, item2);
        printListString(item1, item2, item3);
        printListString(shoppingList);

        System.out.println("*********************VarArgs********************");
        printListvarArgs(item1);
        printListvarArgs(item1, item2);
        printListvarArgs(item1, item2, item3);
        printListvarArgs(shoppingList);

    }

    private static void printListString(String string1, String string2) {
        System.out.println("-----------------");
        System.out.println("Shopping List 01");
        System.out.println("-----------------");
        System.out.println("1." + string1);
        System.out.println("2." + string2);
        System.out.println("-----------------");
    }

    private static void printListString(String string1, String string2, String string3) {
        System.out.println("-----------------");
        System.out.println("Shopping List 02");
        System.out.println("-----------------");
        System.out.println("1." + string1);
        System.out.println("2." + string2);
        System.out.println("3." + string3);
        System.out.println("-----------------");
    }

    private static void printListString(String[] sList) {
        System.out.println("-----------------");
        System.out.println("Shopping List 03");
        System.out.println("-----------------");
        for (int i = 0; i < sList.length; i++) {
            System.out.println(i + 1 + "." + sList[i]);
        }
        System.out.println("-----------------");
    }

    private static void printListvarArgs(String... sList) {
        System.out.println("-----------------");
        System.out.println("Shopping List");
        System.out.println("-----------------");
        for (int i = 0; i < sList.length; i++) {
            System.out.println(i + 1 + "." + sList[i]);
        }
        System.out.println("-----------------");
    }

}