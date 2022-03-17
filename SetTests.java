/**
 * Tests from the project description
 * @author Peter Decker
 */
public class SetTests {
	public static void main(String[] args) {
		
		long startTime = 0, endTime = 0;
		
		//-----------------------------------------------1.2-------------------------------------------------------//
		
		startTime = System.nanoTime();
		
		ArraySet test1 = new ArraySet(100000);
		for(int i = 0; i < 100000; i++) {
			test1.add(TestData.nextInt());
		}
		
		endTime = System.nanoTime();
		System.out.println("ArraySet Test 1 Average elapsed time " + (endTime - startTime)/100000 + " nanoseconds");
		
		//-----------------------------------------------1.3-------------------------------------------------------//
		
		startTime = System.nanoTime();
		
		for(int i = 0; i < 20000; i++) {
			test1.remove(TestData.nextInt());
		}
		
		endTime = System.nanoTime();
		System.out.println("ArraySet Test 2 Average elapsed time " + (endTime - startTime)/20000 + " nanoseconds");
		
		//-----------------------------------------------1.4-------------------------------------------------------//
		startTime = System.nanoTime();
		
		for(int i = 0; i < 20000; i++) {
			test1.contains(TestData.nextInt());
		}
		
		endTime = System.nanoTime();
		System.out.println("ArraySet Test 3 Average elapsed time " + (endTime - startTime)/20000 + " nanoseconds");
		
		System.gc();//1.5//
		
		
		//-----------------------------------------------2.2-------------------------------------------------------//
		
		startTime = System.nanoTime();
		
		LinkedSet test2 = new LinkedSet();
		for(int i = 0; i < 100000; i++) {
			test2.add(TestData.nextInt());
		}
		
		endTime = System.nanoTime();
		System.out.println("LinkedSet Test 1 Average elapsed time " + (endTime - startTime)/100000 + " nanoseconds");
		
		//-----------------------------------------------2.3-------------------------------------------------------//
		
		startTime = System.nanoTime();
		
		for(int i = 0; i < 20000; i++) {
			test2.remove(TestData.nextInt());
		}
		
		endTime = System.nanoTime();
		System.out.println("LinkedSet Test 2 Average elapsed time " + (endTime - startTime)/20000 + " nanoseconds");
		
		//-----------------------------------------------2.4-------------------------------------------------------//
		startTime = System.nanoTime();
		
		for(int i = 0; i < 20000; i++) {
			test2.contains(TestData.nextInt());
		}
		
		endTime = System.nanoTime();
		System.out.println("LinkedSet Test 3 Average elapsed time " + (endTime - startTime)/20000 + " nanoseconds");
		
		System.gc();//2.5//
		
		
		//-----------------------------------------------3.2-------------------------------------------------------//
		
		startTime = System.nanoTime();
		
		HeuristicSet test3 = new HeuristicSet();
		for(int i = 0; i < 100000; i++) {
			test3.add(TestData.nextInt());
		}
		
		endTime = System.nanoTime();
		System.out.println("HeuristicSet Test 1 Average elapsed time " + (endTime - startTime)/100000 + " nanoseconds");
		
		//-----------------------------------------------3.3-------------------------------------------------------//
		
		startTime = System.nanoTime();
		
		for(int i = 0; i < 20000; i++) {
			test3.remove(TestData.nextInt());
		}
		
		endTime = System.nanoTime();
		System.out.println("HeuristicSet Test 2 Average elapsed time " + (endTime - startTime)/20000 + " nanoseconds");
		
		//-----------------------------------------------3.4-------------------------------------------------------//
		startTime = System.nanoTime();
		
		for(int i = 0; i < 20000; i++) {
			test3.contains(TestData.nextInt());
		}
		
		endTime = System.nanoTime();
		System.out.println("HeuristicSet Test 3 Average elapsed time " + (endTime - startTime)/20000 + " nanoseconds");
		
		System.gc();//3.5//
	}
}
