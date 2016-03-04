package InterviewPrograms;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*You have got a range of numbers between 1 to N, where one of the number is repeated.
You need to write a program to find out the duplicate number*/

public class FindDuplicate {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
 ArrayList<Integer> myList = new ArrayList<Integer>();
 for (int i = 0; i<5000; i++){
	 int ran = Random.class.newInstance().nextInt(3000);
	 myList.add(ran);
 }
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter 1 to use arrayList, 2 to use set, 3 to use Boolean with Hashmap");
 int choice = Integer.parseInt(sc.nextLine());
	 switch (choice) {
	 case 1:
		 UseArrayList(myList);
		 break;
	 case 2:
		 UseSet(myList);
		 break;
	 case 3:
		 UseBoolean(myList);
		 break;
	 }
	}
	
	//methods to find duplicates.
	// UseArrayList method
	static void UseArrayList(ArrayList<Integer> myList2){
		Long start = System.currentTimeMillis();
		for (int n=0; n<myList2.size();n++)
		{
			for (int m=n+1; m<myList2.size();m++){
				if( myList2.get(n)== myList2.get(m) ) {System.out.println("Duplicate found "+myList2.get(n));}
			}
		}
		Long End = System.currentTimeMillis();
		System.out.println("Total time taken for executing this code is: " + (End-start));
	}
	// UseSet method
	static void UseSet(ArrayList<Integer> myList){
		System.out.println("hello");
	}
	// UseBooklean method
	static void UseBoolean(ArrayList<Integer> myList){
		System.out.println("hi");
	}
}
