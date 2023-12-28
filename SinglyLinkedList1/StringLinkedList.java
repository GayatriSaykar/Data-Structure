package SinglyLinkedList1;

import java.util.Scanner;

public class StringLinkedList {
	Node head;
	public StringLinkedList()
	{
		head=null;
	}
	public void addNode(String data)
	{
		Node record=new Node(data);
		if(head==null)
			head=record;
		else
		{
			Node move;
			for(move=head;move.link!=null;move=move.link);
				move.link=record;
		}
	}
	public void createLinkedList(int size)
	{
		int i;
		String str;
		for(i=1;i<=size;i++)
		{
			System.out.println("Enter string: ");
			Scanner sc=new Scanner(System.in);
			str=sc.next();
			addNode(str);
		}
	}
	public void display()
	{
		Node move;
		for(move=head;move!=null;move=move.link)
		{
			System.out.println(move.data+" ");
		}
	}
}
