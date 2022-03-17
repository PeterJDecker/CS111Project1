import java.util.Random;

public class TestData {
	private static final Random RNG = new Random();
	
	public static int nextInt() {
		return (int) Math.abs(RNG.nextGaussian() * 1000);
	}
}
