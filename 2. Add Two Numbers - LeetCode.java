class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode tmp=new ListNode();
        ListNode res= tmp;
        ListNode ll1=l1;
        ListNode ll2=l2;
        int carry=0;
        
        while(ll1!=null || ll2!=null || carry!=0){
            int val1=0,val2=0;
            
            
            if(ll1!=null){
                val1=ll1.val;
                ll1=ll1.next;
                
            }
            if(ll2!=null){
                val2=ll2.val;
                ll2=ll2.next;
            }
            
            
            int sum=0;
            sum=val1+val2+carry;
            if(sum>9){
                carry=sum/10;
                sum=sum%10;
                
            }else{
                carry=0;
            }
            
            
            
        System.out.println(sum); 
           tmp.next = new ListNode(sum);
            tmp=tmp.next;
            
            
            
        }
        
        return res.next;
        
    }
}
