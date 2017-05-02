package Collections;
import java.io.IOException;

public class ThrowsKeyword {

	void m() throws IOException {
		throw new IOException("device error");// checked exception
	}

	void n() throws IOException {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) throws IOException {
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.m();
		System.out.println("normal flow...");
	}

}
