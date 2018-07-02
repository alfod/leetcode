package leetcode.medium;

import me.alfod.medium.TripletsSumClosest;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Arvin Alfod on 2018/7/2.
 */
public class TripletsSumClosestTest {
    private TripletsSumClosest tripletsSumCloest = new TripletsSumClosest();

    @Test
    public void test1() {
        int[] nums = new int[]{-1, 2, 1, -4};
        int result = tripletsSumCloest.threeSumClosest(nums, 1);
        Assert.assertEquals(2, result);

    }
}
