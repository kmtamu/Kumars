package InterviewPrograms;

import java.util.ArrayList;
import java.util.Scanner;

/*You have got a range of numbers between 1 to N, where one of the number is repeated.
You need to write a program to find out the duplicate number*/

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ArrayList<Integer> myList = new ArrayList<Integer>();
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter 1 to use array, 2 to use hashmap, 3 to use ");
 int choice = Integer.parseInt(sc.nextLine());
	 switch (choice) {
	 case 1:
		 UseArrayList(myList);
	 case 2:
		 UseSet(myList);
	 case 3:
		 Use
	 }
	}

}
