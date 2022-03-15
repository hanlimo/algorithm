package com.hanlimo.algorithm.ans;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//假设 Andy 和 Doris 想在晚餐时选择一家餐厅，并且他们都有一个表示最喜爱餐厅的列表，每个餐厅的名字用字符串表示。
//
//你需要帮助他们用最少的索引和找出他们共同喜爱的餐厅。 如果答案不止一个，则输出所有答案并且不考虑顺序。 你可以假设答案总是存在。

@Service
public class Ques599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
//        吧list1放入哈希表
        Map<String, Integer> hashmap = new HashMap<String, Integer>();
        for (int i = 0; i < list1.length; i++) {
            hashmap.put(list1[i], i);
        }

        List<String> ret = new ArrayList<String>();
        int indexSum = list1.length+ list2.length;
        for (int i = 0; i < list2.length; i++) {
            if (hashmap.containsKey(list2[i])) {
                int j = hashmap.get(list2[i]);
                if (j > indexSum){
                    return ret.toArray(new String[ret.size()]);
                }else if (i + j < indexSum) {
                    ret.clear();
                    ret.add(list2[i]);
                    indexSum = i + j;
                } else if (i + j == indexSum) {
                    ret.add(list2[i]);
                }
            }
        }
        System.out.println(ret.toArray(new String[ret.size()]));
        System.out.println(ret);
        return ret.toArray(new String[ret.size()]);
    }
}
