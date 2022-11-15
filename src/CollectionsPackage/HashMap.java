package CollectionsPackage;

import java.util.Map.Entry;

public class HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.HashMap<Integer, String> hmap = new java.util.HashMap<>();
		hmap.put(1, "one");
		hmap.put(2, "Two");
		hmap.put(3, "Three");
		hmap.put(4, "Four");
		hmap.put(5, "Five");
		hmap.put(6, "Six");
		System.out.println("*********Printing Hmap Objext**********");
		System.out.println(hmap);

		System.out.println("**************using get by index*****************");
		System.out.println(hmap.get(1));
		System.out.println(hmap.get(10));
		System.out.println("*******Printing For each **************");

		for (Entry m : hmap.entrySet()) {
			System.out.println(m.getKey());

		}
		java.util.HashMap<Integer, Employee> hmap1=new java.util.HashMap<>();
		Employee e1 = new Employee(12, "Saranya", 1000);
		Employee e2 = new Employee(13, "Vignesg", 2000);
		Employee e3 = new Employee(14, "Haradeep", 3000);
		System.out.println(hmap1);

		hmap1.put(1, e1);
		hmap1.put(2, e2);
		hmap1.put(3, e3);
		System.out.println(hmap1);
		System.out.println("*******************for loop ***********");
		for(Entry m:hmap1.entrySet()) {
			//System.out.println(m.getKey());
			//System.out.println(m.getValue());
			int key=(int) m.getKey();
			Employee e=(Employee) m.getValue();
			System.out.println("Employee info----->"+key);
			System.out.println(e.name+"********"+e.age+"*****"+e.ssn);		
		}
	}

}
