package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
    	double result;
    	for(int fibonacciCounter = 0; fibonacciCounter < lastFibonacci; fibonacciCounter++) {
    		result = ((Math.pow((1 + Math.sqrt(5))/2, fibonacciCounter)) - 
    				(Math.pow((1 - Math.sqrt(5))/2, fibonacciCounter))) / Math.sqrt(5);
    		System.out.println((int) result);
    	}
    }
}
