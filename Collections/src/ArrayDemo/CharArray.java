package ArrayDemo;

public class CharArray {
	public static  void main(String[] args){
		String s1="this is a good";
		
		String s2="156";
		System.out.println(s1.toCharArray());
		System.out.println(s2.replace("1 5 6"," 651"));
		System.out.println(s1.equals(s2));
		System.out.println(s1.substring(0,3));
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.lastIndexOf('i'));
		System.out.println(s1.charAt(10));
		System.out.println(s1.length());
		System.out.println(s1.concat(" "+s2));
		System.out.println(s1.replaceAll(s2, s1));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.trim());
		System.out.println(s1.compareTo(s2));
		
	}

}
