package practiceJAVA;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(30);
		list1.add(60);
		list1.add(50);
		list1.add(20);
		System.out.println(list1);
		
		LinkedList<Integer> list2 = new LinkedList<>();
		list2.add(10);
		list2.add(30);
		list2.add(60);
		list2.add(50);
		list2.add(20);
		System.out.println(list2);
	}

}
