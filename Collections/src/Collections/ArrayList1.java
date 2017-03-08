
package Collections;
import java.util.*;
public class ArrayList1 {
	public static void main(String[] args){
		ArrayList<String> al=new ArrayList<String>();  
		  al.add("Ravi");  
		  al.add("a");  
		  al.add("10");
		  al.add(0," m");
		  System.out.println(al);
		 /*// al.add(null)
		  ArrayList<String> al2=new ArrayList<String>();  
		  al2.add("Ravi1");  
		  al2.add("Hanumat");  
		  al.removeAll(al2);
		  System.out.println("after removing the elements of al2...");   
		  */
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  } 
		  }  
		}  

	
	


