package OperationLinkedList;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Node head=null;
		Scanner sc=new Scanner(System.in);
		int n,data;
		System.out.println("Enter n: ");
		n=sc.nextInt();
		System.out.println("Enter first linked list: ");
		SinglyLinkedList l1=new SinglyLinkedList();
		l1.createLinkedList(n);
		System.out.println();
		SinglyLinkedList l2=new SinglyLinkedList();
//		System.out.println("Enter second linked list: ");
		//	l2.createLinkedList(n);
		int ch;
		do
		{
			System.out.println();
			System.out.println("1.Add");
			System.out.println("2.Display");
			System.out.println("3.Sort");
			System.out.println("4.Reverse");
			System.out.println("5.Split");
			System.out.println("6.Merge");
			System.out.println("7.Middle");
			System.out.println("8.Sortwhencreation");
			System.out.println("9.Railway Reservation");
			System.out.println("10.Reverse Nodes");
			System.out.println("11.FromEndNthNode");
			System.out.println("12.Segregate even and odd");
			System.out.println("0.Exit");
			System.out.println("Enter your choice: ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1: 
				System.out.println("Enter node data: ");
				data=sc.nextInt();
				l1.addNode(data);
				break;
			case 2:
				System.out.println("The linked list is:");
				l1.display();
				break;
			case 3: 
				System.out.println("The sorted linked list is:");
				l1.SortLinkedList(l1.head);
				break;
			case 4: 
				System.out.println("The reverse linked list is:");
				l1.Reverse(l1.head);
				break;
			case 5:
				System.out.println("After spliting linked list are:");
				l1.SplitLink();
				break;
			case 6: 
				l1.Merge(l2.head);
				break;
			case 7: 
				l1.Middle(l1.head);
				break;
			case 8: 
				System.out.println("Enter node data: ");
				data=sc.nextInt();
				l1.sort(data);
				break;
			case 9: 
				l1.RailwayReservation();
				break;
			case 10: 
				System.out.println("The reverse linked list is:");
				l1.head=l1.ReverseNode(l1.head);
				l1.display();
				break;
			case 11:
				System.out.println("Enter position: ");
				int pos=sc.nextInt();
				l1.FromEndNthData(l1.head,pos);
				break;
			case 12:
				l1.head=l1.Segregate(l1.head);
				l1.display();
			}
		}while(ch!=0);


	}

}





















































