package javaprograms;

public class merge2list {
       static class Node{
    	   int data;
    	   Node next;
       
	 Node(int d){
		 data =d;
		 next=null;
	 }
	 }
  public static Node merge(Node h1, Node h2) {
		   Node temp_data = new Node(0);
		   Node current = temp_data;
		   while(h1!=null && h2!=null)
		   {
			   if(h1.data<h2.data) {
				   current.next = h1;// l1 = 5     7    9
				   h1 = h1.next;     // l2 = 6      8    10
				    }
			   else {
				   current.next =h2;
					   h2=h2.next;
			   }
			   current = current.next;
			   if(h1==null) {
				   current.next =h2;
			   }
			   if(h2==null) {
				   current.next = h1;
			   }
		   } 
	   return temp_data.next;
		   }
public static void main(String[] args) {
		Node head1 = new Node(2);
		head1.next =new  Node(4);
		head1.next.next = new  Node(6);
		
	     Node head2 = new Node(3);
		 head2.next = new Node(5);
		 head2.next.next = new Node(7);
		 System.out.println("after merging two list");
	    Node head = merge(head1, head2);
	    
	    while(head!=null) {
			System.out.println(head.data);
			head = head.next;
		
			
		}

}}	





