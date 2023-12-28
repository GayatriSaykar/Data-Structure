package SinglyLinkedList1;

public class Node {
	String data;
	Node link;
	public Node()
	{
		data="NA";
		link=null;
	}
	public Node(String data)
	{
		this.data=data;
		this.link=null;
	}
	public String toString()
	{
		return data+" ";
	}
}
