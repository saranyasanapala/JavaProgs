package CollectionsPackage;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Selenium");
		ll.add("QTP");
		ll.add("FTP");
		System.out.println(ll);
		
		
		ll.addFirst("one");
		ll.addLast("last");
		System.out.println(ll);
		System.out.println(ll.get(0));
		ll.set(0, "First");
		
		System.out.println(ll.get(0));
		ll.removeFirst();
		
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		ll.remove(0);
		System.out.println(ll);
		//Itrator
		System.out.println("*******Using Itrator**********");
		Iterator it=ll.iterator();
		while(it.hasNext()) {
			Object stringItrator = it.next();
			System.out.println(stringItrator);
		}
		System.out.println("*************Using for*************");
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		System.out.println("*************Using Advanced for*************");
		for(String s:ll) {
			System.out.println(s);
		}
		System.out.println("*************Using While*************");
		int i=0;
		while (ll.size()>i) {
			System.out.println(ll.get(i));
			i++;
			
			
		}

	}

}
