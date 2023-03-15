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

    public void calculateMedian(){
        if(sortedValues.length % 2 == 0){

        }
        else{

        }
    }




}