package LC;

import java.util.ArrayList;
import java.util.List;

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
