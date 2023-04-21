import java.util.Arrays;

public class StatsCalculator {
    private double [] sortedValues;

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
        this.sortedValues = values;
    }

    /**
     * Sorts the sortedValues array
     */
    public void sortData(){
        Arrays.sort(sortedValues);
    }

    public double calculateMax(){
        double max = sortedValues[sortedValues.length - 1];
        return max;
    }

    public double calculateMin(){
        double min = sortedValues[0];
        return min;
    }

    public double calculateMedian(double[] array){
        double median = 0;
        if(array.length % 2 == 0){
            median = (array[array.length/2] + array[(array.length/2)-1]) / 2;
            return median;
        }
        else{
            median = (sortedValues[sortedValues.length-1]/2);
        }
        return median;
    }

    public double calculateFirstQuartile(){
        double [] firstHalf = new double [sortedValues.length];
        return calculateMedian(firstHalf);
    }

    public double calculateThirdQuartile(){
        double [] secondHalf = new double[sortedValues.length]; //fix this
        return calculateMedian(secondHalf);
    }



}