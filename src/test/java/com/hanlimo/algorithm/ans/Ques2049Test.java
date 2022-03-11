package com.hanlimo.algorithm.ans;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Ques2049Test {
    @Autowired
    public Ques2049 ques2049;

    @Test
    public void test(){
        int[] parents = {-1,2,0,2,0};
        ques2049.countHighestScoreNodes(parents);
        System.out.println("测试结束");
    }
}
