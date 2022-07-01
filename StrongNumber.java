package isStrongNumber;

import java.util.ArrayList;
import java.util.List;

public class StrongNumber {

	public static void main(String[] args) {

		System.out.println(isStrongNumber(1));//==> return "STRONG!!!!"
		System.out.println(isStrongNumber(123));//==> return "Not Strong !!"
		System.out.println(isStrongNumber(2));//==>  return "STRONG!!!!"
		System.out.println(isStrongNumber(150));//==> return "Not Strong !!"
		System.out.println(isStrongNumber(145));//==> return "Strong !!"

	}
	
    public static String isStrongNumber(int num) {
    	
    	List<Integer> numList=new ArrayList<Integer>();
    	int i=num;
    	while(i>0) {
    		
    		numList.add(factorial(i%10));
    		i/=10;
    	}
    	
        return numList.stream().reduce(0, (Integer::sum))==num?"STRONG!!!!":"Not Strong !!";
    }
    
    public static int factorial (int num) {
    	
    	if(num==0) {
    		return 1;
    	}
    	
    	else {
    		
    		return num*factorial(num-1);
    	}
    }
}
