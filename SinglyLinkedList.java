public class SinglyLinkedList{
  private Node head;
   public void display(){
     Node current;
     current=head;
     while(current!=null){
       System.out.print(current.data+"-->");
       current=current.next;
     }
     System.out.println("null");
   }
   public void displaylength(){
     Node current;
     current=head;
     int count =0;
     while(current!=null){
       count++;
       current=current.next;
     }
     System.out.println("length of sll is: "+count);
   }
   private static class Node{ 
     private int data;
     private Node next;
     public Node(int data){
       this.data = data;
       this.next = null;
     }
     
   }
   public void insertatb(int data){
     Node temp = new Node(data);
     temp.next = head;
     head =temp;
   }
   public void insertate(int data){
     Node temp = new Node(data);
     if(head==null){
       head=temp;
       return;
     }
     Node curr = head;
     while (curr.next!=null){
       curr=curr.next;
     }
     curr.next = temp;
   }
   public void insertinm(int data, int index){
     Node x = new Node(data);
     Node prev = head;
     int count =0;
     if(index==0){
       x.next = head;
       head=x;
       return;
     }
     while(count<index-1){
       prev = prev.next;
       count++;
     }
     Node curr = prev.next;
     prev.next = x;
     x.next = curr;
   }
   public static void main(String args[])
   { 
    SinglyLinkedList sll=new SinglyLinkedList();
    System.out.println("when length of sll is 0 then head value is : "+sll.head);
    sll.head=new Node(10);
    Node second =new Node(11);
    Node third =new Node(12);
    Node fourth = new Node(13);
    sll.head.next = second;
    second.next = third;
    third.next = fourth;
    sll.display();
    sll.displaylength();
    sll.insertatb(9);
    System.out.println("running the methods after inserting 9 at begging of sll");
    sll.display();
    sll.displaylength();
    sll.insertate(14);
    System.out.println("running the methods after inserting 14 at ending of sll");
    sll.display();
    sll.displaylength();
    System.out.println("inserting at begging using insert in middle");
    sll.insertinm(8,0);
    sll.display();
    sll.displaylength();
    System.out.println("inserting in midlle");
    sll.insertinm(15,3);
    sll.display();
    sll.displaylength();
   }
}
