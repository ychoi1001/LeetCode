/**
 * 
 */
package leetcode.Algorithms;

/**
 * @author oliviachoi
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */
public class Java01_twoSum {
	/**
	 * 
	 * @param nums
	 * @param target
	 * @return indices of the two numbers 
	 * Time complexity of this algorithm is O(n^2).
	 */
	public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
        	for (int j = i + 1; j < nums.length; j++) {
        		if (nums[i] + nums[j] == target) {
        			return new int[] {i, j};
        		}
        	}
        }
        throw new IllegalArgumentException("No two sum solution");
    }
	
	
	public static void main(String[] args) {
		int [] nums = new int[] {3, 3};
		int target = 6;
		Java01_twoSum ts = new Java01_twoSum();
		int[] answer = ts.twoSum(nums, target);
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}

	}

}
