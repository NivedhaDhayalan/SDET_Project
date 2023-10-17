package javaprograms;

public class RemoveDuplicateList {
     
	static class node {
		int data ;
		node next;	
		//constructor
		node (int tmp){
			data=tmp;
		}		
}
	 static void printlist(node head) {
		while(head!=null) {
			System.out.println(head.data);
			head = head.next;
		}
	 }
	  static void removeduplicatenodes(node head) {
		  node currentnode = head;
		  while(currentnode!=null&& currentnode.next!=null) {
			  if(currentnode.data==currentnode.next.data) {
			currentnode.next = currentnode.next.next;}
			  else {
				  currentnode = currentnode.next;
			  }
	}
 }
	public static void main(String[] args) {
	node n1 = new node(1);
	node n2 = new node(1);
	node n3 = new node(2);
	node n4 = new node(3);
	node n5 = new node(5);
	node n6 = new node(5);
	node n7 = new node(9);
	n1.next=n2;
	n2.next=n3;
	n3.next=n4;
	n4.next=n5;
	n5.next=n6;
	n6.next=n7;

	
	   System.out.println("LinkedList before removing duplicates");
	   printlist(n1);
	   System.out.println("LinkedList after removing duplicates");
	   removeduplicatenodes(n1);
	   printlist(n1);
	}
}
