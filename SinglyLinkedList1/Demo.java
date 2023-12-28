package SinglyLinkedList1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		StringLinkedList l1=new StringLinkedList();
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n: ");
		n=sc.nextInt();
		l1.createLinkedList(n);
		l1.display();
		
	}

}
