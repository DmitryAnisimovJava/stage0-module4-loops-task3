package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
    	double sum = 0;
    	
    	while(lengthOfLastNumber > 0) {	
    		double k = 0;
    		for(int counter = 0; counter < lengthOfLastNumber; counter++ ) {
    			k = k + Math.pow(10, counter);
    			System.out.println(k);
    		}
    		sum = sum + 9 * k;
    		lengthOfLastNumber--;
    	}
    	System.out.println((int) sum);
    }
}
