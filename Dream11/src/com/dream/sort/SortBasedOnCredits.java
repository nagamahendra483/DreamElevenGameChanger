package com.dream.sort;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortBasedOnCredits {
	public static LinkedHashMap<String, Double> sortByValue(LinkedHashMap<String, Double> hm) 
    { 
        // Create a list from elements of LinkedHashMap 
        List<Map.Entry<String, Double> > list = 
               new LinkedList<Map.Entry<String, Double> >(hm.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<String, Double> >() { 
            public int compare(Map.Entry<String, Double> o1,  
                               Map.Entry<String, Double> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
          
        // put data from sorted list to LinkedHashMap  
        LinkedHashMap<String, Double> temp = new LinkedHashMap<String, Double>(); 
        for (Map.Entry<String, Double> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    }
}
