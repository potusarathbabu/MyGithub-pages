import java.util.*;

public class HashSetDemo {
	public static void main(String[] args){
		HashSet h=new HashSet();
		h.add("b");
		h.add("b");
		h.add("d");
		h.add("z");
		h.add("s");
		h.add("l");
		h.add("v");
		h.add(null);
		h.add(10);
		System.out.println(h.add("z"));
		System.out.println(h);
	}

}
