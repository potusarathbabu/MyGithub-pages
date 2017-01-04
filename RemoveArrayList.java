import java.util.ArrayList;
import java.util.ListIterator;

public class RemoveArrayList {
	
		public static void main(String[] args) {
		   
		    //create an object of ArrayList
		    ArrayList aList = new ArrayList();
		   
		    //Add elements to ArrayList object
		    aList.add("1");
		    aList.add("2");
		    aList.add("3");
		    aList.add("4");
		    aList.add("5");
		   
		    //Get an object of ListIterator using listIterator() method
		    ListIterator listIterator = aList.listIterator();
		 
		    /*
		      Use void remove() method of ListIterator to remove an element from List.
		      It removes the last element returned by next or previous methods.
		      Please note that, remove method removes the element from underlying list.
		    */
		   
		    listIterator.next();
		    listIterator.next();
		   
		    //remove element returned by last next method
		    listIterator.remove();
		    /*
		      Remove method can throw UnsupportedOperationException if remove operation
		      is not supported by this ListIterator.
		     
		      In addition to that, it can also throw IllegalStateException if remove is
		      called before call of neither previous nor next methods or after the last
		      call of next or previous methods.
		    */
		   
		   
		    System.out.println("After removing 2, ArrayList contains");
		    for(int intIndex = 0; intIndex < aList.size(); intIndex++)
		      System.out.println(aList.get(intIndex));
		   
		 
		  
		}

}
