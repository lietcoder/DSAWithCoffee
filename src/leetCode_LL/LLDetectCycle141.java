package leetCode_LL;

public class LLDetectCycle141 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
            this.next =null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node node2 = new Node(2);
        Node node3= new Node(3);
        Node node4 = new Node(4);
        head.next = node2;
        node2.next= node3;
        node3.next = node4;
        node4.next =node2;
        System.out.println("Head's next: "+ head.next.data);
        System.out.println("Head node is: "+ head.data);
        System.out.println("Node3 next is :"+ node3.next.data);
        System.out.println("Node4 next is :"+ node4.next.data);
        System.out.println("Node4 next next is :"+ node4.next.next.data);

        System.out.println("Does LL has cycle: "+ hasCycle(head));
    }
    static boolean hasCycle(Node head){
        if(head==null || head.next==null)
            return false;
        Node slow = head;
        Node fast = head;
        int counter=0;
        while(slow.next!=null){
            slow = slow.next;
            fast = fast=fast.next.next;
            counter++;
            System.out.println("slow is: "+ slow.data);
            System.out.println("fast is: "+ fast.data);
            if(slow == fast) {
                System.out.println("count: "+ counter);
                return true;
            }
        }
        System.out.println("count: "+ counter);
        return false;
    }
}
