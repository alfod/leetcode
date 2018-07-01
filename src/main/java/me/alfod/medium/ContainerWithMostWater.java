package me.alfod.medium;

/**
 * Created by Arvin Alfod on 2018/7/1.
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = 0, area;
        int firstHeight, secondHeight, maxLeftHeight = 0, maxRightHeight, rightMaxIndex = height.length - 1;
        for (int i = 0; i < rightMaxIndex; i++) {
            firstHeight = height[i];
            if (firstHeight > maxLeftHeight) {
                maxLeftHeight = firstHeight;
                maxRightHeight = 0;
            } else {
                continue;
            }
            for (int j = rightMaxIndex; j > i; j--) {
                secondHeight = height[j];
                if (secondHeight > maxRightHeight) {
                    maxRightHeight = secondHeight;
                } else {
                    continue;
                }
                area = Math.min(firstHeight, secondHeight) * (j - i);
                if (area > maxArea) {
                    rightMaxIndex = j;
                    maxArea = area;
                }
            }
        }
        return maxArea;
    }
}
