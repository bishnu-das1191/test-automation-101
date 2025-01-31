package org.example.collection_topics;

import java.util.*;

public class C3_MAP {
    public static void main(String[] args) {

        Map<Character, Integer> map = new HashMap<>();

        System.out.println(map.isEmpty());
        System.out.println(map.size());

        map.put('s',1);
        map.put('h',2);
        map.put('a',3);
        map.put('n',4);
        //map.put('t',4);

        System.out.println(map);
        System.out.println(map.get('a'));
        System.out.println(map.get('s'));
        System.out.println(map.get('i'));

        // iterate through all the Entries present in map
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+","+entry.getValue());
        }

        // print ony keys
        Set<Character> onlyKeys = map.keySet();
        System.out.println(onlyKeys);

        // frequency of characters in s string
        String str = "hello";  // h->1, e->1, l->2, o->1

        LinkedHashMap<Character, Integer> resultMap = new LinkedHashMap<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(resultMap.containsKey(ch)){
                resultMap.put(ch, resultMap.get(ch)+1);
            }else{
                resultMap.put(ch,1);
            }
        }
        System.out.println(resultMap);


    }
}
