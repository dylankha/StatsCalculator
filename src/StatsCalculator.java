import java.util.Arrays;

public class StatsCalculator {
    private double [] sortedValues;
    private double [] values;

    /**
     *  default constructor makes an array of size 20 full of 0s
     */
    public StatsCalculator(){
        this.sortedValues = new double[20];
    }

    /**
     * Overloaded constructor that sets instance variable equal to the parameter
     * @param values
     */
    public StatsCalculator(double[] values){
        this.values = values;
        this.sortedValues = values;
    }

    /**
     * Sorts the sortedValues array
     */
    public void sortData(){
        Arrays.sort(sortedValues);
    }

    /**
     * Calculates the maximum value of the sortedValues array
     * @return max
     */
    public double calculateMax(){
        double max = sortedValues[sortedValues.length - 1];
        return max;
    }

    /**
     * Calculates the minimum value of the sortedValues array
     * @return min
     */
    public double calculateMin(){
        double min = sortedValues[0];
        return min;
    }

    /**
     * Calculates the first quartile of the sortedValues array by running the calculateMedian method on
     * the first half of the array
     * @return the first Quartile
     */
    public double calculateFirstQuartile() {
        double[] firstHalf = new double[sortedValues.length / 2];
        System.arraycopy(sortedValues, 0, firstHalf, 0, firstHalf.length);
        return calculateMedian(firstHalf);
    }

    /**
     * Calculates the third quartile of the sortedValues array by calling the calculateMedian method on
     * the second half of the data
     * @return
     */
    public double calculateThirdQuartile() {
        double[] secondHalf = new double[sortedValues.length / 2];
        System.arraycopy(sortedValues, sortedValues.length / 2, secondHalf, 0, secondHalf.length);
        return calculateMedian(secondHalf);
    }

    /**
     * Calculates the median of an array. If the array has an even number of data points, the median is
     * the average of the two middle data points. Otherwise, it returns the middle data point.
     * @param array
     * @return the median of the data set
     */
    public double calculateMedian(double[] array) {
        double median = 0;
        if(array.length % 2 == 0) {
            median = (array[array.length / 2] + array[array.length / 2 - 1]) / 2;
        } else {
            median = array[array.length / 2];
        }
        return median;
    }

    /**
     * Calculates the sum of all data points in an array by adding each value to the variable sum.
     * @param array
     * @return the sum of all data points
     */
    public double calculateSum(double[] array){
        double sum = 0;
        for (double v : array){
            sum += v;
        }
        return sum;
    }

    /**
     * Calculates the sum of all data points and returns the average of all data points in the array
     * @return the average value of all data pointes
     */
    public double calculateMean(){
        double sum = 0;
        for (double v : values){
            sum += v;
        }
        return sum / sortedValues.length;
    }

    /**
     * Prints out the data iteratively.
     */
    public void print(){
        System.out.println("Your data is: ");
        for (int i = 0; i < values.length; i++ ){
            System.out.print(values[i] + " ");
        }
    }

    /**
     * Prints out the sorted data iteratively.
     */
    public void printSorted(){
        System.out.println("Your sorted data is: ");
        for (int i = 0; i < sortedValues.length; i++){
            System.out.print(sortedValues[i] + " ");
        }
    }

    /**
     * Prints out the five number summary of a data set, using needed methods.
     */
    public void printFiveNumberSummary() {
        System.out.println();
        System.out.println("Five Number Summary");
        System.out.println("Min: " + calculateMin());
        System.out.println("First Quartile: " + calculateFirstQuartile());
        System.out.println("Median: " + calculateMedian(sortedValues));
        System.out.println("Third Quartile: " + calculateThirdQuartile());
        System.out.println("Max: " + calculateMax());
    }



}