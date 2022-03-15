package com.hanlimo.algorithm.ans;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Ques599Test {
    @Autowired
    Ques599 ques599;
    @Test
    public void test(){
        System.out.println("输出结果");
        String[] list1 = {"BB","Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"KFC", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun","TT"};
        ques599.findRestaurant(list1, list2);
    }
}
