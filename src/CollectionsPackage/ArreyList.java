package CollectionsPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class ArreyList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[3];
		int sizeOftheArray = a.length;
		System.out.println("<--------------------------static Array-------------------------->");
		System.out.println("Size of an array----->" + sizeOftheArray);
		a[0] = 4;
		a[1] = 5;
		a[2] = 7;
		// System.out.println(a[1]);
		for (int i = 0; i < sizeOftheArray; i++)
			System.out.println(a[i]);

		System.out.println("<---------------------Dynamic Array---------------------------->");
		ArrayList arrayList = new ArrayList();
		arrayList.add(30);
		arrayList.add(arrayList);
		arrayList.add("Saranya");
		arrayList.add('c');
		int sizeOfArrayList = arrayList.size();

		System.out.println("Size of arrayList---->" + sizeOfArrayList);
		System.out.println("printing object of ArrayList ---> " + arrayList);

		System.out.println("using for loop for dynamic array");
		System.out.println("arrayList wit out for-->" + arrayList);
		System.out.println("----------------arrayList with for-----------------");
		for (int i = 0; i < sizeOfArrayList; i++)
			System.out.println(arrayList.get(i));

		System.out.println("<-----------------------Using IntegerList----------------------------->");
		ArrayList<Integer> arrayListInterger = new ArrayList<Integer>();
		arrayListInterger.add(1);
		arrayListInterger.add(2);
		arrayListInterger.add(3);
		arrayListInterger.add(4);
		int sizeOfArrayListInteger = arrayListInterger.size();
		System.out.println("Size of Array list integer--->" + sizeOfArrayListInteger);
		System.out.println("Array list integer--->" + arrayListInterger);
		System.out.println("integerlist with for");
		for (int i = 0; i < sizeOfArrayListInteger; i++)
			System.out.println(arrayListInterger.get(i));

		System.out.println("<-----------------------Using StringList----------------------------->");
		ArrayList<String> arrayListString = new ArrayList<String>();
		arrayListString.add("One");
		arrayListString.add("Two");
		arrayListString.add("Three");
		arrayListString.add("Four");
		int sizeOfArrayListString = arrayListString.size();
		System.out.println("Size of Array list String--->" + sizeOfArrayListString);
		System.out.println("Array list String--->" + arrayListString);
		System.out.println("StringList with for");
		for (int i = 0; i < sizeOfArrayListString; i++)
			System.out.println(arrayListString.get(i));

		System.out.println("<-----------------------Using object----------------------------->");

		Employee e1 = new Employee(12, "Saranya", 1000);
		Employee e2 = new Employee(13, "Vignesg", 2000);
		Employee e3 = new Employee(14, "Haradeep", 3000);
		ArrayList<Employee> arrayListEmployeeObject = new ArrayList<Employee>();
		System.out.println("ArrayList objects");
		arrayListEmployeeObject.add(e1);
		arrayListEmployeeObject.add(e2);
		arrayListEmployeeObject.add(e3);
		System.out.println(arrayListEmployeeObject.size());
		Employee Empobj = null;
		for (int i = 0; i < arrayListEmployeeObject.size(); i++) {
			Empobj = arrayListEmployeeObject.get(i);
			System.out.println("printing arrayListEmployeeObject using for");
			System.out.println(Empobj.age);
			System.out.println(Empobj.name);
			System.out.println(Empobj.ssn);
		}
		Iterator<Employee> it = arrayListEmployeeObject.iterator();
		Employee Empobj1 = null;
		System.out.println("printing arrayListEmployeeObject using Itrator");
		while (it.hasNext()) {

			Empobj1 = it.next();
			System.out.println(Empobj1.age);
			System.out.println(Empobj1.name);
			System.out.println(Empobj1.ssn);
			//System.out.println(arrayListEmployeeObject);
			
			}
		
		System.out.println("---------------Add all--------------");
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("One");
		al1.add("Two");
		al1.add("Three");
		al1.add("Four");
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("five");
		al2.add("six");
		al2.add("seven");
		al2.add("Eight");
		al1.addAll(al2);
		
		
		for (int i = 0; i < al1.size(); i++)
			System.out.println(al1.get(i));
		
		
		System.out.println("---------------remove all--------------");
		al1.removeAll(al2);
		for (int i = 0; i < al1.size(); i++)
			System.out.println(al1.get(i));
		
		
		System.out.println("---------------retain all--------------");
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("Selenium");
		al3.add("java");
		al3.add("test");
		al3.add("Four");
		ArrayList<String> al4 = new ArrayList<String>();
		al4.add("qTP");
		al4.add("test");
		al4.add("Three");
		al4.add("Four");
		
		al3.retainAll(al4);
		for (int i = 0; i < al3.size(); i++)
			System.out.println(al3.get(i));
		
		
	}

}
