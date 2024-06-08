package arrays;

import java.util.ArrayList;
public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        list.add(64);

        list.add(77);
        list.add(23);
        list.add(756);
        list.add(22);

        System.out.println(list);
        list.set(0,99);
        System.out.println(list);

        System.out.println(list.contains(22));
    }
}
