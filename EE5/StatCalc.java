package EE5;

import java.util.*;

public class StatCalc {

	private int count;   // Number of numbers that have been entered.
    private double sum;  // The sum of all the items that have been entered.
    private double squareSum;  // The sum of the squares of all the items.
    private double min = 0; // min of all numbers entered
    private double max = 0; // max of all numbers entered

    /**
     * Add a number to the dataset.  The statistics will be computed for all
     * the numbers that have been added to the dataset using this method.
     */
    public void enter(double num) {
        count++;
        sum += num;
        squareSum += num*num;
        if (num>max || max == 0) {
        	max = num;
        }
        if (num<min || min == 0) {
        	min = num;
        }
    }

    /**
     * Return the number of items that have been entered into the dataset.
     */
    public int getCount() {
        return count;
    }

    /**
     * Return the sum of all the numbers that have been entered.
     */
    public double getSum() {
        return sum;
    }
    
    /**
     *Return the maximum of all the numbers that have been entered.
     */
    public double getMax() {
    	return max;
    }
    
    /**
     * Return the minimum of all numbers that have been entered.
     */
    public double getMin() {
    	return min;
    }

    /**
     * Return the average of all the items that have been entered.
     * The return value is Double.NaN if no numbers have been entered.
     */
    public double getMean() {
        return sum / count;  
    }

    /**
     * Return the standard deviation of all the items that have been entered.
     * The return value is Double.NaN if no numbers have been entered.
     */
    public double getStandardDeviation() {  
        double mean = getMean();
        return Math.sqrt( squareSum/count - mean*mean );
    }

 // end class StatCalc

	public static void main(String[] args) {
		StatCalc calc = new StatCalc();
		
		double sc = 1;
		
		while (sc!=0) {
			Scanner scan = new Scanner(System.in);
			sc = scan.nextDouble();
			calc.enter(sc);
		}
		
		System.out.println(calc.getMean());
		System.out.println(calc.getStandardDeviation());
		System.out.println(calc.getCount());
		System.out.println(calc.getMax());
		System.out.println(calc.getMin());
		System.out.println(calc.getSum());

	}

}
