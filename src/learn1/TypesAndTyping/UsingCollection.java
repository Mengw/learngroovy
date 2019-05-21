package learn1.TypesAndTyping;

import java.util.ArrayList;
import java.util.Collection;

public class UsingCollection {


    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<>();

        Collection<String> col = lst;

        lst.add("one");
        lst.add("tow");
        lst.add("three");

        lst.remove(0);

        col.remove(0);

        System.out.println(lst.size());
        System.out.println(col.size());

    }
}
