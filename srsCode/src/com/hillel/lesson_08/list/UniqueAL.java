package com.hillel.lesson_08.list;

import java.util.ArrayList;
import java.util.List;

public class UniqueAL {

    List<String> list = new ArrayList<>();

    public boolean add(String str){
        if (!list.contains(str)){
            return list.add(str);
        }
        return false;
    }
}
