package OperationLinkedList;

import java.util.Scanner; 

public class SinglyLinkedList {

	Node head;
	public SinglyLinkedList()
	{
		head=null;
	}

	public void addNode(int data)
	{
		Node newnode=new Node(data);
		if(head==null)
			head=newnode;
		else
		{
			Node move;
			for(move=head;move.next!=null;move=move.next);
			move.next=newnode;
		}
	}

	public void createLinkedList(int size)
	{
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=size;i++)
		{
			int data;
			System.out.println("Enter data: ");
			data=sc.nextInt();
			addNode(data);
		}
	}


	public void display()
	{
		Node move=head;
		while(move!=null)
		{
			System.out.print(move.data+" ");
			move=move.next;
		}
	}


	//Reverse
	public void Reverse(Node head)
	{
		Node move=head;
		if(move!=null)
		{
			Reverse(move.next);
			System.out.print(move.data+" ");
		}
	}

	//Middle element
	public void Middle(Node head)
	{
		Node slowptr=head;
		Node fastptr=head;
		while(fastptr!=null && fastptr.next!=null)
		{
			fastptr=fastptr.next.next;
			slowptr=slowptr.next;
		}
		System.out.println("The middle element is : "+slowptr.data);
	}

	//Split linkedlist
	public void SplitLink()
	{
		SinglyLinkedList list1=new SinglyLinkedList();
		SinglyLinkedList list2=new SinglyLinkedList();
		Node move=head;
		while(move!=null)
		{
			if(move.data%2==0)
				list1.addNode(move.data);
			else
				list2.addNode(move.data);
			move=move.next;
		}
		list1.display();
		System.out.println();
		list2.display();
	}

	//Merge two linked lists
	public void Merge(Node head2)
	{
		Node move=head;
		while(move.next!=null)
		{
			move=move.next;
		}
		move.next=head2;
	}

	//Sort at the time of creating linked list
	public void sort(int data)
	{
		Node newnode=new Node(data);
		if(head==null)
		{
			head=newnode;
			return;
		}
		if(head.next==null)
		{
			if(data<head.data)
			{
				newnode.next=head;
				head=newnode;
			}
			else
			{
				head.next=newnode;
			}
			return;
		}
		else
		{
			if(data<head.data)
			{
				newnode.next=head;
				head=newnode;
			}
			Node move=head;
			while(move.next!=null)
			{
				if(data>move.data && data<move.next.data)
				{
					newnode.next=move.next;
					move.next=newnode;
					return;
				}
				move=move.next;
			}
			if(data>move.data)
			{
				move.next=newnode;
			}
		}
	}

	//Sort Linked list
	public void SortLinkedList(Node head)
	{
		Node move=head;
		while(move.next!=null)
		{
			Node tag=move.next;
			while(tag!=null)
			{
				if(move.data>tag.data)
				{
					int temp=move.data;
					move.data=tag.data;
					tag.data=temp;
				}
				tag=tag.next;
			}
			move=move.next;
		}
		display();
	}

	//Railway Reservation system
	public void RailwayReservation()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter node data: ");
		int data=sc.nextInt();
		Node newnode1=new Node(data);
		Node newnode2=new Node(data);
		if(head==null)
		{
			head=newnode1;
		}
		else
		{
			newnode1.next=head;
			head=newnode1;
			Node move=head;
			while(move.next!=null)
			{
				move=move.next;
			}
			move.next=newnode2;
		}
	}
	
	//Reverse Nodes
	public Node ReverseNode(Node head)
	{
		Node prev=null;
		Node current=head;
		Node next;
		while(current!=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head.next=null;
		head=prev;
		return head;
	}
	
	//find nth node from end
	public void FromEndNthData(Node head,int pos)
	{
		int cnt=0;
		Node move=head;
		while(move!=null)
		{
			cnt++;
			move=move.next;
		}
		move=head;
		for(int i=0;i<cnt-pos-1;i++)
		{
			move=move.next;
			System.out.println(move.data);
		}
	}
	
	//segregate list with even no first and odd next of it
	public Node Segregate(Node head)
	{
		Node move=head;
		while(move!=null)
		{
			if(move.data%2==0)
			{
				move=move.next;
			}
		}
		Node current=head;
		while(current!=null)
		{
			if(current.data%2!=0)
			{
				current=current.next;
			}
		}
		return head;

	}
}





