package com.pack.java;







public class DoubleLinkedList {
	static class Node
	{
		int data;
		Node prev;
		Node next;
		
	}
	static Node head=null;
	
	static void rotate(int n) {
		if(n==0)
			return;
		Node current=head;
		for(int i=1;i<n;i++)
		{
			current=current.next;
			
		}
		if(current==null)
			return;
		Node NthNode=current;
		while(current.next!=null) {
			current=current.next;
		}
		
		current.next=head;
		head.prev=current;
		
		head=NthNode.next;
		head.prev=null;
		NthNode.next=null;
		
	}
	
	static void add_node(int new_item)
	{
		Node new_node=new Node();
		new_node.data=new_item;
		new_node.prev=null;
		new_node.next=head;
		if(head!=null) {
			head.prev=new_node;
		}
		
		head=new_node;
		
		
	}
	
	static void print(Node node) {
		while(node!=null && node.next!=null)
		{
			System.out.println(node.data+" ");
			node=node.next;
		}
		if(node!=null) {
			System.out.println(node.data);
		}
	}
	public static void main(String args[])
	{
		
		
		add_node(4);
		add_node(3);
		add_node(2);
		add_node(1);
		int n=2;
		System.out.println("List before rotation");
		print(head);
		System.out.println();
		System.out.println("List after rotation");
		rotate(n);
		print(head);
		
		
		
	}
	

}

