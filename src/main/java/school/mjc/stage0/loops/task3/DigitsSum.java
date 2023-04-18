package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
    	t = t >= 0 ? t : -t;
    	String lengthtOft = t + "";
    	int sum = 0;
    	for(int counter = 1; counter <= lengthtOft.length(); counter++) {
    		sum = sum + t % (10);
    		t = t / 10;
    	}
    	System.out.println(sum);
    }
}
