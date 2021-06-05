// Class to test methods of LinkedIntList class

public class ListTest {
	
	    public static void main(String[] args) {
	     

	        LinkedIntList list = new LinkedIntList();
	        processList(list);
	    }

	    public static void processList(LinkedIntList list) {
	        list.add(20);
	        list.add(73);
	        list.add(111);
	        list.add(7);
//	        System.out.println(list);
	        System.out.println(list.toString());
	        list.remove(1);
	        System.out.println(list);
	        System.out.println(list.isSorted());
	        
	        
	    }
	}
