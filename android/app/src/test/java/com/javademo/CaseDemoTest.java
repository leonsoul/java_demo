package com.javademo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.prefs.PreferencesFactory;

import static org.junit.Assert.*;

/**
 * Auther: wangben
 * CreateAt: 2020/10/21
 * Describer: CaseDemoTest
 */
@RunWith(Parameterized.class)
public class CaseDemoTest {
    private CaseDemo mCaseDemo;
    private int num;
    private int nums;
    private int result;
    public CaseDemoTest(int nums,int num,int result){
        this.num = num;
        this.nums = nums;
        this.result = result;
    }
    @Parameterized.Parameters
    public static Collection<Integer[]> getParams(){
        Integer[][] object= {{1,2,3},{1,1,2},{1,-1,0},{-1,-4,-5}};
//        Integer[][] object= {{1,2},{1,1},{1,-1},{-1,-4}};
        return Arrays.asList(object);
    }
    @Before
    public void setUp(){
        mCaseDemo = new CaseDemo();
    }
    @Test
    public void onetest() throws Exception{
        assertEquals(this.result,mCaseDemo.getAdd(num,nums));
    }
}
