
public class Distance {

	public static void main(String args[]) {
		int lightspeed;
		long days;
		long seconds;
		long distance;
		lightspeed = 18600;
		days = 1000;
		seconds = days * 24 * 60 * 60;
		distance = lightspeed * seconds;
		System.out.println("No of days=" + days);
		System.out.println("days light will travrel about");
		System.out.println(distance + "miles");
	}

}
