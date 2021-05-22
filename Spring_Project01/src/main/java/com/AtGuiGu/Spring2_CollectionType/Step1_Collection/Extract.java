package com.AtGuiGu.Spring2_CollectionType.Step1_Collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Chaoqun Cheng
 * @date 2021-04-2021/4/23-20:15
 */

public class Extract {



    //List集合
    private List<String> list;

    //map
    private Map<String, String> map;

    //set
    private Set<String> set;


    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }


    public void show(){
        System.out.println(list);
        System.out.println(map);
        System.out.println(set);

    }

}
