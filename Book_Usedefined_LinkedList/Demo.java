package Book_Usedefined_LinkedList;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		int ch;
		Book data;
		int id;
		String bname;
		Scanner sc=new Scanner(System.in);
		BookLinkedList l1=new BookLinkedList();
		do
		{
			System.out.println("1.AddEnd");
			System.out.println("2.AddBeg");
			System.out.println("3.AddMid");
			System.out.println("4.DeleteBeg");
			System.out.println("5.DeleteMid");
			System.out.println("6.DeleteEnd");
			System.out.println("7.Modify");
			System.out.println("8.Display");
			System.out.println("9.Create Sorted Linked List");
			System.out.println("10.size");
			System.out.println("11.Reverse");
			System.out.println("12.AddBoth");
			System.out.println("13.Split");
			System.out.println("14.Merge");
			System.out.println("15.Display position n record");
			System.out.println("16.Display n record from end");
			System.out.println("17.Middle Element");
			System.out.println("Enter your choice: ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:System.out.println("Enter Book Id:");
			       id=sc.nextInt();
			       System.out.println("Enter Book Name:");
			       bname=sc.next();
			       data=new Book(id,bname);
			       l1.addEnd(data);
			       break;
			case 2:System.out.println("Enter Book Id:");
				   id=sc.nextInt();
		           System.out.println("Enter Book Name:");
		           bname=sc.next();
		           data=new Book(id,bname);
		           l1.addBeg(data);
		           break;
			case 3:System.out.println("Enter Book Id:");
			       id=sc.nextInt();
	               System.out.println("Enter Book Name:");
	               bname=sc.next();
	               data=new Book(id,bname);
	               System.out.println("Enter position:");
	               int pos=sc.nextInt();
	               l1.addMid(pos,data);
	           break;
			case 4:
				   l1.deleteBeg();
				   break;
			case 5:
					System.out.println("Enter pos: ");
					pos=sc.nextInt();
					l1.deleteMid(pos);
					break;
			case 6:
					l1.deleteEnd();
					break;
			case 10:int cnt=l1.size();
					System.out.println("Size of linked list is: "+cnt);
					break;
			case 8:System.out.println(l1);
				   break;
			}
		}while(ch!=0);
	}

}
