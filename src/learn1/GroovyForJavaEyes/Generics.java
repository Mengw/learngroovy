package learn1.GroovyForJavaEyes;

import java.util.ArrayList;

public class Generics {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
//        list.add("2");

        for(int element : list){
            System.out.println(element);
        }
    }
}
