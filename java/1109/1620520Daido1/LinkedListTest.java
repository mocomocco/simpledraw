import java.util.*;

public class LinkedListTest{

    public static void main(String[] args){
	LinkedList<String> list =new LinkedList<String>();

	String name1="ALICE";
	String name2="BOB";

	list.add(name1);
	list.add(name2);

	String firstname=list.getFirst();
	String secondname=list.get(1);

	System.out.println("listの要素数は"+list.size());
	System.out.println("最初の要素は"+firstname+"2番目の要素は"+secondname);

	String name3="CINDY";
	String name4 = "DAVE";

	list.add(name3);
	list.remove(name1);
	list.addFirst(name4);


	System.out.println("要素の走査");
	String[] array=new String[list.size()];
	list.toArray(array);
	for(String st:array){
	    System.out.println(st);
	}

    }
}
