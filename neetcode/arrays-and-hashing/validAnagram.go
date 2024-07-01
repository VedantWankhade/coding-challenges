package arraysandhashing

/*
Problem - https://leetcode.com/problems/valid-anagram/description/

Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false

Constraints:
1 <= s.length, t.length <= 5 * 10^4
s and t consist of lowercase English letters.

Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
*/
func isAnagram(s string, t string) bool {
	if len(s) != len(t) {
		return false
	}
	var arr [26]int
	for _, r := range s {
		arr[r-'a']++
	}
	for _, r := range t {
		arr[r-'a']--
	}
	for _, count := range arr {
		if count != 0 {
			return false
		}
	}
	return true
}

/*
func isAnagram(s string, t string) bool {
	if len(s) != len(t) {
		return false
	}
	hash := make(map[rune]int)
	for _, r := range s {
		hash[r]++
	}
	for _, r := range t {
		hash[r]--
	}
	for _, v := range hash {
		if v != 0 {
			return false
		}
	}
	return true
}
*/
