
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rs=new ListNode(0);
        ListNode a=rs;
        int carry=0;
        while(l1 != null || l2!=null){
            int sum = 0+carry;

            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            carry = sum/10;
            sum=sum%10;
            a.next = new ListNode(sum);
            a=a.next;
        }
        if(carry == 1)
        a.next= new ListNode(1);
        return rs.next;
    }
}