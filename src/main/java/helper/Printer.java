package helper;

public class Printer {
    //типизрование
    public static void print(Object... objs) {
        for (Object obj : objs) {
            // auto call ToString method here
            if (obj != null) System.out.print(obj + " ");
        }
        System.out.print(" \n");
        Printer.printLine();

    }
    public static void printLine() {
        for (int i = 0; i < 9; i++) {
            System.out.print("-");
        }
        System.out.print("\n");

    }

    public static String setSpaces(String... strings) {
        String s = "";
        for (String str : strings) {
            if (str != null && str != "" && str != "0") {
                s += str + " ";
            }
        }
        //s += ", \n";
        return s;
    }

}
