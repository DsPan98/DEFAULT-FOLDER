package LC;

import java.util.ArrayList;
import java.util.List;

/*
 * Given an array A with only 0 and 1s, representing binary numbers;
 * the i-th subarray representing a binary number constituted by
 * all numbers from A[0] to A[i].
 * Another integer is given, in decimal, as the divisor (number used to divide)
 * An boolean array list would be returned, recording if the binary number at i 
 * could be divided.
 */

public class BinaryDivideByDecNum {
	public List<Boolean> prefixesDivBy5(int[] A, int DecDiv) {
    	List<Boolean> forReturnList =new ArrayList<>(A.length);
    	int acc = 0;
    	for (int a : A) {
    		acc = (acc << 1 | a) %  DecDiv;
    		forReturnList.add(acc == 0);
    	}
    	return forReturnList;
    }


}
