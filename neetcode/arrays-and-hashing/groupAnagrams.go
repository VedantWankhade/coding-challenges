package arraysandhashing

/*
Problem - https://leetcode.com/problems/group-anagrams/

Given an array of strings strs, group the anagrams together. You can return the answer in any order.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.

Example 1:
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Example 2:
Input: strs = [""]
Output: [[""]]

Example 3:
Input: strs = ["a"]
Output: [["a"]]

Constraints:
1 <= strs.length <= 10^4
0 <= strs[i].length <= 100
strs[i] consists of lowercase English letters.
*/
func groupAnagrams(strs []string) [][]string {
	if len(strs) < 2 {
		return [][]string{strs}
	}
	anagramMap := make(map[[26]int][]string)
	for _, str := range strs {
		strKey := key(str)
		if s, ok := anagramMap[strKey]; ok {
			anagramMap[strKey] = append(s, str)
		} else {
			anagramMap[strKey] = []string{str}
		}
	}
	var ans [][]string
	for _, v := range anagramMap {
		ans = append(ans, v)
	}
	return ans
}

func key(str string) [26]int {
	var key [26]int
	for _, r := range str {
		key[r-'a']++
	}
	return key
}
