package OperationLinkedList;

public class Node {
	int data;
	Node next;
	public Node()
	{
		data=3;
		next=null;
	}
	public Node(int data)
	{
		this.data=data;
		this.next=null;
	}
	public String toString()
	{
		return data+" ";
	}

}
