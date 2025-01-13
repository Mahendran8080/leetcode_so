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
    public ListNode deleteMiddle(ListNode head) {

        ListNode curr=head;

        int n=0;

        while(curr!=null)
        {
            n++;
            curr=curr.next;
        }

        if(n==1)
        {
            return null;
        }

        int mid=n/2-1;

        ListNode list=head;
        int pos=0;

        while(list!=null)
        {
            if(mid==pos)
            {
                list.next=list.next.next;
                break;
            }
            pos++;

            list=list.next;

        }

        return head;


        
    }
}