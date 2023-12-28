package SinglyLinkedList2;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		String data = null;
		int ch,size=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=sc.nextInt();
		StringLinkedList l1=new StringLinkedList();
		l1.createLinkedList(n);
		do
		{
			System.out.println();
			System.out.println("1.addNode");
			System.out.println("2.addBeg");
			System.out.println("3.addEnd");
			System.out.println("4.contains");
			System.out.println("5.Search");
			System.out.println("6.Size");
			System.out.println("7.modifyByString");
			System.out.println("8.modifyByIndex");
			System.out.println("9.display");
			System.out.println("10.searchbyIndex");
			System.out.println("0.Exit");
			System.out.println("Enter your choice:");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter data: ");
			    data=sc.next();
				l1.addNode(data);
				break;
			case 2:
				System.out.println("Enter data: ");
				data=sc.next();
				l1.addBeg(data);
				break;
			case 3:
				System.out.println("Enter data: ");
				data=sc.next();
				l1.addEnd(data);
				break;
			case 4:
				System.out.println("Enter data: ");
				String key=sc.next();
				System.out.println(l1.contains(key));
				
				break;
			case 5:
				System.out.println("Enter data: ");
				key=sc.next();
				l1.Search(data, key);
				break;
			case 6:
				size=l1.Size();
				System.out.println("The size of linked list is: "+size);
				break;
			case 7:
				System.out.println("Enter data: ");
				data=sc.next();
				System.out.println("Enter newdata: ");
				String newdata=sc.next();
				l1.modifyByString(data, newdata);
				break;
			case 8:
				System.out.println("Enter position: ");
				int pos=sc.nextInt();
				System.out.println("Enter newdata: ");
				newdata=sc.next();
				l1.modifyByIndex(pos, data, newdata);
				break;
			case 9:
				System.out.println("The linked list is: ");
				l1.display();
				break;
			case 10:
				System.out.println("Enter position");
				pos=sc.nextInt();
				System.out.println(l1.searchbyIndex(pos));
			}
		}while(ch!=0);
		
	}

}
