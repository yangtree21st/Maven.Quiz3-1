package rocks.zipcode.io.quiz3.arrays;

import static java.lang.Math.pow;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    /**
     * Given two shuffled arrays `inputArray`, and `squareValues`,
     * ensure each `element` of `inputArray` has a corresponding `value` in `squaredValues`
     * such that `element == value*value`
     *
     * @param inputArray    an array of integers
     * @param squaredValues an array of integers
     * @return true if each `inputArray[i]` has a corresponding `squaredValues[j]` such that `squaredValues[j] == inputArray[i] * inputArray[i]`
     */
    public static Boolean compare(Integer[] inputArray, Integer[] squaredValues) {
        if(inputArray.length == squaredValues.length){
            for(int i =0; i < inputArray.length; i++){
                for( int j = 0; j < squaredValues.length;j++){
                    if (pow(inputArray[i], 2) == squaredValues[j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
