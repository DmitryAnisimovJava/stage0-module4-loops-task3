package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
    	for (int counter = firstBoarder + 1 ; secondBoarder >= counter; counter++) {
    			firstBoarder = counter + firstBoarder;
    	}
    	System.out.println(firstBoarder);
    }
}
