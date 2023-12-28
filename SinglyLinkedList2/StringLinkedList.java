package SinglyLinkedList2;

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
	
	
	public void createLinkedList(int n)
	{
		Scanner sc=new Scanner(System.in);
		int i;
		for(i=1;i<=n;i++)
		{
			System.out.println("Enter str: ");
			String str=sc.next();
			addNode(str);
		}
	}
	
	public void addBeg(String data)
	{
		Node newnode=new Node(data);
		Node move=head;
		if(head==null)
		{
			head=newnode;
		}
		else
		{
			newnode.link=head;
			head=newnode;
		}
	}
	
	public void addEnd(String data)
	{
		Node record=new Node(data);
		Node move=head;
		if(head==null)
			head=record;
		else
		{
			while(move.link!=null)
			{
				move=move.link;
			}
			move.link=record;
		}
	}
	
	public boolean contains(String s)
	{
		Node move=head;
		boolean flag=false;
		for(;move!=null;move=move.link)
		{
			if(move.data.equals(s))
			{
				flag=true;
				break;
			}
		}
		return flag;
	}
	
	public int Size()
	{
		int size=0;
		Node move;
		for(move=head;move!=null;move=move.link)
		{
			size++;
		}
		return size;
	}
	
	public void Search(String data,String key)
	{
		Node move=head;
		int i=1;
		boolean flag=false;
		while(move!=null)
		{
			if(move.data.equals(key))
			{
				flag=true;
				break;
			}
			i++;
			move=move.link;
		}
		if(flag)
		{
			System.out.println("Key "+key+ " is present at "+i+"position");
		}
		else
		{
			System.out.println("Key "+key+ " is not present");
		}
	}
	
	public void modifyByString(String data,String newdata)
	{
		Node move;
		for(move=head;move!=null;move=move.link)
		{
			if(move.data.equals(data))
			{
				move.data=newdata;
				break;
			}
		}
	}
	
	public void modifyByIndex(int index,String data,String newdata)
	{
		if(index<=0 || index>Size())
		{
			System.out.println("Out of size");
		}
		else
		{
			Node move=head;
			for(int i=1;i<index;i++)
				move=move.link;
			move.data=newdata;
		}
	}

	public void display()
	{
		Node move=head;
		while(move!=null)
		{
			System.out.print(move.data+" ");
			move=move.link;
		}
	}

	public Node searchbyIndex(int pos)
	{
		Node move=head;
		if(pos<=0 || pos>Size()+1)
		{
			return null;
		}
		
		for(int i=1;i<pos;i++)
		{
			move=move.link;
		}
		return head;
	}
	
}
