package com.zeroten.flow;

import com.lset.file.Accition;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TsetClass {
    @Test
    public  void Test(){
        Assert.assertEquals(Accition.test(),"真好");
    }
    //PDD 测试
}
