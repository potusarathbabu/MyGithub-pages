package Collections;
import java.util.*;  
	public class HashMapExample {  
	   public static void main(String args[]) {  
  
	   HashMap<Integer, String> map = new HashMap<Integer, String>();           
	   map.put(101,"java");  
	   map.put(102, "Operating System");  
	   map.put(103, "Networking");  
	   System.out.println(map);    
	  System.out.println(map.keySet());
	  System.out.println(map.values());
	   map.remove(102);  
	   System.out.println("Values after remove: "+ map);  
	      
	}  

}
