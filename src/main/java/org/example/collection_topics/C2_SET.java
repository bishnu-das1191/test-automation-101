package org.example.collection_topics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class C2_SET {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        System.out.println(set.isEmpty());
        System.out.println(set.size());

        boolean isAddedToSet = set.add(5);
        set.add(3);
        set.add(12);
        boolean isAddedToSetTest = set.add(3);

        System.out.println(set);
        System.out.println(set.size());

        System.out.println(isAddedToSet);
        System.out.println(isAddedToSetTest);

        //iterate through SET
        for(int value : set){
            System.out.println(value);
        }

        //iterate using Iterator
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        set.remove(12);
        System.out.println(set);

        // Remove duplicates elements from integer array
        int[] input = {3,2,5,1,2,3};
        LinkedHashSet<Integer> result = new LinkedHashSet<>();
        for(int val : input){
            result.add(val);
        }
        System.out.println(result);


    }
}
