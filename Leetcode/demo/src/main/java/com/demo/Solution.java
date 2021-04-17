package com.demo;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public int removeElement(int[] nums,int val) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
  
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
    public ListNode removeElements(ListNode head, int val) {
     
        //bat output [0,1,2,3,4,5]
        // ListNode helper = new ListNode(0); 
        // helper.next = head;
        // ListNode p = helper;
        
        // while(p.next != null){
        //   if(p.next.val == val){
        //       ListNode next = p.next;
        //       p.next = next.next;
        //   }else{
        //       p = p.next;
        //   }
        //   return helper;
        // }

        ListNode dummy = new ListNode(0); 
        dummy.next = head;
        head = dummy;
        
        while(head.next != null){
          if(head.next.val == val){
              head.next = head.next.next;
          }else{
              head = head.next;
          }
        }
        return dummy.next;
    }
    
    }