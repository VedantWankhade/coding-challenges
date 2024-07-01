package arraysandhashing

/*
Problem - https://leetcode.com/problems/two-sum/description/

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]

Constraints:
2 <= nums.length <= 10^4
-10^9 <= nums[i] <= 10^9
-10^9 <= target <= 10^9
Only one valid answer exists.

Follow-up: Can you come up with an algorithm that is less than O(n^2) time complexity?
*/
func twoSum(nums []int, target int) []int {
	counts := make(map[int]int)
	for i, num := range nums {
		if count, ok := counts[target-num]; ok {
			return []int{i, count}
		}
		counts[num] = i
	}
	return []int{-1, -1} // will never reach as the problem states that there is always a solution
}
