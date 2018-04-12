package com.semyardi;


import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

public class HelloTest {
    @Test
    public void contextLoads(){
        FileSearch s=new FileSearch();
        Map<String,String> map= new TreeMap<>();
        s.search("C://",map);
        /*for (String ster:map.values()) {

            System.out.println(ster);
        }*/
        //another variant
        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println("Name "+entry.getKey()+" -- "+"Path: "+entry.getValue());

        }
    }
}
