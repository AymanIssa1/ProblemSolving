package ayman.problemsolving.com

// 1290. Convert Binary Number in a Linked List to Integer
// https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/

class Solution {
    fun getDecimalValue(head: ListNode?): Int {
        var s = ""
        var currentNode = head
        var result = 0.0
        while (currentNode != null) {
            s += currentNode.`val`
            currentNode = currentNode.next
        }

        for (i in s.length - 1 downTo 0) {
            if (s[i] == '1')
                result += Math.pow(2.0, ((s.length - i - 1).toDouble()))
        }
        return result.toInt()
    }
}