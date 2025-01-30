package org.example.collection_topics;

import java.util.ArrayList;
import java.util.List;

public class C1_List {
    public static void main(String[] args) {

      /*  int[] arr = new int[5];
        System.out.println(arr);*/

        List lst = new ArrayList();

        System.out.println(lst.size());
        System.out.println(lst.isEmpty());
        lst.add(10);
        lst.add('b');
        lst.add("Bish");
        lst.add(true);

        System.out.println(lst);
        System.out.println(lst.size());
        System.out.println(lst.isEmpty());
        System.out.println(lst.get(0));
        System.out.println(lst.getFirst());
        System.out.println(lst.getLast());
        System.out.println(lst.get(lst.size()-1));

        // iterate the list

        for(int i=0; i<lst.size(); i++){
            System.out.println(lst.get(i));
        }

        List<Integer> nums  = new ArrayList<>();
        nums.add(10);
        nums.add(10);
        nums.add(20);
        nums.add(40);
        nums.add(30);

        System.out.println(nums);

    }
}
