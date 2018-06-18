package LeeCode;

import java.util.HashMap;
import java.util.Map;

public class ����֮�� {

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
	
	public int[] twoSum2(int[] nums, int target) {  ///����һ��������
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
		//ͨ���Կռ任ȡ�ٶȵķ�ʽ�����ǿ��Խ�����ʱ��� O(n)O(n) ���͵� O(1)O(1)��
		//��ϣ������Ϊ��Ŀ�Ķ������ģ���֧���� ���� �㶨��ʱ����п��ٲ��ҡ����á����ơ���������
		//����Ϊһ�����ֳ�ͻ��������ʱ���ܻ��˻��� O(n)O(n)��
		//��ֻҪ����ϸ����ѡ��ϣ�������ڹ�ϣ���н��в��ҵ���ʱӦ����̯��Ϊ O(1)O(1)��
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
