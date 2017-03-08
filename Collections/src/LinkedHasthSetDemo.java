import java.util.LinkedHashSet;

public class LinkedHasthSetDemo {
	public static void main(String[] args){
		LinkedHashSet h= new LinkedHashSet();
		h.add("a");
		h.add("b");
		h.add("c");
		h.add("z");
		h.add(null);
		h.add(10);
			System.out.println(h.add("z"));;
			System.out.println(h);
	}

}
