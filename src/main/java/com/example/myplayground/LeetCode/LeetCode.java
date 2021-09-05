package com.example.myplayground.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode {

    private static int[] findTwoSum_BruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    private static List<Integer[]> findThreeSum_BruteForce(int[] nums, int target) {
        List<Integer[]> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == target) {
                        result.add(new Integer[] { nums[i], nums[j], nums[k] });
                    }
                }
            }
        }
        return result;
    }

    private static List<Integer[]> findThreeSum_Sorting(int[] nums, int target) {
        List<Integer[]> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                if (nums[i] + nums[left] + nums[right] == target) {
                    result.add(new Integer[] { nums[i], nums[left], nums[right] });
                    left++;
                    right--;
                } else if (nums[i] + nums[left] + nums[right] < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }

    private static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (i < n - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
            nums[j++] = nums[i];
        }
        return j;
    }
}
