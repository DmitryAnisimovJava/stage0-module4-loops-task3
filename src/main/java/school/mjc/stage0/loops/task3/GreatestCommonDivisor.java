package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
    	for(int counter = second; counter > 0; counter--) {
    		if (second % counter == 0 && first % counter == 0) {
				System.out.println(counter);
				break;
			}
    	}
    }
}
