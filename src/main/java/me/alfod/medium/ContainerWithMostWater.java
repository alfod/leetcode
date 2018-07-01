package me.alfod.medium;

/**
 * Created by Arvin Alfod on 2018/7/1.
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = 0, area;
        int rightIndex = 0, leftIndex = height.length - 1;
        int rightValue, leftValue;
        while (leftIndex > rightIndex) {
            rightValue = height[rightIndex];
            leftValue = height[leftIndex];
            area = Math.min(leftValue, rightValue) * (leftIndex - rightIndex);
            if (area > maxArea) {
                maxArea = area;
            }
            if (rightValue >= leftValue) {
                leftIndex--;
            } else {
                rightIndex++;
            }
        }
        return maxArea;
    }
}
