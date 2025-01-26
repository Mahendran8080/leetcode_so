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
class Solution {
    public int pairSum(ListNode head) {

        ListNode curr=head;

        int len=0;

        while(curr!=null)
        {
            len++;
            curr=curr.next;
        }
        int[] arr=new int[len];

        ListNode temp=head;
        int idx=0;
        while(temp!=null)
        {
            arr[idx++]=temp.val;
            temp=temp.next;
        }

        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            int sum=arr[i]+arr[len-1-i];

            if(sum>max)
            {
                max=sum;
            }
        }

        return max;

        
    }
}