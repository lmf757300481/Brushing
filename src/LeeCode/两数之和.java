package LeeCode;

import java.util.HashMap;
import java.util.Map;

public class 两数之和 {

	class Solution {
		public int[] twoSum1(int[] nums, int target) {
			
			int[] returnIndex = new int[2];
			boolean hasFound = false; 
			for (int i = 0; i < nums.length; i++) {
				if (!hasFound) {
					for (int j = i + 1; j < nums.length; j++) {
						int sun = nums[i] + nums[j];
						if (sun == target) {
							hasFound = true;
							returnIndex[0] = i;
							returnIndex[1] = j;
							break;
						}
					}
				} else {
					break;
				}
			}
			if (hasFound) {
				return returnIndex;
			} else {
				throw new IllegalArgumentException("No two sum solution");
			}

		}
	}
	
	public int[] twoSum2(int[] nums, int target) {  ///方法一：暴力法
	    for (int i = 0; i < nums.length; i++) {
	        for (int j = i + 1; j < nums.length; j++) {
	            if (nums[j] == target - nums[i]) {
	                return new int[] { i, j };
	            }
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}

	public int[] twoSum3(int[] nums, int target) {
		//通过以空间换取速度的方式，我们可以将查找时间从 O(n)O(n) 降低到 O(1)O(1)。
		//哈希表正是为此目的而构建的，它支持以 近似 恒定的时间进行快速查找。我用“近似”来描述，
		//是因为一旦出现冲突，查找用时可能会退化到 O(n)O(n)。
		//但只要你仔细地挑选哈希函数，在哈希表中进行查找的用时应当被摊销为 O(1)O(1)。
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        map.put(nums[i], i);
	    }
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement) && map.get(complement) != i) {
	            return new int[] { i, map.get(complement) };
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
	
	
	public int[] twoSum4(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement)) {
	            return new int[] { map.get(complement), i };
	        }
	        map.put(nums[i], i);
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
}
