package org.zephyr.generator;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

/**
 * 文件描述
 *
 * @ProductName: Hundsun
 * @ProjectName: mybatis-generator
 * @Package: org.zephyr.generator
 * @Description: note
 * @Author: yangkai25796
 * @CreateDate: 2019/6/27 15:49
 * @UpdateUser: yangkai25796
 * @UpdateDate: 2019/6/27 15:49
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>
 * Copyright © 2019 Hundsun Technologies Inc. All Rights Reserved
 **/
public class demo {
    public static void main(String[] args) {
       IdentityHashMap<String, String> map = new IdentityHashMap<>();
        //HashMap<String, String>  map = new HashMap<>();
        map.put("a", "a1");
        map.put("a", "a2");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"----------"+entry.getValue());
        }
    }
}
