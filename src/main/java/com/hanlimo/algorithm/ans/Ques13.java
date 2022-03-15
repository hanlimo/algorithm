package com.hanlimo.algorithm.ans;

import java.util.HashMap;
import java.util.Map;

//罗马数字转整型罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
public class Ques13 {
    Map<Character, Integer> symbolValues = new HashMap<Character, Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

}
