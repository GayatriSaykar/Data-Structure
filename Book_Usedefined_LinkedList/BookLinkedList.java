package Book_Usedefined_LinkedList;

public class BookLinkedList {
	private Node head;
	public BookLinkedList()
	{
		head=null;
	}
	public Node getHead() {
		return head;
	}
	
	public String toString()
	{
		System.out.println();
		String str=" ";
		Node move=head;
		while(move!=null)
		{
			str=str+move.getData();
			move=move.getNext();
		}

		System.out.println();
		return str;
	}
	
	public void addEnd(Book data)
	{
		Node newnode=new Node(data);
		Node move=head;
		if(head==null)
			head=newnode;
		else
		{
			while(move.getNext()!=null)
			{
				move=move.getNext();
			}
			move.setNext(newnode);
		}
	}
	
	public void addBeg(Book data)
	{
		Node newnode=new Node(data);
		Node move=head;
		if(head==null)
		{
			head=newnode;
		}
		else
		{
			newnode.setNext(move);
			head=newnode;
		}
	}
	
	public int size()
	{
		int length=0;
		Node move=head;
		while(move!=null)
		{
			length++;
			move=move.getNext();
		}
		return length;
	}
	
	public void addMid(int pos,Book data)
	{
		Node newnode=new Node(data);
		Node move=head;
		int cnt=size();
		if(pos>0 && pos<=cnt+1)
		{
			if(pos==1)
			{
				if(head==null)
					head=newnode;
				else
				{
					newnode.setNext(move);
					head=newnode;
				}
			}
			else
			{
				for(int i=1;i<pos-1;i++)
				{
					move=move.getNext();
				}
				newnode.setNext(move.getNext());
				move.setNext(newnode);
			}
		}
		else
		{
			System.out.println("Invalid Position");
		}
	}
	
	public void deleteBeg()
	{
		if(head==null)
		{
			System.out.println("Linked is empty");
		}
		else
		{
			Node dele=head;
			head=dele.getNext();
			dele=null;
		}
	}
	
	public void deleteEnd()
	{
		if(head==null)
		{
			System.out.println("Linked list is empty");
		}
		else
		{
			Node move=head;
			while(move.getNext().getNext()!=null)
			{
				move=move.getNext();
			}
			Node del=move.getNext();
			move.setNext(del.getNext());
			del=null;
		}
	}
	
	public void deleteMid(int pos)
	{
		Node del;
		if(pos==1)
	 	{ 
		 
		 del=head;
		 head=head.getNext();
	 	 del=null;
	 	}
	else
	{
		Node move=head;
		for(int i=1;i<pos-1;i++)
		{
			move=move.getNext();
		}
		del=move.getNext();
		move.setNext(del.getNext());
		del=null;
	}
	}
	
//	public void display()
//	{
//		Node move=head;
//		while(move!=null)
//		{
//			System.out.println(move.data);
//			move=move.next;
//		}
//	}
//	
	
	
}
