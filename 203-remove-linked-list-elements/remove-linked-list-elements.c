/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeElements(struct ListNode* head, int val) {

    if(head==NULL)
    {
        return head;

    }

    struct ListNode dummy;

    dummy.next=head;

    struct ListNode* prev=&dummy;
    struct ListNode* curr=head;

    while(curr!=NULL)
    {
        if(curr->val==val)
        {
            prev->next=curr->next;
        }
        else
        {
            prev=curr;
        }
        curr=curr->next;
    }

    return dummy.next;
    
}