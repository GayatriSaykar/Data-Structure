package SinglyLinkedList2;

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
	public String toStrin()
	{
		return data+" ";
	}
}
