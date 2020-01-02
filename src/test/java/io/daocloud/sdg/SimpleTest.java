package io.daocloud.sdg;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: gaoqiang
 * @Date: 2019/10/29 9:53 AM
 */
public class SimpleTest {
    @Test
    public void test_false_simple() {
        int prepare = 1;
        int result = 2;
        Assert.assertFalse(prepare > result);
    }

    @Test
    public void test_true_simple() {
        boolean result = 2 > 1;
        Assert.assertTrue(result);
    }

    @Test
    public void test_equal_simple() {
        Assert.assertEquals("test", "test");
    }
}
