package com.hanlimo.algorithm.ans;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Ques94Test {
    @Autowired
    Ques94 ques94;
    @Autowired
    TreeNode treeNode;
    public void test(){
        ques94.inorderTraversal(treeNode);
    }
}
