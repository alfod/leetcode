package leetcode.medium;

import leetcode.BaseTest;
import me.alfod.medium.ContainerWithMostWater;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Arvin Alfod on 2018/7/1.
 */
public class ContainerWithMostWaterTest extends BaseTest {
    private ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();

    @Test
    public void test1() {
//        int area = containerWithMostWater.maxArea(new int[]{1, 2, 3});
//        Assert.assertEquals(4, area);
    }

    @Test
    public void test2() {
        int area = containerWithMostWater.maxArea(new int[]{0, 2});
        Assert.assertEquals(0, area);
    }

    @Test
    public void test3() {
        int area = containerWithMostWater.maxArea(new int[]{1, 2, 4, 3});
        Assert.assertEquals(4, area);
    }

    @Test
    public void test5() {
        int area = containerWithMostWater.maxArea(new int[]{9, 1, 30, 4, 9});
        Assert.assertEquals(4, area);
    }

    @Test
    public void test4() {
        ClassLoader classLoader = this.getClass().getClassLoader();
        URL url = classLoader.getResource("ContainerWithMostWaterArray");
        String path = url.getPath();
        File file = new File(path);
        Long length = file.length();
        byte[] contents = new byte[length.intValue()];
        String arrayStr;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.read(contents);
        } catch (IOException e) {
            e.printStackTrace();
        }
        arrayStr = new String(contents);
        List<Integer> integers = new LinkedList<>();
        for (String s : arrayStr.split(",")) {
            integers.add(Integer.valueOf(s));
        }
        int[] array = new int[integers.size()];
        for (int i = 0; i < integers.size(); i++) {
            array[i] = integers.get(i);
        }
        long t1 = System.nanoTime();
        int area = containerWithMostWater.maxArea(array);
        long t2 = System.nanoTime();
        print("time :" + (t2 - t1) / 1000_000 + " ms");
        Assert.assertEquals(4, area);
    }
}
